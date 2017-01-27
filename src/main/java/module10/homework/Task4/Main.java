package module10.homework.Task4;

public class Main {
    public static void main(String[] args) {
        ClassWithTwoMethods classWithTwoMethods = null;

        try {
            classWithTwoMethods = new ClassWithTwoMethods();
            classWithTwoMethods.f();
        } catch (ExeptionForF e) {
            System.out.println(e.getMessage());
        }
    }
}
