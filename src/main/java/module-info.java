module com.rydwas.trainworld {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires org.jetbrains.annotations;


    opens com.rydwas.trainworld to javafx.fxml;
    exports com.rydwas.trainworld;
}