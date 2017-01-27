package module10.homework.task4;

public class Main {
    public static void main(String[] args) {
        ClassWithTwoMethods classWithTwoMethods = null;

        try {
            classWithTwoMethods = new ClassWithTwoMethods();
            classWithTwoMethods.fff();
        } catch (ExeptionForF e) {
            System.out.println(e.getMessage());
        }
    }
}
