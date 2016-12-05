package main.java.module4.offline_21_11_2016.First;

abstract class AbstractDAO implements DAO {

    abstract String[] getArray();
    abstract void setArray(String[] array);

    @Override
    public boolean addWord(String word) {
        return false;
    }

    @Override
    public boolean updateWorld(String word, String word2) {
        return false;
    }

    @Override
    public boolean deleteWord(String word) {
        return false;
    }

    @Override
    public String[] getList() {
        return getArray();
    }
}
