package poo;

public class Herencia_Furgoneta extends Coche {
	
	//clase Coche es la super clase
	//clase Furgoneta es la subclase
	//Java no admite herencia multiple
	
	private int capacidad_carga;
	private int plazas_extra; //numero de personas que pueden viajar en la furgoneta
	
	public Herencia_Furgoneta(int plazas_extra, int capacidad_carga) { //constructor

		super(); //termino super() dentro de un contructor
				 //llama al constructor de la clase padre  //Herencia 1
		 
		this.capacidad_carga=capacidad_carga;    //Herencia 1
		this.plazas_extra=plazas_extra;			//Herencia 1
		
		
		
	}
	
	//METODO GETTER
	public String dimeDatos_Furgoneta() {
		return"la capacidad de carga es : " + capacidad_carga + "  y las plazas son: " + plazas_extra;  //Herencia 2
	}
	

}
