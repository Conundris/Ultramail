package com.liko4productions.ultraseries.ultramail;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UltraMail extends Application {
    
//    public static Stage stage;
    private UltraMailGUIController controller;
    
    @Override
    public void start(Stage stage) throws Exception {
        
       /* FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UltraMailGUI.fxml"));
        
        AnchorPane mainScene = (AnchorPane)fxmlLoader.load();
        controller = (UltraMailGUIController) fxmlLoader.getController();
       
        stage.setScene(new Scene (mainScene));
        stage.setTitle("Ultra Mail");
        stage.show();*/
        
        WindowController test = new WindowController();
        test.addWindow(stage, "UltraMailGUI.fxml", "Ultra Mail");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        try {
//            StackPane page = (StackPane) FXMLLoader.load(Main.class.getResource("UltraMailGUI.fxml"));
//            Scene scene = new Scene(page);
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("FXML is Simple");
//            primaryStage.show();
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
}
