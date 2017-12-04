package trapx00.lightx00.client.presentation.helpui;

import javafx.scene.Parent;

public class ExternalLoadedUiPackage {
    private ExternalLoadableUiController controller;
    private Parent component;

    public ExternalLoadableUiController getController() {
        return controller;
    }

    public Parent getComponent() {
        return component;
    }

    public ExternalLoadedUiPackage(Parent component, ExternalLoadableUiController controller) {
        this.controller = controller;
        this.component = component;
    }
}
