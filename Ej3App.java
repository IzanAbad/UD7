import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ej3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<String, Integer> articulos = new Hashtable<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int accion =0;
		String continuar ="";
       
        articulos.put("manzanas", 2);
        articulos.put("peras", 2);
        articulos.put("platanos", 3);
        articulos.put("cerezas", 5);
        articulos.put("aguacates", 2);
        articulos.put("mandarinas", 2);
        articulos.put("uvas", 3);
        articulos.put("piña", 5);
        articulos.put("paraguayos", 2);
        articulos.put("naranjas", 2);
		
     
        
        
        do {
        	
           System.out.println("Que accion desea realizar?\nAñadir nuevo articulo(1)\nMuestrame la cantidad de un producto(2)\nListame todos los productos(3)");
           accion = sc.nextInt();
           
           
	       switch(accion) {
	       
	       case 1:
	    	   System.out.println("Entra un producto nuevo o uno ya existente para modificar la cantidad");
	    	   String producto = sc.next();
	    	   
	    	   System.out.println("Entra la cantidad de este producto");
	    	   int cantidad = sc.nextInt();
	    	   
	    	   articulos.put(producto, cantidad);
	    	   
	    	   break;
	       case 2:
	    	   System.out.println("Entra el nombre del producto que quieres ver");
	    	   producto = sc.next();
	    	   
	    	   System.out.println("Actualmente hay "+articulos.get(producto)+" "+producto);
	    	   
	    	   break;
	    	   
	       case 3:
	    	   Enumeration enumeration = articulos.elements();
	           
	           Enumeration llaves = articulos.keys();
	           
	           while (llaves.hasMoreElements()) {
	             System.out.println("Producto: " + llaves.nextElement()+", Cantidad: "+ enumeration.nextElement());
	           }
	    	  
	    	   break;
	    	   
	    	   default:System.out.println("Entra el numero 1 o 2");
	    	   	break;
	
	       }
	       
	       System.out.println("Quieres seguir usando el programa? Si/No");
	       continuar = sc.next();
	       continuar = continuar.toLowerCase();
	       
        }while(continuar.equals("si"));
       
     
       
        
	}

}
