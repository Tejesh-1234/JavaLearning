package exe07072024;

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Rows u want to print a right Triangle");
        int row = sc.nextInt();
        RightTriangle(row);
    }

    public static void RightTriangle (int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


