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
public class Usuario {
    //ATRIBUTOS
    private int usuarioCodigo;
    private String nombre;
    private String correo;
    private String username;
    private String password;
    
    //CONSTRUCTOR

    public Usuario(int usuarioCodigo, String nombre, String correo, String username, String password) {
        this.usuarioCodigo = usuarioCodigo;
        this.nombre = nombre;
        this.correo = correo;
        this.username = username;
        this.password = password;
    }
    
    //GETTERS AND SETTERS

    public int getUsuarioCodigo() {
        return usuarioCodigo;
    }

    public void setUsuarioCodigo(int usuarioCodigo) {
        this.usuarioCodigo = usuarioCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Usuario{" + "usuarioCodigo=" + usuarioCodigo + ", nombre=" + nombre + ", correo=" + correo + ", username=" + username + ", password=" + password + '}';
    }
    
    
    

}
