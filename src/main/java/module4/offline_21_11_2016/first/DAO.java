package module4.offline_21_11_2016.first;

public interface DAO {
    boolean addWord(String word);
    boolean updateWorld(String word, String word2);
    boolean deleteWord(String word);
    String[] getList();
}
