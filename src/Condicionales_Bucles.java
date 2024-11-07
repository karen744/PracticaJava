import java.util.*;

import javax.swing.JOptionPane;
public class Condicionales_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//condicional if (condicion) {
		//codigo a jecutar
		//}
		
		//EJRCICIO EVALYAR LA EDAD
		
		//String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		//int edad2 = Integer.parseInt(edad);
		
		//if (edad2 >= 18) {
			
			//System.out.println("mayor de edad");
		//}else  {
			//System.out.println("menor de edad");
		//}
		
		//Ejercicio 2
		/*String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad2 = Integer.parseInt(edad);
		
		if(edad2 < 18) {
			
			System.out.println("eres un adolecente");
		}else if (edad2 <40) {
			System.out.println("eres joven");
			
		}else if(edad2<65) {
			System.out.println("eres maduro");
		}else {
			System.out.println("eres de antiguo");
		}*/
		
		//Ejercicio 3 switch
		
		//buscar el area de un cuadrado, rectangulo, triangulo, circulo
		
		//cuadrado lado*lado
		//rectangulo base*altura
		//triangulo (base*altura)/2
		//circulo
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ELIGE UNA OPCION:\n 1. Cuadrado\n 2. Rectangulo\n 3. Triangulo\n 4. Circulo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		case 1: {
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
			  System.out.println("el area del cuadrado es "+ Math.pow(lado, 2));
			
			break;
		}
		case 2: {
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectangulo"));
			
			System.out.println("El area delr ectanglo es " + (base*altura));
			break;
			
			
		}
		
		case 3: {
			int base =Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base del triangulo"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura del triangulo"));
			
			System.out.println("El area del triangulo es " + ((base*altura)/2));
			break;
			
			
		}
		
		case 4: {
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio del circulo"));
			System.out.println("El area del circulo es ");
			System.out.printf("%1.5f", Math.PI*(Math.pow(radio, 2)));
			
			break;
		}
		
		default:
			System.out.println("ESA NO ES UNA OPCION VALIDA");
		}
		
		
		
		
		
		
		
		
			
		
		
	}

}
