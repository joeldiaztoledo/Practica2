import java.util.Scanner; 
public class ConversorC2F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		double f = 0;
		double c = 0;
		System.out.print("Introduzca los grados centigrados (ºC) que desea convertir a fahrenheit: ");
		c = sc.nextDouble();  
		f =  ((c * 9)/5) + 32;
		System.out.print("El resultado en grados fahrenheit es: " + f + " ºF.");
		sc.close();
		
	}

}