package ViewController;

import Manager.StateManager;
import com.dansoftware.pdfdisplayer.PDFDisplayer;
import com.dansoftware.pdfdisplayer.PdfJSVersion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;


public class AddViewController {
    @FXML
    private AnchorPane PdfView;
    @FXML
    private Button pickFileButton;

    private PDFDisplayer pdf;
    @FXML
    private TextField isoFileTextField;

    public void initialize() {
        //Create node that load and display pdf content
        pdf = new PDFDisplayer(PdfJSVersion._2_2_228);
        Node pdfNode = pdf.toNode();

        //Add node to pdfview
        this.PdfView.setBottomAnchor(pdfNode, 5.0);
        this.PdfView.setTopAnchor(pdfNode, 5.0);
        this.PdfView.setRightAnchor(pdfNode, 5.0);
        this.PdfView.setLeftAnchor(pdfNode, 5.0);
        this.PdfView.getChildren().add(pdfNode);

        //Add action to pickFileButton
        this.pickFileButton.setOnAction(e -> this.openFileChooser(e));

    }

    private void openFileChooser(ActionEvent e) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(StateManager.primaryStage);

        this.isoFileTextField.setText(file.getAbsolutePath());

        try {
            this.pdf.loadPDF(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
