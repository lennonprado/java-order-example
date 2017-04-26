package Practico4;

public class Objeto implements Comparable<Objeto>{ 
    int peso; 
    int valor; 
    int cantidad;
    double ratio; 
         
    public Objeto(int peso, int valor, int cantidad){ 
        this.peso = peso; 
        this.valor = valor; 
        this.cantidad = cantidad;
        if(peso > 0){ 
        	this.ratio = this.valor / this.peso; 
        }else{ 
        	this.ratio = -1; 
        } 
    } 
 
    public int compareTo(Objeto o) { 
        int res = 0; 
        if((this.ratio > o.ratio) || 
            ((this.ratio == o.ratio) && (this.peso < o.peso))){ 
            res = -1; 
        }else if((this.ratio < o.ratio) || 
                ((this.ratio == o.ratio) && (this.valor > o.valor)) || 
                ((this.ratio == o.ratio) && (this.valor == o.valor) && 
                        (this.peso < o.peso))){ 
            res = 1; 
        } 
        return res; 
    } 
     
    public String toString(){ 
        return "( Peso: " + this.peso + " , Valor: " + this.valor + " , Cantidad: " + this.cantidad + ", Relacion Peso-Valor:" + this.ratio + ", Peso Total: " + (this.peso*this.cantidad) + ")\n"; 
    } 
} 