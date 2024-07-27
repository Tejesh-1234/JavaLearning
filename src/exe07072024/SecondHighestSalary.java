package exe07072024;

import java.util.Arrays;

public class SecondHighestSalary {
    public static void main(String[] args){

        int[] salary={100,200,5000,3000,3200};

        Arrays.sort(salary);
        System.out.println("Second Highest Salary is -> "+ salary[salary.length-2]);
    }
}
