package module4.offline21112016.first;

public interface DAO {
    boolean addWord(String word);

    boolean updateWorld(String word, String word2);

    boolean deleteWord(String word);

    String[] getList();
}
