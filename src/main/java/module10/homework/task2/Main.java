package module10.homework.task2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyExeption("message of my exeption");
        } catch (MyExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
