
package com.array.redington;
import java.util.Scanner;
public class Ascendingdescending {
	//int i,j,n;
	int[]numbers=new int[5];
	int[]ascending=new int[5];
	int[]descending=new int[5];
	//int[]temp=new int[5];
	public void getinput(){
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter the numbers");
			numbers[i]=scan.nextInt();
			ascending[i]=numbers[i];
			descending[i]=numbers[i];
		}
			
		}

	public void ascending() {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {

				if (ascending[i] > ascending[j]) {
					int temp = ascending[i];
					ascending[i] = ascending[j];
					ascending[j] = temp;
				}
			}
		}
		System.out.println("Ascendingorder :");

		for (int i = 0; i < 5; i++) {
		
			System.out.println(ascending[i] + " ");
		}

	}
	public void descending(){
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(descending[i]<descending[j]){
					int temp=descending[i];
					descending[i]=descending[j];
					descending[j]=temp;
				}
			}
		}
		System.out.println("descending order :");
		for(int i=0;i<5;i++){
			System.out.println(descending[i]+ " ");
		}
	}
}
