import java.util.Scanner;
import java.util.Arrays;

public class Lab04 {

	public static void main(String[] args) {
		Scanner k= new Scanner(System.in);
	
		System.out.println("Welcome to the Matrix Adder Program!");
		
		System.out.println("Please enter the length and width of the first matrix");
		
		//Rows and Columns
		int r = k.nextInt();
		int c = k.nextInt();
		int [][] nums1 = new int[r][c];
		
		//Give the user the prompt for what value they would want to input
		for(int i=0; i<nums1.length;i++) {
			for(int j = 0; j<nums1[0].length;j++) {
				System.out.println("Enter value at index "+ i + " " + j);
				nums1[i][j]=k.nextInt();
					
			}
		}
		
		//The second matrix dimensions
		System.out.println("Please enter the length and width of the second matrix");

		int r2 = k.nextInt();
		int c2 = k.nextInt();
		int [][] nums2 = new int[r2][c2];
		
		for(int i=0; i<nums2.length;i++) {
			for(int j = 0; j<nums2[0].length;j++) {
				System.out.println("Enter value at index "+ i + " " + j);
				nums2[i][j]=k.nextInt();
					
			}
		}
		for(int i=0; i<nums1.length;i++) {		
			for(int j = 0; j<nums1[i].length;j++) {
						
				System.out.print(nums1[i][j]+" ");
						
			}
			
			System.out.println();
			
		}
		System.out.println("+");
		for(int i=0; i<nums2.length;i++) {
			for(int j = 0; j<nums2[i].length;j++) {	
				System.out.print(nums2[i][j]+" ");
			}
			System.out.println();
		}
		
		//If the first matrix doesn't match the dimensions of matrix 2 it gives an error message
		if(r != r2 ||c != c2) {
			System.out.println("Invalid Dimensions");
			System.exit(0);
		}
		
		System.out.println("=");
		
		//Sums is the same dimensions of the Matrix one which would be the same as Matrix 2
		int[][] sums = new int[r][c];
		
		for(int i=0; i<nums2.length; i++) {
			for(int j = 0; j<nums2[i].length;j++) {
				sums[i][j] = nums1[i][j] + nums2[i][j];
				System.out.print(sums[i][j]+" ");	
			}
			System.out.println();
		}
}
}