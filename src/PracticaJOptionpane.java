import javax.swing.JOptionPane;

public class PracticaJOptionpane {
	
	
	public static void main (String[] args) {
		
		String usuario = JOptionPane.showInputDialog("Soy karen quien eres tu");
		String age = JOptionPane.showInputDialog("tengo 28 años cuantos años tienes tu"); //se recomienda el metodo parseInt
		
		int edad_usuario=Integer.parseInt(age); //pasa a entero con la clase ineteger y el metodo parseInt
		edad_usuario++;
		
		System.out.println("Hola " + usuario + " tienes " + age + " años" );
		System.out.println("Hola " + usuario + " tendra el proximo año " + (edad_usuario) + " años" );
		
		//clase numberformat para formatear numeros = cambiar el formato de los numeros
		
		
	}

}
