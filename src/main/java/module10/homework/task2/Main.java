package module10.homework.task2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("message of my exeption");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
