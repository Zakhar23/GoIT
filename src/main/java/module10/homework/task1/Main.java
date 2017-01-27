package module10.homework.task1;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("First exeption");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
