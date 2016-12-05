package main.java.module6.offline_05_12_2016.second;

public class Triangle extends View {
    private static boolean showed = false;

    @Override
    public void show() {
        if (showed == false) {
            System.out.println("я треугольник и я себя показываю");
            showed = true;
        }
    }

    @Override
    public void hide() {
        if (showed == false) {
            System.out.println("я треугольник и я себя НЕ показывал");
        } else {
            System.out.println("я треугольник и я себя прячу");
            showed = false;
        }
    }
}
