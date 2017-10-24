package javaLearningClass;

import java.util.Scanner;

public class PrintLintoB {

	public static void main(String[] args) {
		
		
		 Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter width Value:  ");
	       int width = in.nextInt();
	       System.out.printf("Enter height Value:  ");
	       int height = in.nextInt();
	       
	    for(int i=1;i<=width;i++){
            for(int j=1;j<=height;j++){
                if(i==1 || i==width || j==1 || j==height){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    


}
