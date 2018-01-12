package AllModalWindow;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Main;

/**
 * Created by Кирилл Шофул on 12.01.2018.
 */
public class WindowEnd {
    public static void NewWindow(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Pane pane = new Pane();

        if(Main.player1.getCount() > Main.player2.getCount())
            pane.getChildren().addAll(new Label("ПОЗДРАВЛЯЮ!!!! Победил " + Main.player1.getName()));
        else
            pane.getChildren().add(new Label("ПОЗДРАВЛЯЮ!!!! Победил " + Main.player2.getName()));

        Scene scene = new Scene(pane,250,150);
        window.setScene(scene);
        window.setTitle("ПОЗДРАВЛЯЮ!!!");
        window.showAndWait();
    }
}
