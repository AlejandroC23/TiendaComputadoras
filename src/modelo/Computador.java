/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Computador {
    private String adclMarca;
    private int adclMemoria;
    private String adclProcesador;
    private String adclSistemaOperativo;
    private double adclPrecio;
    
    //Métodos Constructores
    public Computador(){}

    public Computador(String adclMarca, int adclMemoria, String adclProcesador, String adclSistemaOperativo, double adclPrecio) {
        this.adclMarca = adclMarca;
        this.adclMemoria = adclMemoria;
        this.adclProcesador = adclProcesador;
        this.adclSistemaOperativo = adclSistemaOperativo;
        this.adclPrecio = adclPrecio;
    }
    
    //Métodos de Encapsulamiento

    public String getAdclMarca() {
        return adclMarca;
    }

    public void setAdclMarca(String adclMarca) {
        this.adclMarca = adclMarca;
    }

    public int getAdclMemoria() {
        return adclMemoria;
    }

    public void setAdclMemoria(int adclMemoria) {
        this.adclMemoria = adclMemoria;
    }

    public String getAdclProcesador() {
        return adclProcesador;
    }

    public void setAdclProcesador(String adclProcesador) {
        this.adclProcesador = adclProcesador;
    }

    public String getAdclSistemaOperativo() {
        return adclSistemaOperativo;
    }

    public void setAdclSistemaOperativo(String adclSistemaOperativo) {
        this.adclSistemaOperativo = adclSistemaOperativo;
    }

    public double getAdclPrecio() {
        return adclPrecio;
    }

    public void setAdclPrecio(double adclPrecio) {
        this.adclPrecio = adclPrecio;
    }
    
    //Métodos de Regla de Negocio
    public void imprimir(){
        System.out.println("******** INFO. COMPUTADORA ********\n" +
                "Marca: " + getAdclMarca() + "\n" +
                "Cantidad de Memoria: " + getAdclMemoria()+ "GB\n" +
                "Característica del Procesador: " + getAdclProcesador()+ "\n" +
                "Sistema Operativo: " + getAdclSistemaOperativo()+ "\n" +
                "Precio: " + getAdclPrecio() + "\n");
    }
}
