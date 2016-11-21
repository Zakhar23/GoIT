package Module4.HomeWork.Offline_21_11_2016.First;

public interface DAO {
    boolean addWord(String word);
    boolean updateWorld(String word, String word2);
    boolean deleteWord(String word);
    String[] getList();
}
