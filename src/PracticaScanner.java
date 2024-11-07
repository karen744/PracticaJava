import java.util.*; // * --> todos los paquetes de java.util

public class PracticaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructor es un metodo especial
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ingresa tu nombre: ");
		
		String name = input.nextLine();	
		
		
		System.out.println("ingresa tu edad: ");
		
		int age = input.nextInt();
		
		System.out.println("Su nombre es: " + name + " y su edad es : "+ age);
		System.out.println("el proximo año tendras : " + (age+1));
		

	}

}
