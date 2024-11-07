import java.util.*;
public class EjercicioBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Adivina el Numero
		
		Scanner entrada = new Scanner (System.in);
		
		//static --> que no hace falta crear un objeto perteneciente a la clase math para utilizat el metodo 
		//sino que tovca poner el nombre de la clase adelante
		//refundicion de double a entero
		
		int aleatorio = (int)(Math.random()*100);
		int numero=0;
		int intentos = 0;
		
		while (numero != aleatorio ) {
			intentos++;
			
			System.out.println("Introduce un numero por favor: ");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("Mas bajo\n");
				
			}else if(aleatorio > numero) {
				System.out.println("Mas Alto\n");
				
				
			}
			
		}
		
		System.out.println("-----El numero es Correcto-----");
		System.out.println("-----Haz hecho " + intentos + " Intentos---------");
	}

}
