/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tobar
 */
public class Cliente {
    private ArrayList<Video> listaReproduccion;
    private String nombre;
    
    //constructor que fija el nombre del cliente
    public Cliente(String nombre){
        this.nombre=nombre;
        listaReproduccion = new ArrayList<>();
        
    }
    
    public boolean agregarLista(Video v){
        if (listaReproduccion.size()<5){
            listaReproduccion.add(v);
            return true;
        }
        return false;
    }
    public void Reproducir(){
        String continuar="no";
        int vistas=10000;
        do{           
            listaReproduccion.get(0).mostrarInformacion();
            listaReproduccion.get(0).setNumeroReproducciones(vistas);
            vistas++;
            listaReproduccion.remove(0);
            Scanner sc =new Scanner(System.in);
            System.out.print("Desea continuar si/no:");
            String cont=sc.nextLine();
            continuar=cont;
        }while(continuar.equals("si"));
    }
    
    
    
    
}
