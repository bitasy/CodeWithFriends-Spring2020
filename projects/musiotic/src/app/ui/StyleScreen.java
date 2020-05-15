package ui;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import song.Style;
import song.StylePhase;

public class StyleScreen {
    private final StylePhase phase;
    private final Node screen;

    public StyleScreen(StylePhase phase){
        this.phase = phase;
        var content = new VBox();
        var label = new Label("Style");
        var complete = new Button("Next");
        complete.setOnMouseClicked(e -> {
            System.out.println("StyleScreen: \"next\" button clicked");
            phase.setStyle(Style.PIANO);
        });
        content.getChildren().addAll(label, complete);
        screen = content;
    }

    public Node getScreen(){
        System.out.println("StyleScreen: getScreen()");
        return screen;
    }
}