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
public class Partido {
    
    //ATRIBUTOS
    
    private int partidoCodigo;
    private int usuario;
    private int local;
    private int visitante;
    private String fecha;
    private int golesLocal;
    private int golesVisitante;
    
    //CONSTRUCTOR

    public Partido(int partidoCodigo, int usuario, int local, int visitante, String fecha, int golesLocal, int golesVisitante) {
        this.partidoCodigo = partidoCodigo;
        this.usuario = usuario;
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    
    //GETTERS AND SETTERS

    public int getPartidoCodigo() {
        return partidoCodigo;
    }

    public void setPartidoCodigo(int partidoCodigo) {
        this.partidoCodigo = partidoCodigo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public int getVisitante() {
        return visitante;
    }

    public void setVisitante(int visitante) {
        this.visitante = visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Partido{" + "partidoCodigo=" + partidoCodigo + ", usuario=" + usuario + ", local=" + local + ", visitante=" + visitante + ", fecha=" + fecha + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + '}';
    }
    
    
}
