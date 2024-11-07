
import javax.swing.*;

public class PracticaBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bucles indeterminados while, do-while --> no sabes cunatas veces se va arepetir
		//bucles determinados for,  for-each --> si sabes cuantas veces se va a reptir
        //
		/*while (condicion) {
			linea de codigo a ejecutar
        }*/
		
		//EJERCICIO accceso a aplicacion
		
		String clave = "Karen";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduzca la contraseña");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña Incorrecta");
			}
		}
		
		
		System.out.println("Contraseña correcta , acceso existoso");
		

}
}
