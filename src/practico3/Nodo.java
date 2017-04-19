package practico3;
import java.util.ArrayList;

public class Nodo {
	private int valor;
	private int estado;
	private ArrayList<Nodo> vecinos;
	private ArrayList<Integer> distancias;
	// idea
	
	public Nodo(int v){
		this.valor=v;
		this.estado=1; // 1==BLANCO, 2==AMARILLO, 3==NEGRO
		vecinos = new ArrayList<Nodo>();
	}
	
	public int getValor(){
		return this.valor;
	}
	
	public int getEstado(){
		return this.estado;
	}
	
	public void setEstado(int i){
		this.estado=i;
	}
	
	public ArrayList<Nodo> getVecinos(){
		return this.vecinos;
	}
	
	public void addVecino(Nodo n){
		this.vecinos.add(n);
	}	
}