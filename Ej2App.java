import java.util.ArrayList;
import java.util.Scanner;

public class Ej2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int IVA=0;
		double bruto=0;
		int cant=0;
		int pagado=0;
		String continua="";
		double neto =0;
		double devolucion=0;
		
		ArrayList<Integer>listaIVA = new ArrayList<>();
		ArrayList<Double>listaBruto = new ArrayList<>();
		ArrayList<Double>listaNeto = new ArrayList<>();
		ArrayList<Integer>listaCant = new ArrayList<>();
		ArrayList<Integer>listaPagado = new ArrayList<>();
		ArrayList<Double>listaDevolucion = new ArrayList<>();
		
		
		do {
		
		System.out.println("Entra 4 si no es producto de primera necesidad, o 21 si no lo es");
		IVA = sc.nextInt();
		listaIVA.add(IVA);
		
		System.out.println("Entra el precio bruto del producto");
		bruto = sc.nextInt();
		listaBruto.add(bruto);
		
		neto = bruto +((bruto * IVA)/100);
		listaNeto.add(neto);
		
		
		
		System.out.println("Entra la cantidad de estos que has comprado");
		cant = sc.nextInt();
		listaCant.add(cant);
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
			
			System.out.println("IVA del producto: "+listaIVA.get(i));
			System.out.println("Precio bruto: "+listaBruto.get(i));
			System.out.println("Precio neto (con IVA): "+listaNeto.get(i));
			System.out.println("Cantidad comprada: "+listaCant.get(i));
			System.out.println("Cantidad pagada por el cliente: "+listaPagado.get(i));
			System.out.println("Saldo a devolver: "+listaDevolucion.get(i));
			
			System.out.println("---------------------------------------------------");
			
			
		}
		
		
		
	}

}
