module mainpkg.projectname {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.projectname to javafx.fxml;
    exports mainpkg.projectname;
}