import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
				
		int eleccion;
		
		
		Hashtable<String, Integer> articulos = new Hashtable<String, Integer>();
		
		
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
		
		
		int IVA=0;
		double bruto=0;
		int cant=0;
		int pagado=0;
		String continua="";
		double neto =0;
		double devolucion=0;
		
		ArrayList<String>listaNombre = new ArrayList<>();
		ArrayList<Integer>listaIVA = new ArrayList<>();
		ArrayList<Double>listaBruto = new ArrayList<>();
		ArrayList<Double>listaNeto = new ArrayList<>();
		ArrayList<Integer>listaCant = new ArrayList<>();
		ArrayList<Integer>listaPagado = new ArrayList<>();
		ArrayList<Double>listaDevolucion = new ArrayList<>();
		
		
		String usarPrograma="";
		
		
		do {
		
		System.out.println("Si quieres controlar el Stock presiona 1, si quieres comprar presiona 2.");
		eleccion = sc.nextInt();
		
		
		switch(eleccion) {
		
		case 1:
				do {
					
				   System.out.println("Que accion desea realizar?\nAñadir nuevo articulo o modificar cantidad(1)\nMuestrame la cantidad de un producto(2)\nListame todos los productos(3)");
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
				   
				   System.out.println("Quieres seguir controlando el Stock? Si/No");
				   continuar = sc.next();
				   continuar = continuar.toLowerCase();
				   
				}while(continuar.equals("si"));
				
					break;
					
		
		case 2:	
			////////////////////////////////////////////////////!!!!!!!!!!!!!!!!!!!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			////Aqui queria obligar de alguna manera al usuario a entrar un producto que estuviera en nuestra base de datos.\\\\\\\
			//Encontre la manera de hacerlo con un hashmap(Que no se ni que es realmente) pero con hashlist no la pude encontrar,\\
			//asi que intenta entrar nombres de productos que tenga en el hashlist para evitar errores.\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
				do {
				String nombreProd="";
				int comprobacionNombre=0;
				
				//do {
				System.out.println("Entra el nombre del producto");
				nombreProd = sc.next();
				listaNombre.add(nombreProd);
				//comprobacionNombre = articulos.get(nombreProd);
				
				//System.out.println(comprobacionNombre);
					
				//}while(comprobacionNombre == null);
				
				System.out.println("Entra 4 si no es producto de primera necesidad, o 21 si no lo es");
				IVA = sc.nextInt();
				listaIVA.add(IVA);
				
				System.out.println("Entra el precio bruto del producto");
				bruto = sc.nextInt();
				listaBruto.add(bruto);
				
				neto = bruto +((bruto * IVA)/100);
				listaNeto.add(neto);
				
							
				int comprobacion;
				
				
				do {
					
				comprobacion = articulos.get(nombreProd);
				
				System.out.println("Entra la cantidad de estos que quieres comprar. Stock del producto: "+comprobacion);
				cant = sc.nextInt();
				
				
					
				}while(cant > comprobacion);
				
				listaCant.add(cant);
				
				articulos.put(nombreProd,(comprobacion - cant));
				
				do {
					System.out.println("Cuánto dinero me das?");
					pagado = sc.nextInt();
					
				}while(pagado * cant < neto);
					listaPagado.add(pagado);
					
					devolucion = pagado - cant * neto;
					devolucion = Math.round(devolucion*100.0)/100.0;
					
					listaDevolucion.add(devolucion);			
					
				System.out.println("Quieres seguir comprando? Entra Si o No.");
				continua = sc.next();
				
				continua = continua.toLowerCase();
				
				}while(continua.equals("si"));
				
				
				for(int i = 0; i < listaPagado.size(); i++) {
					
					System.out.println("Datos del producto "+(i+1)+":");
					System.out.println("---------------------------------------------------");
					System.out.println("Producto: "+listaNombre.get(i));
					System.out.println("IVA del producto: "+listaIVA.get(i));
					System.out.println("Precio bruto: "+listaBruto.get(i));
					System.out.println("Precio neto (con IVA): "+listaNeto.get(i));
					System.out.println("Cantidad comprada: "+listaCant.get(i));
					System.out.println("Cantidad pagada por el cliente: "+listaPagado.get(i));
					System.out.println("Saldo a devolver: "+listaDevolucion.get(i));
				
					System.out.println("---------------------------------------------------");
					}
				
					break;
					
					default: System.out.println("Entra 1 o 2");
						break;
			}	
		
		System.out.println("Quieres seguir usando el programa? Si/No");
		usarPrograma = sc.next();
		
		usarPrograma= usarPrograma.toLowerCase();
		
		}while(usarPrograma.equals("si"));
		
	}

}
