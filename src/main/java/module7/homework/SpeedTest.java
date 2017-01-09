package module7.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger2 = new LinkedList<>();
        List<String> listString2 = new LinkedList<>();

        System.out.println("===add===");

        long start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listInteger.add(1);
        }
        long finish = new Date().getTime();
        System.out.println("ArrayList [Integer] :" + (finish - start));

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listString.add("a");
        }
        finish = new Date().getTime();
        System.out.println("ArrayList [String] :" + (finish - start));

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listInteger2.add(1);
        }
        finish = new Date().getTime();
        System.out.println("LinkedList [Integer] :" + (finish - start));

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listString2.add("a");
        }
        finish = new Date().getTime();
        System.out.println("LinkedList [String] :" + (finish - start));

        System.out.println("===set===");

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listInteger.set(0, 1);
        }
        finish = new Date().getTime();
        System.out.println("ArrayList [Integer] :" + (finish - start));

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listString.set(0, "a");
        }
        finish = new Date().getTime();
        System.out.println("ArrayList [String] :" + (finish - start));

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listInteger2.set(0, 1);
        }
        finish = new Date().getTime();
        System.out.println("LinkedList [Integer] :" + (finish - start));

        start = new Date().getTime();
        for (int i = 0; i <= 100000; i++) {
            listString2.set(0, "a");
        }
        finish = new Date().getTime();
        System.out.println("LinkedList [String] :" + (finish - start));

    }
}
