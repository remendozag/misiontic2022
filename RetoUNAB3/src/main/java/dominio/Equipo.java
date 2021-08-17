/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Equipo {
    //ATRIBUTOS
    private int equipoCodigo;
    private String nombre;
    private String entrenador;
    
    //CONSTRUCTOR

    public Equipo(int equipoCodigo, String nombre, String entrenador) {
        this.equipoCodigo = equipoCodigo;
        this.nombre = nombre;
        this.entrenador = entrenador;
    }
    
    //GETTERS AND SETTERS

    public int getEquipoCodigo() {
        return equipoCodigo;
    }

    public void setEquipoCodigo(int equipoCodigo) {
        this.equipoCodigo = equipoCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Equipo{" + "equipoCodigo=" + equipoCodigo + ", nombre=" + nombre + ", entrenador=" + entrenador + '}';
    }
   
    


}
