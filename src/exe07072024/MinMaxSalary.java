package exe07072024;

import java.util.Arrays;

public class MinMaxSalary {
    public static void main(String[] args){

        int[] salary ={1000,2000,5000,500,100};
        int min=salary[0];
        int max=salary[0];


        for (int i=0;i<salary.length;i++) {

            if (min>salary[i]) {
                min = salary[i];
            }
            if(max<salary[i]) {
                max = salary[i];
        }

        }
        System.out.println(min);
        System.out.println(max);

    }
}


