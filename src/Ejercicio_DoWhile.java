import javax.swing.*;
public class Ejercicio_DoWhile {
	public static void main(String[] args) {
		
		//Ejercicio Persona Ideal
		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu Genero (H/M)");
			
			
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false );
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Alturaen cm"));
		
		int peso_ideal =0;
		if(genero.equalsIgnoreCase("H")) {
			
			peso_ideal= altura-11;
		}else if(genero.equalsIgnoreCase("M")) {
			
			peso_ideal= altura-120;
			
		}
		System.out.println("Tu peso ideal es : " + peso_ideal);
		
		
	}

}
