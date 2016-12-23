package module6.homework;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArrayInt = {10, 8, 2, 7, 3, -8, -9, 8, 1, -13};

        System.out.println(ArraysUtils.sum(myArrayInt));
        System.out.println(ArraysUtils.min(myArrayInt));
        System.out.println(ArraysUtils.max(myArrayInt));
        int maxPositiveInt = ArraysUtils.maxPositive(myArrayInt);
        System.out.println(maxPositiveInt == 0
                ? "нет позитивных чисел (значение больше 0)"
                : maxPositiveInt);
        System.out.println(ArraysUtils.multiplication(myArrayInt));
        System.out.println(Arrays.toString(ArraysUtils.modulus(myArrayInt)));
        System.out.println(ArraysUtils.secondLargest(myArrayInt));
        System.out.println(Arrays.toString(myArrayInt));
        System.out.println(Arrays.toString(ArraysUtils.reverse(myArrayInt)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(myArrayInt)));

        System.out.println("=============");

        User[] users = new User[4];
        users[0] = new User(123456L, "Cavin", "Block", 50, 300);
        users[1] = new User(123456L, "Cavin", "Block", 50, 300);
        users[2] = new User(0, "Sam", "Tui", 50, 1500);
        users[3] = new User(123456L, "Joe", "Garret", 50, 1500);

        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users, 300)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
