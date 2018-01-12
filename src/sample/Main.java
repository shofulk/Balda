package sample;

import AllModalWindow.WindowName;
import AllModalWindow.WindowWithUseWord;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends Application {

    public static TextField textField;
    public Button button;
    private Button bGetUseWord;
    FileIO fileIO;
    static ArrayList<String> Library = new ArrayList<>();
    public static Player player1;
    public static Player player2;
    HBox hBox;
    VBox vBox;
    static Label l;

    @Override
    public void start(Stage primaryStage) throws Exception {
        WindowName.newWindow("Введите имена игроков");
        BorderPane root = new BorderPane();
        GameField gf = new GameField();
        fileIO = new FileIO();
        fileIO.loadLibrary(Library);
        player1 = new Player("Игрок 1");
        player2 = new Player("Игрок 2");
        player1.setTurn(true);
        player2.setTurn(false);
        textField = new TextField();
        hBox = new HBox();
        vBox = new VBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10,20,10,10));
        button = new Button("Проверить слово");
        button.setPrefSize(115,10);
        bGetUseWord = new Button("Просмотреть");
        l = new Label();

        if(Main.player1.isTurn()){
            l.setText("Ходит "+Main.player1.getName());
        }else{
            l.setText("Ходит "+Main.player2.getName());
        }

        hBox.getChildren().add(button);
        hBox.getChildren().add(bGetUseWord);
        VBox.setMargin(l,new Insets(0,0,0,8));
        vBox.getChildren().add(l);
        VBox.setMargin(hBox,new Insets(0,0,0,8));
        vBox.getChildren().add(hBox);
        root.setCenter(gf.createContect());
        root.setTop(textField);
        root.setBottom(vBox);

        button.setOnAction(event -> {
            //gf.enterWord = String.valueOf(textField.getText());
            try {
                fileIO.checkWord(String.valueOf(gf.enterWord));
                gf.checkState();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            textField.setText(null);
            gf.arr.clear();
        });
        bGetUseWord.setOnAction(event -> {
            WindowWithUseWord.newWindow("");
            });
        /*bGetUseWord.setOnAction(event -> {System.out.println(player1.useWord.toString());
                                        System.out.println(player2.useWord.toString());});*/
        Scene scene = new Scene(root,275,370);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Игра Балда");
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}