package trapx00.lightx00.client.presentation.helpui;

import javafx.scene.Parent;

public class ExternalLoadedUiPackage {
    public ExternalLoadableUiController controller;
    public Parent component;

    public ExternalLoadableUiController getController() {
        return controller;
    }

    public Parent getComponent() {
        return component;
    }

    public ExternalLoadedUiPackage(ExternalLoadableUiController controller, Parent component) {
        this.controller = controller;
        this.component = component;
    }
}
