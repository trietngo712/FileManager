package ViewController;

import com.dansoftware.pdfdisplayer.PDFDisplayer;
import com.dansoftware.pdfdisplayer.PdfJSVersion;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.IOException;


public class AddViewController {
    @FXML
    private AnchorPane PdfView;

    public void initialize() {
        PDFDisplayer pdf = new PDFDisplayer(PdfJSVersion._2_2_228);

        this.PdfView.getChildren().add(pdf.toNode());

        try {
            pdf.loadPDF(new File("D:\\Users\\Admin\\Desktop\\newGreenPass.pdf"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
