import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);
 
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
       
        System.out.println("PRIMEIRA MATRIZ! digite um número.");
 
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.printf("A[%d][%d]: \n", i, j);
                A[i][j] = scanner.nextInt();
            }
        }
 
        System.out.println("SEGUNDA MATRIZ! digite um número");
 
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.printf("B[%d][%d]: \n", i, j);
                B[i][j] = scanner.nextInt();
            }
        }
 
        System.out.printf("SOMA DAS MATRIZ A e B!\n");
 
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
               
                C[i][j] = A[i][j] + B[i][j];
                System.out.printf("%d\t", C[i][j]);
            }
            System.out.printf("\n");
        }
 
    }
}
    