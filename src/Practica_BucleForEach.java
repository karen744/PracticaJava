
public class Practica_BucleForEach {
	public static void main(String[] args) {
		
		
		//Bucle for - Each
		/*String [] paises = new String[8];
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		
		/*for(int i=0; i<paises.length; i++) {
			
			System.out.println("Pais "+(i+1)+" "+ paises[i]);
		}*/
		
		String [] paises = {"España","Ecuador","Colombia","Peru","Chile","Venezuela","Argentina","Mexico"};
		
		for(String elemento: paises) {
			System.out.println("Pais : "+elemento);
			
		}
		
	}

}
