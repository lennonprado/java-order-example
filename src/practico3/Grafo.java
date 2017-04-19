package practico3;
import java.util.ArrayList;

public class Grafo {
	private ArrayList<Nodo> Nodos;
	
	public Grafo(){
		this.Nodos = new ArrayList<Nodo>();
	}
	
	public void addNodo(int i){
		Nodo n = new Nodo(i);
		this.Nodos.add(n);
	}
	
	public void addVecino(int n1, int n2){
		this.getNodos().get(n1).addVecino(this.getNodos().get(n2));
	}
	
	public void addVecinoDirigido(int n1, int n2){
		this.addVecino(n1, n2);
		this.addVecino(n2, n1);
	}
	
	public boolean esvecino(int n1, int n2){		
		for(int i=0; i<this.getNodos().get(n1).getVecinos().size();i++)
			if(this.getNodos().get(n1).getVecinos().get(i).getValor() == n2)
				return true;
		return false;
	}
	
	public ArrayList<Nodo> getNodos(){
		return this.Nodos;
	}
	
	public String toString(){
		String aux = new String();
		for(int i=0; i<this.getNodos().size();i++){
			aux = aux + "Nodo: " + this.getNodos().get(i).getValor() + "\n Vecinos: ";
			for(int j=0; j<this.getNodos().get(i).getVecinos().size();j++){
				aux = aux + this.getNodos().get(i).getVecinos().get(j).getValor() + " | ";
			}		
			aux = aux + "\n";
		}
		return aux;
	}
	
	
}