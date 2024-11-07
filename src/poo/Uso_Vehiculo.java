package poo;

import java.awt.Color;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//instanciar una clase
		
		//Coche Audi = new Coche(); //ejemplar de clase de la clase Coche
		
		//System.out.println(Audi.aviso_largo());
		
		//1ro instanciar un objeto con la clase Coche //getter y setter I
		
//		Coche micoche = new Coche();
//		
//		//micoche.establece_color();
//		micoche.establece_color(JOptionPane.showInputDialog("Introduce Color"));
//		
//		System.out.println(micoche.dime_color() +"\n ademas \n" + micoche.datos_generales());
//		
//		
//		micoche.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero ?"));
//		
//		System.out.println(micoche.dime_asientos());
//		
//		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador ? "));
//		
//		System.out.println(micoche.dime_climatizador());
//		System.out.println(micoche.dime_pesoCoche());
//		System.out.println("El precio final es " + micoche.precio_coche());
//		
//		
//		
//		//System.out.println("ESTE COCHE TIENE " + Audi.ruedas + " RUEDAS");
//		
//		
		
		//la clase publica es la principal (public)
		
		
		//metodos de acceso
		//metodos setters -->  definidores, esta encargado de establecer el valor de una propiedad (modificar)
		//metodos getters --> captadores, captar o para obteber el valor de esa propiedad 
		
		//Getters
		//funcion devolver el valor de las propiedades de los objetos
		//sintaxis: public dato_a_devolver nombre_metodo() {codigo y return}
		
		//Setters
		//modificar el valode de las propiedades de los objetos
		//sintaxis --> public void nombre_metodo() {codigo}
		//Void --> indica que el metodo no devuelve ningun valor
		//////////////////////////////////////////////////////////////////////////////
		
		//GETTER Y SETTERS II
		//PASO DE PARAMETROS --> consiste a l avez que llamas un metodo le psas junto con la llamda un valor y operer con el
	
	
	//HERENCIA 2
		
		Coche micoche1 =  new Coche();
		
		micoche1.establece_color("azul");
		
		Herencia_Furgoneta furgoneta1 = new Herencia_Furgoneta(7, 590);
		
		furgoneta1.establece_color("Rojo");
		furgoneta1.configura_asientos("si");
		furgoneta1.configura_climatizador("si");
		
		
		System.out.println("La furgoneta tiene : " + furgoneta1.datos_generales() + furgoneta1.dimeDatos_Furgoneta() + "\nMi Coche tiene : " + micoche1.datos_generales() );
		
		System.out.println(micoche1.dime_color() +" "+ furgoneta1.dime_color());
		
		
	
	
	
	
	
	
	}

}
