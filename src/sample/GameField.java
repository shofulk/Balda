package sample;

/**
 * Created by Кирилл Шофул on 03.12.2017.
 */
import AllModalWindow.ModalWindow;
import AllModalWindow.WindowEnd;
import com.sun.deploy.util.StringUtils;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

public class GameField {
    public static char x;
    Tile[][] board = new Tile[5][5];
    public ArrayList<String> arr = new ArrayList<>();
    String enterWord;


    public Parent createContect() {
        Pane root = new Pane();
        root.setPrefSize(275, 275);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Tile tile = new Tile();
                tile.setTranslateX(j * 55);
                tile.setTranslateY(i * 55);
                root.getChildren().add(tile);

                board[i][j] = tile;
            }
        }

        board[2][0].setLetter("Б");
        board[2][1].setLetter("А");
        board[2][2].setLetter("Л");
        board[2][3].setLetter("Д");
        board[2][4].setLetter("А");

        return root;
    }

    public boolean isComplete(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(board[i][j].getLetter().isEmpty())
                    return false;
            }
        }
        return true;
    }

    public void checkState(){
        if(isComplete()){
            WindowEnd.NewWindow();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    board[i][j].setDisable(true);
                }
            }
        }
    }

    public class Tile extends StackPane{

        Button button;
        String letter;

        public Tile(){
            button = new Button();
            button.setPrefSize(55, 55);
            getChildren().add(button);

            button.setOnMouseClicked(event -> {
                if (event.getButton() == MouseButton.PRIMARY) {
                    x = ModalWindow.newWindow("Выбирете букву");
                    button.setText(String.valueOf(x));
                }else
                if(event.getButton() == MouseButton.SECONDARY){
                    letter = button.getText();
                    arr.add(letter);
                    enterWord = StringUtils.join(arr,"");
                    Main.textField.setText(arr.toString());
                }
            });
        }

        public void setLetter(String let){
            button.setText(let);
            //button.setDisable(true);
        }

        public String getLetter(){
            return button.getText();
        }
    }
}