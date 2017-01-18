package module9.offline13012017.ex1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Number number = 12;  //ArithmeticException

        try {
            int b = a / ((int) number);
            //b = a / 0;  //ArithmeticException
            //number = 12.1;            //ClassCastException
            //b = a / (int) number;   //ClassCastException
        } catch (ArithmeticException e) {
            throw e;
        } catch (ClassCastException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        } catch (Throwable e) {
            throw e;
        }
    }
}
