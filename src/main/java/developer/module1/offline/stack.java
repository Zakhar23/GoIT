package developer.module1.offline;

public class stack {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.push(1);
        myList.push(2);
        myList.push(3);
        System.out.println(myList.pop());
    }

}
