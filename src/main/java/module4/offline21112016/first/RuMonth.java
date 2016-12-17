package module4.offline21112016.first;

import java.util.Arrays;

public class RuMonth extends AbstractDAO {
    String[] arrayRu = {"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};

    public String[] getArray() {
        return arrayRu;
    }

    public void setArray(String[] array) {
        this.arrayRu = array;
    }

    @Override
    public boolean addWord(String word) {
        arrayRu = Arrays.copyOf(arrayRu,arrayRu.length + 1);
        arrayRu[arrayRu.length - 1] = word;

        return true;
    }

    @Override
    public boolean updateWorld(String word, String word2) {
        for (int i = 0; i < arrayRu.length; i++) {
            if (arrayRu[i].equals(word)) {
                arrayRu[i] = word2;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteWord(String word) {
        return false;
    }

//    @Override
//    public String[] getList() {
//        return arrayRu;
//    }
}
