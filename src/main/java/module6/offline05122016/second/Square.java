package module6.offline05122016.second;

public class Square extends View {
    private static int countView;

    @Override
    public void show() {
        System.out.println("я квадрат и я себя показываю");
        countView += 1;
    }

    @Override
    public void hide() {
        for (int i = 0; i < countView; i++) {
            System.out.println("я квадрат и я себя прячу");
        }
        countView = 0;
    }
}
