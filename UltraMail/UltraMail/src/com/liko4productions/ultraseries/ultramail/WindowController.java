package com.liko4productions.ultraseries.ultramail;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author jason
 */
public class WindowController {
    
    private UltraMailGUIController controller;
    
    public void addWindow (Stage stage, Scene scene, String fxml, String title) throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        
        AnchorPane scene = (AnchorPane)fxmlLoader.load();
        controller = (UltraMailGUIController) fxmlLoader.getController();
       
        stage.setScene(new Scene(scene));
        stage.setTitle(title);
        stage.show();
        
    }
}
