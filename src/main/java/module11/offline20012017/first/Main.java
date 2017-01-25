package module11.offline20012017.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /*while (true) {
            String str = sc.next();
            if (str.equals("stop")) {
                break;
            }
            try {
                int integer = Integer.parseInt(str);
                integerList.add(integer);
            } catch (Throwable e) {
                stringList.add(str);
            }

        }*/

        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    integerList.add(scanner.nextInt());
                    scanner.nextLine();
                } else if (scanner.hasNextDouble()) {
                    doubleList.add(scanner.nextDouble());
                    scanner.nextLine();
                } else {
                    String line = scanner.nextLine();
                    if (line.equals("stop")) {
                        break;
                    }
                    stringList.add(line);
                }
            }
        }

        System.out.println("=============== integerList");
        System.out.println(integerList);
        System.out.println("=============== doubleList");
        System.out.println(doubleList);
        System.out.println("=============== stringList");
        System.out.println(stringList);
    }



}
