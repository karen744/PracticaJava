import java.util.Scanner;

public class Bucle_DoWhile {
	
	public static void main(String[] args) {
		
		//Do While --> evaluda la condicion despues de haber ejecutado el codigo en si interior 
		//te asegura que aunque la condicion sea falsa lo que hay dentro del bucle asegura que se ejecuta una vez
		
		
	Scanner entrada = new Scanner (System.in);
		
		//static --> que no hace falta crear un objeto perteneciente a la clase math para utilizat el metodo 
		//sino que tovca poner el nombre de la clase adelante
		//refundicion de double a entero
		
		int aleatorio = (int)(Math.random()*100);
		
		
		int numero=0;
		int intentos = 0;
		
		do {
			intentos++;
			
			System.out.println("Introduce un numero por favor: ");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("Mas bajo\n");
				
			}else if(aleatorio > numero) {
				System.out.println("Mas Alto\n");
				
				
			}
			
		}while (numero != aleatorio );
		
		System.out.println("-----El numero es Correcto-----");
		System.out.println("-----Haz hecho " + intentos + " Intentos---------");
		
	}

}
