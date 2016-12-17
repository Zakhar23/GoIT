package module3.homework.Second;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(2, 4));

        Adder adder = new Adder();
        System.out.println(adder.check(3, 3));

        Adder arithmetic2 = new Adder();
        System.out.println(arithmetic.add(3, 5));
    }
}
