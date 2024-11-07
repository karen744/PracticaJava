package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {


		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0]=new Empleado2("Karen", 6000, 2000, 4,6);
		lasPersonas[1]=new Alumno("Andrea", "Ingenieria de Sistemas");
		
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre() + " " + p.dameDescripcion());
		}
	}

}

abstract class Persona{ //CLASES ABSTRACTAS II
	
	public Persona(String nom){
		
		nombre=nom;
		
	}
	
	//metodo getter
	
	public String dameNombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
	
	
}

class Empleado2 extends Persona{
	
	
	
	public Empleado2(String nom, double sue, int year, int mes, int dia) { //constructor
		
		super(nom); //pasa el constructor de la super clase o  clase padre
		sueldo=sue;
		GregorianCalendar calendario =  new GregorianCalendar(year, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
		
	}
	
	
	public String dameDescripcion() {
		return ", Este empleado tiene un Id igual " +Id + "  Con un sueldo : " + sueldo;
	}
	
	//metodo getter
	public double dameSueldo() {
		
		return sueldo;
		
	}
	//metodo getter
	
	public Date damFechaContrato() {
		
		return altaContrato;
	}
	
	
	//metodo setter
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
		
	}
	

	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
		
	}
	
	public String dameDescripcion() {
		
		return ", El ALumno esta estudiando la carrera de : " + carrera;
	}
	
	private String carrera;
	
}


