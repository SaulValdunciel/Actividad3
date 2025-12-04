package com.mycompany.conversortemperatura;
import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperatura\n");
	System.out.print("Mete el valor que quiereas convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Introduzca 1 para convertir Celsius en Fahrenheit....");
	System.out.println("  Introduzca 2 para convertir Fahrenheit en Celsius....");
	System.out.print("\nIntroduzca el valor aquí...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversión está aquí... "+value1+"ºF");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu conversión está aquí.. "+value3+"ºC");
		}
	System.out.println("\n\t¡¡Gracias!!..");
	}
}
