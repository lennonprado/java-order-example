
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pila unapila = new Pila();
		
        System.out.println("Pila:");

        if(unapila.vacia())
            System.out.println("Pila Vacia");
        else
            System.out.println("Tiene elementos");
		unapila.poner(4);
        System.out.println("Agregue el valor " + unapila.ver());

        unapila.poner(7);
        System.out.println("Agregue el valor " + unapila.ver());

        unapila.poner(8);
        System.out.println("Agregue el valor " + unapila.ver());

        unapila.poner(9);
        System.out.println("Agregue el valor " + unapila.ver());

        unapila.poner(0);
        System.out.println("Agregue el valor " + unapila.ver());

        unapila.poner(2);
        System.out.println("Agregue el valor " + unapila.ver());
		
        if(unapila.vacia())
            System.out.println("Pila Vacia");
        else
            System.out.println("Tiene elementos");

        unapila.sacar();
        System.out.println("La tapa es: " + unapila.ver());
        
        unapila.sacar();
        System.out.println("La tapa es: " + unapila.ver());

        unapila.sacar();
        System.out.println("La tapa es: " + unapila.ver());

        unapila.sacar();
        System.out.println("La tapa es: " + unapila.ver());

        unapila.sacar();
        System.out.println("La tapa es: " + unapila.ver());
        	
        if(unapila.vacia())
            System.out.println("Pila Vacia");
        else
            System.out.println("Tiene elementos");

        unapila.sacar();

        if(unapila.vacia())
            System.out.println("Pila Vacia");
        else
            System.out.println("Tiene elementos");
        
	}

}
