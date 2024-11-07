package poo;

public class Coche {
	
	
	private int ruedas = 4; //solo es modificable y visible desde su clase donde esta iniciada
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	
	//metodo constructor --> un metodo especial que se 
	//encarga de dar un estado incial a nuestro objeto
	//Y se llama igual que la clase madre
	
	public Coche() { //METODO CONSTRUCTOR
		largo=2000;
		ancho=1000;
		motor=1600;
		peso_plataforma=500;
		
		// los metodos permitirar acceder a los datos de las diferentes clases
		
		
		
	}
	//////////////////////////////GETTERS Y SETTERS 
	//metodo GETTER
	
	public String datos_generales() {
		
		return "La plaforma del vehiculo tiene " + ruedas + " ruedas "
	+ " mide " + largo/1000 +  " metros con un ancho de " + ancho + 
	" cm y un peso de plataforma de " + peso_plataforma + " kg " ;
	
	}
	
	//Metodo SETTER
	
	public void establece_color(String color_coche) { //getter y setter II
		
		
		color=color_coche;
		
		
	}
	
	//METODO GETTER
	public String dime_color() {
		
		return "el color del coche es " + color;
	}
	
	
	//metodo setter
	public void configura_asientos(String asientos_cuero) {
		
	 //this --> hace referencia  a la misma variable de la clase
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero =true;
		}else {
			
			this.asientos_cuero=false;
		}
		
	
	}
	
	//Metodo getter
	
	public String dime_asientos() {
		
		if(asientos_cuero == true) {
			
			return "El coche tiene asientos de cuero ";
			
		}else {
			
			return "El coche no tiene asientos de cuero ";
		}
		
	}
	
	
	//metodo setter
	public void configura_climatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	//metodo getter
	
	public String dime_climatizador() {
		
		if(climatizador == true) {
			return"el coche incorpora climatizador";
			
		}else {
			return" el coche lleva aire acondicionado";
		}
		
	}
	
	//meotodo getter y setter -- no se recomiennda hacer esta practica
	
	public String dime_pesoCoche() {
		
		int peso_carroseria = 500;
		peso_total=peso_plataforma + peso_carroseria;
		
		if (asientos_cuero == true) {
			
			peso_total=peso_total+50;
			
		}
		if (climatizador == true) {
			
			peso_total= peso_total+20;
		}
		
		 return "el peso total del coche es " + peso_total;
	}
	//Metodo getter
	
	public int precio_coche() {
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			
			precio_final+=2000;
			
		}
		if (climatizador==true) {
			
			precio_final+=1500;
			
		}
		
		return precio_final;
		
		
	}
	
	
	
	
	///////////////////////////////////////////////////////

}
