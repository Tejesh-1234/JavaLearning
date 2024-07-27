package exe07072024;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Financial Year to Check whether it is a leap year or not");
        int a = sc.nextInt();

        if (a%4==0){
            System.out.println("This is a Leap Year "+a);
        }else {
            System.out.println("This is not a Leap Year "+a);
        }

    }
}
