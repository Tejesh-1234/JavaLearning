package exe07072024;

public class Widening {
    public static void main(String[] args) {
    //Widening
    byte b=10;
    int a=b; // VALID – Implicit Casting - JVM
    int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

    // Narrowing
    int val = 300;
    //byte b1 = val; // Invalid - Implicit Casting - JVM
    byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

        int course = 100;
        float GST = 18.45F;
        float total_price = course+GST;
        System.out.println(total_price);
}
}