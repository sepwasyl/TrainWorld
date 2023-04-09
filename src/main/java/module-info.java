module com.rydwas.trainworld {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.rydwas.trainworld to javafx.fxml;
    exports com.rydwas.trainworld;
}