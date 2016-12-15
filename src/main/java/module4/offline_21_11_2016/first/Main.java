package module4.offline_21_11_2016.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        RuMonth ruMonth = new RuMonth();
//        System.out.println(Arrays.toString(ruMonth.getList()));
//        ruMonth.addWord("fu");
//        System.out.println(Arrays.toString(ruMonth.getList()));
//        ruMonth.updateWorld("июль", "бла");
//        System.out.println(Arrays.toString(ruMonth.getList()));
        DAO dao;

        String user = "russian";
        String monthToAdd = null;

        switch (user) {
            case "russian":
                dao = getRuMonth();
                monthToAdd = "габриель";
            case "american":
                dao = getUsaMonth();
                monthToAdd = "gabriel";
            case "ukrainian":
                dao = getUkrMonth();
                monthToAdd = "габр";
            default:
                dao = getRuMonth();
                monthToAdd = "габриель";
        }
        System.out.println("getList");
        System.out.println(Arrays.toString(dao.getList()));
        System.out.println();

        System.out.println("addMonth");
        dao.addWord(monthToAdd);
        System.out.println(Arrays.toString(dao.getList()));


    }

    private static DAO getUkrMonth() {
        return new RuMonth();
    }

    private static DAO getUsaMonth() {
        return new RuMonth();
    }

    private static DAO getRuMonth() {
        return new RuMonth();
    }
}
