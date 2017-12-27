import java.util.Scanner; 
public class ConversorF2C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		double c = 0;  
		System.out.print("Introduzca los grados fahrenheit (ºF) que desea convertir a grados centigrados (ºC): ");
		double f = sc.nextDouble();  
		c =  ((f  - 32) * 5) / 9; 
		System.out.print("El resultado en grados centigrados es: " + c + " ºC.");
		sc.close();

	}

}