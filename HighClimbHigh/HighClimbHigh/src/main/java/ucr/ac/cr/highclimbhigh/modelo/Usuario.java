/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.modelo;

/**
 *
 * @author nashl
 */
public class Usuario {
    
    private String nombre;
    private int nivel;

public static final String[] ETIQUETAS_USUARIO = {"Nombre", "Nivel"};

    public Usuario(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }//Fin de constructor

    public Usuario() {
    }  //Fin de constructor  

    public String getDatos(int indice){
        switch (indice) {
            case 0:
                return nombre;
            case 1:
                return "" + nivel;
        }
        return null;
    }//Fin de metodo getDatos

    public String getNombre() {
        return nombre;
    }//Fin de metodo getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin de metodo setNombre

    public int getNivel() {
        return nivel;
    }//Fin de metodo getNivel

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }//Fin de metodo setNivel
    
    public String toString(){
    
        return "Usuario{" + "Nombre=" + nombre + ", nivel=" + nivel + '}';
    }//Fin de metodo toString

}//Fin de la clase
