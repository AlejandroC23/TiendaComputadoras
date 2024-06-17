/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Tienda {
    public String adclNombreTienda;
    public String adclPropietario;
    public int adclIdTrib;
    
    //Métodos Constructores
    public Tienda(){}
    
    public Tienda(String adclNombreTienda, String adclPropietario, int adclIdTrib) {
        this.adclNombreTienda = adclNombreTienda;
        this.adclPropietario = adclPropietario;
        this.adclIdTrib = adclIdTrib;
    }
    
    //Métodos de Encapsluamiento
    public String getAdclNombreTienda() {
        return adclNombreTienda;
    }

    public void setAdclNombreTienda(String adclNombreTienda) {
        this.adclNombreTienda = adclNombreTienda;
    }

    public String getAdclPropietario() {
        return adclPropietario;
    }

    public void setAdclPropietario(String adclPropietario) {
        this.adclPropietario = adclPropietario;
    }

    public int getAdclIdTrib() {
        return adclIdTrib;
    }

    public void setAdclIdTrib(int adclIdentificadorTrib) {
        this.adclIdTrib = adclIdentificadorTrib;
    }
    
    //Métodos de Reglas de Negocio
    public void imprimir(){
        System.out.println("********* INFO. TIENDA *********\n" +
                "Nombre: " + getAdclNombreTienda() + "\n" +
                "Propietario: " + getAdclPropietario()+ "\n" +
                "Identificador Tributario: " + getAdclIdTrib()+ "\n");
    }
}
