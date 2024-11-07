package poo;

import java.util.Scanner;

public class TiposEnumerandos_ClaseEnum {
	
//	enum Talla{ //CREANDOP UNA INSTANCIA PERTENECIENTE A LA CLAASE Y QUE ESA VARIABLE OBJETO SOLO PODRA ALMACENAR ESOS VALORES
//		MINI, MEDIANO, GRANDE, MUY_GRANDE
//	};

	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
	 private String abreviatura;
	 
	 //METODO GETTER
	 
	 public String dameAbreviatura() {
		 
		 return abreviatura;
	 }
	 
	}
		
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * TIPOS ENUMERADOS - CLASE ENUM
		 * 
		 * PERMITE CREAR OBJETOS TIPO ENUM O TIPOS ENUMERADOS
		 * que solo se puedan alamacenar en las variables cierto tipo de valores especificos  
		 * 
		 * tipo enumerado: una variable objeto de tipo enum donde se pueda almacenar un grupo de valores
		 * y solo se podra almacenar solo ese grupo de valores
		 * 
		 * 
		 * son estaticos ya que tienen que llamar la clase para llamar los valores
		 * 
		 * 
		 * 
		 */
//		Talla s= Talla.MINI;
//		Talla xl=Talla.MUY_GRANDE;  
//		Talla m= Talla.MEDIANO;
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escribe una Talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla= Enum.valueOf(Talla.class, entrada_datos);
		
		
		System.out.println("Talla = " + la_talla);
		
		System.out.println("Abreviatura " + la_talla.dameAbreviatura());
		
		
		
		

	}

}
