package sample;

import java.util.ArrayList;

/**
 * Created by Кирилл Шофул on 27.12.2017.
 */
public class Player {

    int count;
    String name;
    public ArrayList<String> useWord = new ArrayList<>();
    boolean turn;

    public Player(String name){
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    /*public ArrayList<String> getUseWord() {
        return useWord;
    }*/

    public void setCount(int count) {
        this.count += count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addUseWord(String str){
        this.useWord.add(str);
    }

    public boolean isTurn() { return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

}
