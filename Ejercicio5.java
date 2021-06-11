
import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int edad;
		double i;
		int n;
		int numhombres=0;
		int nummujeres=0;
		String sexo;
		System.out.println("Numero de edades: ");
		n = scanner.nextInt();
		for (i=1;i<=n;i++) {
			System.out.println("Persona "+i);
			System.out.println("Edad:");
			edad = scanner.nextInt();
			System.out.println("Sexo: (M/F)");
			sexo = scan.nextLine();
			if (edad<18 && (sexo.equals("M") || sexo.equals("m"))) {
				numhombres = numhombres+1;
			}
			if (edad>=18 && (sexo.equals("F") || sexo.equals("f"))) {
				nummujeres = nummujeres+1;
			}
		}
		System.out.println("Hombres menores de edad: "+numhombres);
		System.out.println("Mujeres mayores de edad: "+nummujeres);
	}


}

