package Module4.HomeWork.Offline_21_11_2016.First;

import java.util.Arrays;

public class RuMonth implements DAO {
    String[] arrayRu = {"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};

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

    @Override
    public String[] getList() {
        return arrayRu;
    }
}
