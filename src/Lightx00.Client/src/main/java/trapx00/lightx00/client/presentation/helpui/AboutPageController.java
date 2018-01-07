package trapx00.lightx00.client.presentation.helpui;

import com.jfoenix.controls.JFXSnackbar;
import javafx.scene.control.Label;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseEvent;
import trapx00.lightx00.client.Client;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class AboutPageController implements ExternalLoadableUiController {
    public Label textLicense;
    public String licenseText;

    public void onRepositoryAddressClicked(MouseEvent mouseEvent) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("http://101.37.19.32:10080/trap-x00/ERPnju"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void initialize() throws IOException {
        File licenseFile = new File(Client.class.getResource("/others/LICENSE").getPath());
        licenseText = new String(Files.readAllBytes(licenseFile.toPath()), StandardCharsets.UTF_8);
        textLicense.setText(licenseText);
    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/helpui/AboutPage.fxml").loadAndGetPackageWithoutException();
    }

    public void onLabelClicked(MouseEvent mouseEvent) {
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(licenseText);
        clipboard.setContent(content);
        JFXSnackbar bar = new JFXSnackbar(FrameworkUiManager.getDialogContainer());
        bar.enqueue(new JFXSnackbar.SnackbarEvent("复制成功","-fx-background-color: white;"));
    }
}
