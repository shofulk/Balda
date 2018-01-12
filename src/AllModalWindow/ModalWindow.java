package AllModalWindow;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Кирилл Шофул on 06.12.2017.
 */
public class ModalWindow {

    static char word;

    public static char newWindow(String title){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        TilePane pane = new TilePane();

        Button bА = new Button("А");
        Button bБ = new Button("Б");
        Button bВ = new Button("В");
        Button bД = new Button("Д");
        Button bГ = new Button("Г");
        Button bЕ = new Button("Е");
        Button bЁ = new Button("Ё");
        Button bЖ = new Button("Ж");
        Button bЗ = new Button("З");
        Button bИ = new Button("И");
        Button bЙ = new Button("Й");
        Button bК = new Button("К");
        Button bЛ = new Button("Л");
        Button bМ = new Button("М");
        Button bН = new Button("Н");
        Button bО = new Button("О");
        Button bП = new Button("П");
        Button bР = new Button("Р");
        Button bС = new Button("С");
        Button bТ = new Button("Т");
        Button bУ = new Button("У");
        Button bФ = new Button("Ф");
        Button bХ = new Button("Х");
        Button bЦ = new Button("Ц");
        Button bЧ = new Button("Ч");
        Button bШ = new Button("Ш");
        Button bЩ = new Button("Щ");
        Button bЪ = new Button("Ъ");
        Button bЫ = new Button("Ы");
        Button bЬ = new Button("Ь");
        Button bЭ = new Button("Э");
        Button bЮ = new Button("Ю");
        Button bЯ = new Button("Я");
        Button bClose = new Button("Ок");
        Button b_ = new Button(" ");

        pane.getChildren().add(bА);
        pane.getChildren().add(bБ);
        pane.getChildren().add(bВ);
        pane.getChildren().add(bД);
        pane.getChildren().add(bГ);
        pane.getChildren().add(bЕ);
        pane.getChildren().add(bЁ);
        pane.getChildren().add(bЖ);
        pane.getChildren().add(bЗ);
        pane.getChildren().add(bИ);
        pane.getChildren().add(bЙ);
        pane.getChildren().add(bК);
        pane.getChildren().add(bЛ);
        pane.getChildren().add(bМ);
        pane.getChildren().add(bН);
        pane.getChildren().add(bО);
        pane.getChildren().add(bП);
        pane.getChildren().add(bР);
        pane.getChildren().add(bС);
        pane.getChildren().add(bТ);
        pane.getChildren().add(bУ);
        pane.getChildren().add(bФ);
        pane.getChildren().add(bХ);
        pane.getChildren().add(bЦ);
        pane.getChildren().add(bЧ);
        pane.getChildren().add(bШ);
        pane.getChildren().add(bЩ);
        pane.getChildren().add(bЪ);
        pane.getChildren().add(bЫ);
        pane.getChildren().add(bЬ);
        pane.getChildren().add(bЭ);
        pane.getChildren().add(bЮ);
        pane.getChildren().add(bЯ);
        //pane.getChildren().add(bClose);
        pane.getChildren().add(b_);


        bА.setOnAction(event -> word = 'А');
        bБ.setOnAction(event -> word = 'Б');
        bВ.setOnAction(event -> word = 'В');
        bД.setOnAction(event -> word = 'Д');
        bГ.setOnAction(event -> word = 'Г');
        bЕ.setOnAction(event -> word = 'Е');
        bЁ.setOnAction(event -> word = 'Ё');
        bЖ.setOnAction(event -> word = 'Ж');
        bЗ.setOnAction(event -> word = 'З');
        bИ.setOnAction(event -> word = 'И');
        bЙ.setOnAction(event -> word = 'Й');
        bК.setOnAction(event -> word = 'К');
        bЛ.setOnAction(event -> word = 'Л');
        bМ.setOnAction(event -> word = 'М');
        bН.setOnAction(event -> word = 'Н');
        bО.setOnAction(event -> word = 'О');
        bП.setOnAction(event -> word = 'П');
        bР.setOnAction(event -> word = 'Р');
        bС.setOnAction(event -> word = 'С');
        bТ.setOnAction(event -> word = 'Т');
        bУ.setOnAction(event -> word = 'У');
        bФ.setOnAction(event -> word = 'Ф');
        bХ.setOnAction(event -> word = 'Х');
        bЦ.setOnAction(event -> word = 'Ц');
        bЧ.setOnAction(event -> word = 'Ч');
        bШ.setOnAction(event -> word = 'Ш');
        bЩ.setOnAction(event -> word = 'Щ');
        bЪ.setOnAction(event -> word = 'Ъ');
        bЫ.setOnAction(event -> word = 'Ы');
        bЬ.setOnAction(event -> word = 'Ь');
        bЭ.setOnAction(event -> word = 'Э');
        bЮ.setOnAction(event -> word = 'Ю');
        bЯ.setOnAction(event -> word = 'Я');
        b_.setOnAction(event -> word = ' ');



        Scene scene = new Scene(pane,300,200);
        window.setScene(scene);
        window.setTitle(title);
        window.showAndWait();
        return word;

    }
}