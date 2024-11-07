
public class Practica_ArrayBidimensional {
	
	public static void main(String[] args) {
		
		
		int[][]mtz=new int[4][5];
		
		mtz[0][0]=1;
		mtz[0][1]=2;
		mtz[0][2]=3;
		mtz[0][3]=4;
		mtz[0][4]=5;
		
		mtz[1][0]=6;
		mtz[1][1]=7;
		mtz[1][2]=8;
		mtz[1][3]=9;
		mtz[1][4]=10;
		
		mtz[2][0]=11;
		mtz[2][1]=12;
		mtz[2][2]=13;
		mtz[2][3]=14;
		mtz[2][4]=15;
		
		mtz[3][0]=16;
		mtz[3][1]=17;
		mtz[3][2]=18;
		mtz[3][3]=19;
		mtz[3][4]=20;
		
		//System.out.println("Valor en la posicion : " +mtz[3][0]);
		
		
		for(int i=0; i<4; i++) {
			System.out.println();
			
			for(int j=0; j<5; j++) {
				
				System.out.print(mtz[i][j]+ " ");
			}
		}
		
	}

}
