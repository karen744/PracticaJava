
public class Practica_ArreglosMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//que es un amatriz es una estructura de datos que cojtiene una coleccion de valores del mismo tipo
		//para que para almacenar valores que normalmenete tienen alguna relacion entre si
		//sintaxis 
		//declaracion: int[]mimatriz = new int[]
		

		/*int [] mi_matriz = new int[5];
		int [] mi_matriz2= {1,2,3,4,5};
		mi_matriz[0]=5;
		mi_matriz[1]=6;
		mi_matriz[2]=7;
		mi_matriz[3]=8;
		mi_matriz[4]=9;
		
		System.out.println(mi_matriz[1]);*/
		
		int[]mi_matriz= {3,5,6,6,7,7,4};
		
		for(int i = 0; i<mi_matriz.length; i++) {
			
			System.out.println(i+"="+mi_matriz[i]);
		}
	}

}
