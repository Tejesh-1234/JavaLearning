package exe07072024;

import java.util.Scanner;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Rows u want to print a Left Triangle");
        int row = sc.nextInt();
        LeftTriangle(row);
    }
    public static void LeftTriangle (int row){
        for(int i=1;i<=row;i++){

            for(int j=i;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
