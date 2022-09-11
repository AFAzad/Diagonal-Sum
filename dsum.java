/* Problem Statement
Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix. */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//int m=sc.nextInt();
		int N=sc.nextInt();
		int count=0;
		int sum=0;
		int [][] Array= new int[N][N];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				Array[i][j]= sc.nextInt();
			}
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(i==j){
					count=count+Array[i][j];
					}
				if(i+j==N-1){
					sum=sum+Array[i][j];
				}
			}
		}
		System.out.print(count+" "+sum);
                      // Your code here
	}
}