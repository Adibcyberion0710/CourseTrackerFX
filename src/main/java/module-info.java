module com.adib.coursetracker {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.adib.coursetracker to javafx.fxml;
    exports com.adib.coursetracker;
}
