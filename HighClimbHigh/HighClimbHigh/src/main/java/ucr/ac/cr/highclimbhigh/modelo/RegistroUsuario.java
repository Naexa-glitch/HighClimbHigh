/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author nashl
 */
public class RegistroUsuario {
    
        private ArrayList<Usuario> listaUsuarios;
        private JSONObject baseJSONUsuario;
        private File archivoUsuario;

    public RegistroUsuario() {
        
        listaUsuarios = new ArrayList<>();
        archivoUsuario = new File("usuarios.json");
        leerJSON();
        
    }//Fin de constructor
    
    public void registrarJSON(){
    
        JSONArray arregloUsuarios = new JSONArray();
        
        this.baseJSONUsuario = new JSONObject();
        
        for(Usuario usuario : listaUsuarios){
            JSONObject objJSONUsuario = new JSONObject();
            objJSONUsuario.put("Nombre", usuario.getNombre());
            objJSONUsuario.put("Nivel", usuario.getNivel());
            
            arregloUsuarios.add(objJSONUsuario);
        }
        
        baseJSONUsuario.put("listaUsuarios", arregloUsuarios);
        
        try{
        
            FileWriter escritorArchivo = new FileWriter(archivoUsuario);
            escritorArchivo.write(baseJSONUsuario.toJSONString());
            escritorArchivo.flush();
            escritorArchivo.close();
            
        }catch(IOException ex){
        
            System.err.println("No ha sido posible escribir el archivo");
            
        }
    }//Fin de metodo registrarJSON
       
    public void leerJSON(){
    
        listaUsuarios = new ArrayList<>();
        JSONParser convertidor = new JSONParser();
        try{
        
            FileReader lectorArchivo = new FileReader(this.archivoUsuario);
            Object objeto = convertidor.parse(lectorArchivo);
            baseJSONUsuario = (JSONObject) objeto;
            
            JSONArray arregloJSONUsuario = (JSONArray) baseJSONUsuario.get("listaUsuarios");
            
            for(Object obj : arregloJSONUsuario){
                
                JSONObject objUsuario = (JSONObject) obj;
                Usuario usuario = new Usuario();
                usuario.setNombre(objUsuario.get("Nombre").toString());
                usuario.setNivel(Integer.parseInt(objUsuario.get("Nivel").toString()));
                listaUsuarios.add(usuario);
            
            }
        
        }catch(FileNotFoundException ex){
        
            System.err.println("El archivo no fue encontrado");
            
        }catch(IOException ex){
        
            System.err.println("No se pudo leer el archivo");
            
        }catch(org.json.simple.parser.ParseException ex){
        
            ex.printStackTrace();
            
        }
    
    }//Fin de metodo leerJSON
    
    public String agregar(Usuario usuario){
    
        if(buscar(usuario.getNombre())==null){
        
            if (listaUsuarios.add(usuario)) {
                registrarJSON();
                return "Su nombre de usuario fue guardado exitosamente";

            } else {

                return "Su nombre de usuario ya existe";

            }      
        }else{
        
            int nivel = usuario.getNivel();
            
            buscar(usuario.getNombre()).setNivel(nivel);
            registrarJSON();
            
            return "Los datos de este jugador se han actualizado";
        
        }     
    }//Fin de metodo agregar
    
    public Usuario buscar(String nombre) {
        for (int indice = 0; indice < listaUsuarios.size(); indice++) {
            if (listaUsuarios.get(indice).getNombre().equalsIgnoreCase(nombre)) {
               
                return listaUsuarios.get(indice);
            
            }
        }
        return null;
    }//Fin de metodo buscar
    
    public void reiniciar(){
    
        listaUsuarios.clear();
        
        registrarJSON();
    
    }
    
    public String[][] getDatosTablaUsuario(){
        
        String [][] datos= new String[listaUsuarios.size()][Usuario.ETIQUETAS_USUARIO.length];
        
        for(int indice=0;indice<listaUsuarios.size();indice++){
            
            for(int atributo=0;atributo<datos[indice].length;atributo++){
                
                datos[indice][atributo]=listaUsuarios.get(indice).getDatos(atributo); 
                
            }
        }
        return datos; 
    }//Fin de metodo getDatosTablaUsuario

}//Fin de la clase
