package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Empleados trabajador1 =  new Empleados("Karen");
		Empleados trabajador2 =  new Empleados("Belen");
		Empleados trabajador3 =  new Empleados("Sofia");
		Empleados trabajador4 =  new Empleados("Leo");
		trabajador1.cambiaSeccion("RRHH");
		
//		System.out.println(trabajador1.DevuelveDatos());
//		
//		System.out.println(trabajador2.DevuelveDatos());
//	
//		System.out.println(trabajador3.DevuelveDatos());
//		
//		System.out.println(trabajador4.DevuelveDatos());
	
		System.out.println(trabajador1.DevuelveDatos() + "\n" + trabajador2.DevuelveDatos() + "\n"
		+ trabajador3.DevuelveDatos() + "\n" +trabajador4.DevuelveDatos());
		
		
		System.out.println(Empleados.dameIdsiguiente());
		
	}
}
	
	
	class Empleados{
		
		public Empleados(String nom){
			
			nombre =  nom;
			
			seccion = "Administracion";
			
			Id=Id2;
			Id2++;
			
			
		}
		
		
	
	//metodo setter
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	//metodo getter
	public String DevuelveDatos() {
		
		return "el nombre es : " + nombre + "\nla seccion es : " + seccion + "\nEL ID ES : " + Id;
	}
	
	//METODO SETTER
	/*public void cambiaNombre(String nombre) {
		
		this.nombre=nombre;
	}*/
	
	public static String dameIdsiguiente() { //los metodos statics no actuan sobre objetos
		
		return "El Id siguiente es : " + Id2 ;
	}
	
	
	
	private final String nombre; //constante que no se puede modificar
	private String seccion;
	private int Id;
	private static int Id2=1;

	}
