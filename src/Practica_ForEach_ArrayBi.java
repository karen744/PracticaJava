
public class Practica_ForEach_ArrayBi {
	
	public static void main(String[] args) {
		
		
		int [][] matrix= {
			
				{20,21,22,23,34},
				{1,2,3,4,5},
				{88,89,76,65,54},
				{7,4,9,47,79}
		};
		
		for(int[]fila:matrix) { 
			
			for(int z:fila) {
				
				System.out.print(z + " ");
			}
		}
	}

}
