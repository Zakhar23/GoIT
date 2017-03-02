package developer.module1.offline;

import java.util.ArrayList;
import java.util.List;


public class MyList<T> {
    List<T> myList = new ArrayList<T>();

    public void push(T gen) {
        myList.add(gen);
    }

    public T pop() {
        if (myList.size() ==0) {
            return null;
        } else {
            T bbb = myList.get(myList.size()-1);
            myList.remove(bbb);
            return bbb;
        }
    }
}
