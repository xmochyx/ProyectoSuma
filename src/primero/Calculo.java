package primero;
import java.io.*;

public class Calculo {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int menu, suma1, suma2, total1;
		
		
		System.out.print("--------MENÚ--------"
				+ "\n1. Suma enteros"
				+ "\nIntroduce la opción deseada: ");
		
		menu=Integer.parseInt(br.readLine());
		
		if (menu==1){
			System.out.print("Introduce el primer número deseado: ");
			suma1=Integer.parseInt(br.readLine());
			
			System.out.print("Introdue el segundo número deseado: ");
			suma2=Integer.parseInt(br.readLine());
			
			total1=suma1+suma2;
			
			System.out.println("El resultado de esta suma: "+total1);
			
		}else {
			
			System.out.println("No has introducido la opción correcta");
		}
		

	}

}
