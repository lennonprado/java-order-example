package Practico4;

import java.util.LinkedList; 
import java.util.List; 
  

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso = 11; 
        List<Objeto> listaObjetos= new LinkedList<Objeto>(); 
        listaObjetos.add(new Objeto(5,3,4)); 
        listaObjetos.add(new Objeto(3,5,2)); 
        listaObjetos.add(new Objeto(5,2,7)); 
        listaObjetos.add(new Objeto(1,8,4)); 
        listaObjetos.add(new Objeto(2,3,3)); 
        Mochila mochila = new Mochila(listaObjetos, peso); 
        System.out.println(mochila.toString()); 
        List<Objeto> solucion = mochila.resolver(); 
        System.out.println("Soluci—n: \n " + solucion.toString() + " \n");
        
        
        int peso1 = 11; 
        List<Objeto> listaObjetos1= new LinkedList<Objeto>(); 
        listaObjetos1.add(new Objeto(5,3,2)); 
        listaObjetos1.add(new Objeto(3,5,2)); 
        listaObjetos1.add(new Objeto(5,2,7)); 
        listaObjetos1.add(new Objeto(1,8,2)); 
        listaObjetos1.add(new Objeto(2,3,3)); 
        Mochila mochila1 = new Mochila(listaObjetos1, peso1); 
        System.out.println(mochila1.toString()); 
        List<Objeto> solucion1 = mochila1.resolver(); 
        System.out.println("Soluci—n: \n " + solucion1.toString() + " \n");
        
        
        System.out.println("La Soluci—n que me da una estrategia de greedy no es siempre la optima, pero me da un resultado aceptable");
	}

}
