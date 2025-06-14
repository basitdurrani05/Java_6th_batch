// Conditional Statements : 

import java.util.Scanner;

public class eighth {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Age : ");
        int a = sc.nextInt();


        if(a>=18){

            System.out.println("Adult Age.");
        }

        else if(a<=0){

            System.out.println("No Age Error.....");
        }

        else{

            System.out.println("You are a Child or a teenage...");
        }
        
    }
    
}
