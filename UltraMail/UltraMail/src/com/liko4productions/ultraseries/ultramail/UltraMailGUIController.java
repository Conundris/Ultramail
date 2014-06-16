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
import javafx.stage.Stage;

public class UltraMailGUIController implements Initializable {
    // Ultramail.fxml
 //Variablendeklarationen
    private String mailText = "";
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
    private void showSettings() throws Exception
    {
        WindowController test2 = new WindowController();
        Stage stage = new Stage();
        test2.addWindow(stage, "Settings.fxml", "Settings");
        
    }
    
      @FXML
    private void generateMail(ActionEvent event) {
        
        //Start und Konfigurationen
        System.out.println("Generating mail...");
        lblInfo.setText("Generierung läuft...");
        
        //Setze den Namen und die Begrüssungsformel des Mail-Empfängers
        mailText = getGreeting(txtFieldAdress.getText());
        
        //Abfrage ob "Zur Kenntnisnahme" angeklick
        if (cBoxAsInformation.isSelected()) {
            mailText = mailText + "Bitte nehmen Sie die folgenden Informationen zur Kenntnis.<br>";
        }
        
        //Den Betreff auslesen
        mailText = mailText + txtFieldSubject.getText() + "<br><br>";
        
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
        mailText = "<p style=\"font-family:Calibri;\">" + mailText + "</p>";
        mailEditor.setHtmlText(mailText);
        
        //Abschlusskonfigurationen
        System.out.println("Mail generation successfully completed!");
        lblInfo.setText("Generierung erfolgreich abgeschlossen!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }
    
    private String getGreeting(String eingabe) {
        String output = "";
        
        if (eingabe.contains("@")) {
            String vorname = eingabe.substring(0, eingabe.indexOf("."));
            String nachname = eingabe.substring(eingabe.indexOf(".") + 1, eingabe.indexOf("@"));
        }
        
        return output + "<br><br>";
    }
    
    private AdressListRecord searchAdressList(String name1, String name2, String adresse) {
        AdressListRecord adressRecord = new AdressListRecord();
        adressRecord.Adresse = "yannik.beimler@ebcom.ch";
        adressRecord.Beziehung = "Guten Tag %Geschlecht";
        adressRecord.Vorname = "Yannik";
        adressRecord.Geschlecht = "Beimer";
        adressRecord.Spitzname = "Stubii";
        adressRecord.Grussformel = "Viele Grüsse";
        return adressRecord;
    }

}

