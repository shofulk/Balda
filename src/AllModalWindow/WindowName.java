package AllModalWindow;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Main;
import sample.Player;

/**
 * Created by Кирилл Шофул on 29.12.2017.
 */
public class WindowName {
    public static void newWindow(String title) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        TextField text1 = new TextField("Игрок 1");
        TextField text2 = new TextField("Игрок 2");
        TilePane tile = new TilePane();
        Button b = new Button("Ok");

        tile.getChildren().add(text1);
        tile.getChildren().add(text2);
        tile.getChildren().add(b);

        Main.player1 = new Player(text1.getText());
        Main.player2 = new Player(text2.getText());

        b.setOnAction(event -> window.close());
    }
}
