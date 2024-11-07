import javax.swing.*;
public class Ejercicio_BucleFor_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long resultado=1L;
		int numero = (int)(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para calcular su Factorial")));
		
		
		for(int i=numero; i> 0; i--) {
			
			//System.out.println(i);
			
			resultado=resultado*i;
		}
		
		System.out.println("el factorial de "+ numero+" es " + resultado);

	}

}
