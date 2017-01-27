package module10.homework.task3;

public class Main {
    public static void main(String[] args) {
        Man man = null;

        try {
            man.getName();
        } catch (NullPointerException e) {
            System.out.println("it is NullPointerException");
        }
    }
}
