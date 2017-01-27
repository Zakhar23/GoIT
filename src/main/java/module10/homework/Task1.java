package module10.homework;

public class Task1 {
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
