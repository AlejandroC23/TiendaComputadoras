/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Computador;
import modelo.Tienda;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        int a = 1;
        int n ;
        int option;
        int comp = 0;
        Scanner s = new Scanner(System.in);
        Tienda store = new Tienda();
        Computador computer = new Computador();
        
        
        do{
            System.out.println("\n"+"""
                               ----------- SISTEMA PARA TIENDA DE COMPUTADORAS -----------
                               1. Ingresar datos de la tienda.
                               2. Agregar computadoras.
                               3. Cantidad de computadoras.
                               4. Buscar computadora por marca.
                               5. Mostrar computadoras.
                               6. Salir.""");
            
            System.out.print("\nIngrese la opción: ");
            option = s.nextInt();
            
            if(option == 1){
                System.out.print("\nIngrese el nombre de la tienda: ");
                store.setAdclNombreTienda(s.next());
                System.out.print("Ingrese el propietario de la tienda: ");
                store.setAdclPropietario(s.next());
                System.out.print("Ingrese el identificador tributario: ");
                store.setAdclIdTrib(s.nextInt());
                
            }else if(option == 2){
                System.out.print("\nIngrese la cantidad de computadoras a registrar: ");
                n = s.nextInt();
                comp = n;
                Computador[] listaComputadoras = new Computador[n];
                for(int i = 0; i < listaComputadoras.length; i++){
                    System.out.println("\n*********** INGRESO DE INFORMACIÓN DE LA COMPUTADORA " + (i+1) + " ***********");
                    System.out.print("Ingrese la marca: ");
                    computer.setAdclMarca(s.next());
                    System.out.print("Ingrese la cantidad de memoria (en GB): ");
                    computer.setAdclMemoria(s.nextInt());
                    System.out.print("Ingrese las características del procesador: ");
                    computer.setAdclProcesador(s.next());
                    System.out.print("Ingrese del sistema operativo: ");
                    computer.setAdclSistemaOperativo(s.next());
                    System.out.print("Ingrese el precio: ");
                    computer.setAdclPrecio(s.nextDouble());
                    
                    listaComputadoras[i] = computer;
                }
            }else if(option == 3){
                if(comp == 0){
                    System.out.println("\n¡No hay computadoras existentes en la tienda!\n");
                }else{
                    System.out.println("\nExisten un total de " + comp + " computadoras en la tienda.");
                }
            }else if(option == 4){
                System.out.println("No funciona");
            }else if(option == 5){
                System.out.println("No funciona");
            }else if(option == 6){
                System.out.println("Saliendo del programa...");
                a = 0;
            }else{
                System.out.println("¡ERROR! Ingrese una opción correcta.");
            }
        }while(a==1);
    }
}
