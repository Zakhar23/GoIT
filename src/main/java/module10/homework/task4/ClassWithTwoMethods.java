package module10.homework.task4;

import module10.homework.task2.MyException;

public class ClassWithTwoMethods {
    public void ggg() throws MyException {
        throw new MyException("it`s my exception");
    }

    public void fff() throws ExeptionForF {
        try {
            ggg();
        } catch (MyException e) {
            throw new ExeptionForF("ExceptionForF");
        }
    }
}
