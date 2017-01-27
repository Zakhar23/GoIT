package module10.homework.Task4;

import module10.homework.task2.MyExeption;

public class ClassWithTwoMethods {
    public void g() throws MyExeption {
        throw new MyExeption("it`s my exeption");
    }

    public void f() throws ExeptionForF {
        try {
            g();
        } catch (MyExeption e) {
            throw new ExeptionForF("ExeptionForF");
        }
    }
}
