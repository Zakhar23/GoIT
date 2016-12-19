package module4.offline21112016.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DAO dao;

        String user = "russian";
        String monthToAdd = null;

        switch (user) {
            case "russian":
                dao = getRuMonth();
                monthToAdd = "габриель";
                break;
            case "american":
                dao = getUsaMonth();
                monthToAdd = "gabriel";
                break;
            case "ukrainian":
                dao = getUkrMonth();
                monthToAdd = "габр";
                break;
            default:
                dao = getRuMonth();
                monthToAdd = "габриель";
                break;
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
