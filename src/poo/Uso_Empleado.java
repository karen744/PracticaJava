package poo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado = new Empleado("Karen", 85000, 2004,8,15 );
		Empleado empleado2 = new Empleado("Belen", 80000, 2001,10,10 );
		Empleado empleado3 = new Empleado("Sofia", 95000, 2000,2,21 );
		
		empleado.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println(" nombre: " + empleado.dameNombre()+ " su sueldo es: " + empleado.dameSueldo()+ " la fecha es: " +  empleado.damFechaContrato());
		System.out.println(" nombre: " + empleado2.dameNombre()+ " su sueldo es: " + empleado2.dameSueldo()+ " la fecha es: " +  empleado2.damFechaContrato());
		System.out.println(" nombre: " + empleado3.dameNombre()+ " su sueldo es: " + empleado3.dameSueldo()+ " la fecha es: " +  empleado3.damFechaContrato());
		*/
		
		/*
		Empleado [] empleados = new Empleado [3];
		a Empleado[] se le llama "array de tipo Empleado"
		porque es un arreglo (o array) que contiene elementos que son instancias de la clase Empleado. 
		En este caso, el tipo de datos de cada elemento del array es Empleado, 
		lo cual significa que cada posición en el array puede almacenar un objeto de esa clase.
		*/
		
		Empleado [] empleados = new Empleado [6];  
		String [] miArray = new String[5];
		
		
		Jefatura jefe_RRHH = new Jefatura("Karen", 2000, 2000, 12, 12);
		
		jefe_RRHH.establece_incentivo(1000);
		
		
		empleados[0]=new Empleado("Belen", 348548, 2001,3,5);
		empleados[1]=new Empleado("Karen", 134848, 2002,4,5);
		empleados[2]=new Empleado("Sofia", 434848, 2003,5,5);
		empleados[3]=new Empleado ("KareM" , 378000, 2004,6,7); //se esta llamando al segundo constructor
		empleados[4]= jefe_RRHH; // utilizar un objeto de la subclase POLIMORFISMO
									//cuando el programa espere un objeto de la super-clase
		empleados[5]= new  Jefatura("Maria", 3000, 2000, 12, 12); 
		
		Jefatura jefe_Finanzas = (Jefatura)empleados[5]; //refundicion
														//(Jefatura) es un casting explícito. 
														//Está diciendo que Java debe tratar empleados[5]
														//como un objeto de tipo Jefatura
		jefe_Finanzas.establece_incentivo(10000);
		
		/*for(int i=0; i<3; i++) {
			
			empleados[i].subeSueldo(5);
			
		}*/
		
		for(Empleado e: empleados) {
			
			e.subeSueldo(5);
		}
		
		/*for(int i=0; i<3; i++) {
			
			System.out.println("Nombre : " + empleados[i].dameNombre() + " sueldo es : " + empleados[i].dameSueldo() + " fecha contrato es : " + empleados[i].damFechaContrato() );
		}*/
		
		
		Arrays.sort(empleados);
		
		
		
		for(Empleado e: empleados) {
			System.out.println("Nombre : " + e.dameNombre() 
								+ " sueldo es : " + e.dameSueldo() 
								+ " fecha contrato es : " + e.damFechaContrato() );
			
			
		}
		
		

	}

}

class Empleado implements Comparable{
	
	
	
	public Empleado(String nom, double sue, int year, int mes, int dia) { //constructor
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario =  new GregorianCalendar(year, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
		
	}
	
	public Empleado(String nom) { //constructor --> Sobre carga de constructores
		
			this(nom, 40000,2003,5,6); //cuando se usa el this dentro de un contructor 
									   //se llama al contructor que tiene
									   // los mismos parametros
		
	}
	
	
	//metodo compareTo
	
	public int compareTo(Object miObjeto) {
		
		Empleado  otroEmpleado=(Empleado)miObjeto;
		
		if(this.Id<otroEmpleado.Id) {
			
			return -1;
			
		}
		if(this.Id> otroEmpleado.Id) {
			
			return 1;
		}
		
		return 0;
		
	}
	

	
	//metodo getter
	
	public String dameNombre() {
		
		return nombre + " Id: " + Id;
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
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	
	
	
	
}

class Jefatura extends Empleado {

	public Jefatura(String nom, double sue, int year, int mes, int dia) { //
		super(nom, sue, year, mes, dia);
		
		
		
		
	}
	
	//metodo setter
	
	public void establece_incentivo(double b) {
		
		incentivo=b;
		
		
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo(); //en la variable sueldoJefe guarda 
										      //lo que hace el metodo dameSueldo() DE LA CLASE EMPLEADO
		
		return sueldoJefe + incentivo;
	}
	
	
	
	 private double incentivo;
	 
	
}


