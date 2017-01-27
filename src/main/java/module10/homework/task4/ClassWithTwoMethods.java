package module10.homework.task4;

import module10.homework.task2.MyExeption;

public class ClassWithTwoMethods {
    public void ggg() throws MyExeption {
        throw new MyExeption("it`s my exeption");
    }

    public void fff() throws ExeptionForF {
        try {
            ggg();
        } catch (MyExeption e) {
            throw new ExeptionForF("ExeptionForF");
        }
    }
}
