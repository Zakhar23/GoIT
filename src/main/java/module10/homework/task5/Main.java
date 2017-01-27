package module10.homework.task5;

import module10.homework.task2.MyException;
import module10.homework.task4.ExeptionForF;

public class Main {
    public static void throwExceptionByNumber(int number) throws MyException, ExeptionForF, MyThirdException {
        switch (number) {
            case 1:
                throw new MyException("MyException");
            case 2:
                throw new ExeptionForF("ExeptionForF");
            default:
                throw new MyThirdException("MyThirdException");
        }
    }

    public static void main(String[] args) {
        try {
            throwExceptionByNumber(1);
            throwExceptionByNumber(2);
            throwExceptionByNumber(3);
        } catch (MyException | ExeptionForF | MyThirdException e) {
            System.out.println("Exception: " + e);
        }
    }
}
