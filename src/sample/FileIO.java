package sample;

import AllModalWindow.ModalWindow2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Кирилл Шофул on 28.12.2017.
 */
public class FileIO {

    private String nameFile = "D:\\Kyrsach\\Balda\\src\\sample\\word.txt";
    private File file = new File(nameFile);
    protected File useFile = new File("useWord");
    GameField gf;

    Scanner scanner = null;


    public void loadLibrary(ArrayList<String> Library)  throws FileNotFoundException{
        scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String s =scanner.nextLine();
            Library.add(s);
        }
        scanner.close();
    }

    public void checkWord(String str) throws FileNotFoundException {
        for (int i = 0; i < Main.Library.size(); i++){
            if(Main.Library.get(i).equals(str)){
                if(!checkUseWord(str)){
                    ModalWindow2.newWindow("Такое слово вы уже использовали");
                }else{
                    if(Main.player1.isTurn()){
                        Main.player1.setCount(str.length());
                        Main.player1.useWord.add(str);
                        Main.player1.setTurn(false);
                        Main.player2.setTurn(true);
                        Main.l.setText("Ходит " + Main.player2.getName());
                    }else{
                        Main.player2.setCount(str.length());
                        Main.player2.useWord.add(str);
                        Main.player2.setTurn(false);
                        Main.player1.setTurn(true);
                        Main.l.setText("Ходит " + Main.player1.getName());
                    }
                    ModalWindow2.newWindow("Такое слово есть в словаре");
                try {
                    this.useFile(str);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;}
            }
        }
    }

    public void useFile(String str) throws FileNotFoundException{
        try(FileWriter writer = new FileWriter(useFile, true)){
            writer.write(str);

            writer.flush();
            writer.append('\n');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkUseWord(String str) throws FileNotFoundException{
        scanner = new Scanner(useFile);
        ArrayList<String> arr = new ArrayList<>();
        while(scanner.hasNextLine()){
            String s =scanner.nextLine();
            arr.add(s);
        }
        scanner.close();
        for (int i = 0; i < arr.size(); i++)
            if(arr.get(i).equals(str)){
                return false;
            }
    return true;
    }
}