module cse213.simulating_operations_of_bsec {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.simulating_operations_of_bsec to javafx.fxml;
    exports cse213.simulating_operations_of_bsec;
}