/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alutiiq-it
 */
public class JavaFXApplicationExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("FXML_Info.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("FXML_AltaArticulo.fxml"));
        
        Scene scene = new Scene(root);

        stage.setTitle("Java Day Demo");
        stage.setWidth(650);
        stage.setHeight(650);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
