/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.liko4productions.ultraseries.ultramail;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

/**
 *
 * @author b7kohll
 */
public class UltraMailGUIController implements Initializable {
    
    //Variablendeklarationen
    private String mailText = "";
    private String namePart1 = "";
    private String namePart2 = "";
    private String yourName = "Linus Kohler";
    
    @FXML
    private HTMLEditor mailEditor;
    
    @FXML
    private Label lblInfo;
    
    @FXML
    private TextField txtFieldAdress;
    
    @FXML
    private TextField txtFieldSubject;
    
    @FXML
    private CheckBox cBoxAttachment;
    
    @FXML
    private CheckBox cBoxRequestAnswer;
    
    @FXML
    private CheckBox cBoxAsInformation;
      
    @FXML
    private void generateMail(ActionEvent event) {
        
        //Start und Konfigurationen
        System.out.println("Generating mail...");
        lblInfo.setText("Generierung läuft...");
        
        //Setze den Namen und die Begrüssungsformel des Mail-Empfängers
        namePart1 = txtFieldAdress.getText();
        namePart2 = txtFieldAdress.getText();
        
        mailText = "Hallo " + namePart1 + "<br><br>";
        
        //Abfrage ob "Zur Kenntnisnahme" angeklick
        if (cBoxAsInformation.isSelected()) {
            mailText = mailText + "Bitte nehmen Sie die folgenden Informationen zur Kenntnis.<br>";
        }
        
        //Den Betreff auslesen
        mailText = mailText + txtFieldSubject.getText() + "<br>";
        
        //Abfrage ob "Anhang" angeklick
        if (cBoxAttachment.isSelected()) {
            mailText = mailText + "Die Datei befindet sich im Anhang.<br>";
        }
        
        //Abfrage ob "Erwarte Antwort" angeklick
        if (cBoxRequestAnswer.isSelected()) {
            mailText = mailText + "Vielen Dank für Ihre Antwort.<br>";
        }
        
        //Setze den Namen des Absenders und die Schlussformel
        mailText = mailText + "<br>" + "Viele Grüsse" + "<br>";
        mailText = mailText + yourName;
        
        //Mail generieren
        mailEditor.setHtmlText(mailText);
        
        //Abschlusskonfigurationen
        System.out.println("Mail generation successfully completed!");
        lblInfo.setText("Generierung erfolgreich abgeschlossen!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }
    
    private void searchNameAdress() {
        
    }

}

