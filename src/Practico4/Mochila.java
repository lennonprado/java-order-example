package Practico4;

import java.util.Collections; 
import java.util.LinkedList; 
import java.util.List; 
 
public class Mochila { 
    private List<Objeto> listaObjetos; 
    private int pesoMaximo; 
     
    public Mochila(List<Objeto> listaObjetos, int pesoMaximo){ 
        this.listaObjetos = new LinkedList<Objeto>(listaObjetos);  
        this.pesoMaximo = pesoMaximo; 
    } 
     
    public List<Objeto> resolver(){ 
       List<Objeto> res  = new LinkedList<Objeto>(); 
       //ordeno los objetos segun su ratio
       Collections.sort(listaObjetos); 
       //System.out.println(listaObjetos); 
       int totalPeso = 0; 
       //recorro todos los objetos para agregarlos a la mochila
       while(!listaObjetos.isEmpty() && totalPeso < pesoMaximo){ 
            Objeto o = listaObjetos.get(0); 
            int cantidad = o.cantidad;
            //obtengo la cantidad del primer objeto ordenados en la lista
            o.cantidad = 0;
            //recorro las cantidades verificando que no se pase el peso total permitido 
            while(cantidad > 0 && totalPeso < pesoMaximo){
            	
            	if(totalPeso + o.peso <= pesoMaximo){ 
            		//res.add(o); 
            		cantidad--;
            		o.cantidad++;
            		totalPeso += o.peso; 
            		
            	}else{ 
            		cantidad = 0; 
            	}
            }
            //una ves calculada la cantidad de objeto de ese tipo lo agrego al resultado
            //si la cantidad es mayor a cero
            if(o.cantidad>0)
            	res.add(o); 
            //y remuevo el objeto ya procesado
            listaObjetos.remove(0);  
        }
        return res; 
    } 
     
    public String toString(){ 
        String res = "Peso m‡ximo: " + pesoMaximo + "\n "; 
        res += "Lista de objetos:\n "+listaObjetos.toString(); 
         
        return res; 
    } 
} 