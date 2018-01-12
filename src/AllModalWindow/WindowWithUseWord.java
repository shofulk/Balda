package AllModalWindow;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Main;

import java.util.ArrayList;

/**
 * Created by Кирилл Шофул on 30.12.2017.
 */
public class WindowWithUseWord {

    public static void newWindow(String title){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        VBox vBox = new VBox();
        HBox hBox = new HBox();

        ArrayList<Label> arr1 = new ArrayList<>();
        ArrayList<Label> arr2 = new ArrayList<>();

        /*Label l1 = new Label(Main.player1.getName());
        Label l2 = new Label(Main.player2.getName());

        hBox.setPadding(new Insets(10));
        hBox.setSpacing(8);

        HBox.setMargin(l1,new Insets(0,0,0,8));
        hBox.getChildren().add(l1);
        HBox.setMargin(l2,new Insets(0,0,0,8));
        hBox.getChildren().add(l2);

        for (int i = 0; i < Main.player1.useWord.size(); i++) {
            arr1.add(new Label(Main.player1.useWord.get(i)));
            HBox.setMargin(arr1.get(i),new Insets(0,0,0,8));
            hBox.getChildren().add(arr1.get(i));
            arr2.add(new Label(Main.player2.useWord.get(i)));
            HBox.setMargin(arr2.get(i),new Insets(0,0,0,8));
            hBox.getChildren().add(arr2.get(i));
        }*/

        VBox.setMargin(new Label(), new Insets(0, 0, 0, 8));
        VBox.setMargin(new Label(), new Insets(0, 0, 0, 8));
        vBox.getChildren().addAll(new Label("У " + Main.player1.getName()+ " " + Main.player1.getCount()),new Label("У " + Main.player2.getName()+ " " + Main.player2.getCount()));

        for (int i = 0; i < Main.player1.useWord.size(); i++){
            if(Main.player1.useWord.size() == Main.player2.useWord.size()) {
                arr1.add(new Label(Main.player1.useWord.get(i)));
                VBox.setMargin(arr1.get(i), new Insets(0, 0, 0, 8));
                vBox.getChildren().add(arr1.get(i));
                arr2.add(new Label(Main.player2.useWord.get(i)));
                VBox.setMargin(arr2.get(i), new Insets(0, 0, 0, 8));
                vBox.getChildren().add(arr2.get(i));
            }else{
                arr1.add(new Label(Main.player1.useWord.get(i)));
                VBox.setMargin(arr1.get(i), new Insets(0, 0, 0, 8));
                vBox.getChildren().add(arr1.get(i));
            }
        }

        Scene scene = new Scene(vBox,300,200);
        window.setScene(scene);
        window.setTitle(title);
        window.showAndWait();
        arr1.clear();
        arr2.clear();
    }
}
