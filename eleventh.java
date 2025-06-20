// 2). Multi-Dimensional 2D/3D/4D  Similar to Matrix

// Take User Input

import java.util.Scanner;

public class eleventh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix : ");

        int [][]a = new int[2][2];


        // Input

        for(int i=0; i<a.length; i++){   // Row
                                                        //  = Matrix
            for(int j=0; j<a.length; j++){   // Coloumn 

                a[i][j] = sc.nextInt();
            }
        }


        // Output

        System.out.println("Matrix: ");


        for(int i=0; i<a.length; i++){   // Row
                                                        //  = Matrix
            for(int j=0; j<a.length; j++){   // Coloumn 

               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

       
        
    }
    
}
