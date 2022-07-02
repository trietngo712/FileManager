module com.minhtriet.filemanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.minhtriet.filemanager to javafx.fxml;
    exports com.minhtriet.filemanager;
    exports ViewController;
    opens ViewController to javafx.fxml;
}