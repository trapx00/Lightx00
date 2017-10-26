package trapx00.lightx00.client.presentation.helpui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import de.jensd.fx.glyphs.materialicons.MaterialIconView;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Collections;


public class PromptDialogHelper {
    private Text titleText;
    private Text contentText;
    private ArrayList<JFXButton> buttonList = new ArrayList<>();
    private JFXDialog dialog = new JFXDialog(null,null, JFXDialog.DialogTransition.CENTER);

    public PromptDialogHelper(String title, String content) {
        Text titleText = new Text(title);
        titleText.setFont(Font.font(20));
        this.titleText = titleText;
        this.contentText  = new Text(content);
    }

    public Text getTitleText() {
        return titleText;
    }

    public PromptDialogHelper setTitleText(Text titleText) {
        this.titleText = titleText;
        return this;
    }

    public Text getContentText() {
        return contentText;
    }

    public PromptDialogHelper setContentText(Text contentText) {
        this.contentText = contentText;
        return this;
    }

    public PromptDialogHelper addCloseButton(Node icon, String content, EventHandler<? super MouseEvent> e) {
        JFXButton button = new JFXButton(content, icon);
        button.setOnMouseClicked(event -> {
            if (e!=null){
                e.handle(event);
            }

            dialog.close();
        });
        buttonList.add(button);
        return this;
    }

    public PromptDialogHelper addCloseButton(String content, String glyphName, EventHandler<? super MouseEvent> e){
        MaterialIconView icon  =new MaterialIconView();
        icon.setGlyphName(glyphName);
        icon.setGlyphSize(24);
        return addCloseButton(icon, content, e);
    }

    public PromptDialogHelper addButton(Node icon, String content, EventHandler<? super MouseEvent> e) {
        JFXButton button = new JFXButton(content, icon);
        button.setOnMouseClicked(e);
        buttonList.add(button);
        return this;
    }

    public PromptDialogHelper addButton(String content, String glyphName, EventHandler<? super MouseEvent> e) {
        MaterialIconView icon  =new MaterialIconView();
        icon.setGlyphName(glyphName);
        icon.setGlyphSize(24);
        return addButton(icon, content,e);
    }

    public PromptDialogHelper addButtons(JFXButton... buttons) {
        Collections.addAll(buttonList, buttons);
        return this;
    }

    public JFXDialog create(StackPane container) {
        JFXDialogLayout content = new JFXDialogLayout();
        content.setHeading(titleText);
        content.setBody(contentText);
        content.setActions(buttonList);
        dialog.setContent(content);
        dialog.setDialogContainer(container);
        return dialog;
    }
}
