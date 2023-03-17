package Array;

public class array {

	public static void main(String[] args) {
		// this is for practice
		// This is one Dimensional Array{
		
			/*int[] month_days = new int[12];
			month_days[0] = 31;
			month_days[1] = 28;
			month_days[2] = 31;
			month_days[3] = 30;
			month_days[4] = 31;
			month_days[5] = 30;
			month_days[6] = 31;
			month_days[7] = 31;
			month_days[8] = 30;
			month_days[9] = 31;
			month_days[10] = 30;
			month_days[11] = 31;
			
			for (int i = 1;i<=12;i++) {
				
				System.out.println(i+"-"+month_days[i-1]);
			} */
			
			// Another way of creating array
			
			
			int []month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
			String []month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
			for(int i=0;i<=11;i++)
				System.out.println(month[i]+"-"+month_days[i]);
		
		
		// This is Two Dimensional Array 
		
		
			/*int array2[][] = new int[4][5];
			
			int i,j,k=0;
			for (i=0 ; i<4 ;i++) {
				for (j=0;j<5;j++) {
					array2[i][j] = k;
					k++;
				}
				
			}
			
			for (i=0;i<4;i++) {
				for (j=0;j<5;j++)
					System.out.print(array2[i][j]+" ");
				System.out.println();
			}*/
		
		// This is new Two Dimensional Array
		
		/*
		int array2[][]= new int[4][];
		array2[0] = new int [1];
		array2[1] = new int [2];
		array2[2] = new int [3];
		array2[3] = new int[4];
		
		int i,j,k = 0;
		for (i=0;i<4;i++) {
			for (j=0;j<=i;j++) {
				array2[i][j] = k;
				k++;
				}
			//k++;
		}
	
		for (i=0;i<4;i++) {
			for (j=0;j<=i;j++)
				System.out.print(array2[i][j]+" ");
			System.out.println();
		}*/
	}
	

}
