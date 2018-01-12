package AllModalWindow;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Main;


/**
 * Created by Кирилл Шофул on 28.12.2017.
 */
public class ModalWindow2 {
    public static void newWindow(String title) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        VBox pane = new VBox();
        pane.setPadding(new Insets(10));
        pane.setSpacing(8);
        Label l1 = new Label();
        Label l2 = new Label();
        Button b = new Button("Ok");


        l1.setText("У " + Main.player1.getName() + " очков " + Main.player1.getCount());
        l2.setText("У " + Main.player2.getName() + " очков " + Main.player2.getCount());



        VBox.setMargin(l1,new Insets(0,0,0,8));
        pane.getChildren().add(l1);
        VBox.setMargin(l2,new Insets(0,0,0,8));
        pane.getChildren().add(l2);
        VBox.setMargin(b,new Insets(30,10,25,30));
        pane.getChildren().add(b);

        b.setOnAction(event -> window.close());



        Scene scene = new Scene(pane,300,200);
        window.setScene(scene);
        window.setTitle(title);
        window.showAndWait();
    }
}
