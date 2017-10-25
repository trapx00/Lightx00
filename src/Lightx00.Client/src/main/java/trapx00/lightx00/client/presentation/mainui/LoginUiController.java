package trapx00.lightx00.client.presentation.mainui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class LoginUiController {
    @FXML private StackPane dialogContainer;
    @FXML private JFXButton loginButton;

    public void initialize(){
        JFXDialogLayout content= new JFXDialogLayout();
        content.setHeading(new Text("Error, No selection"));
        content.setBody(new Text("No student selected"));

        JFXDialog dialog = new JFXDialog(dialogContainer,content, JFXDialog.DialogTransition.CENTER);
        loginButton.setOnMouseClicked(e->{
            dialog.show();
        });
    }

}
