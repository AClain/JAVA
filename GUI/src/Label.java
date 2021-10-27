import javax.swing.*;
import java.awt.*;

public class Label {
    private final JLabel label;

    public Label(String text, Color textColor) {
        this.label = new JLabel(text);

        Font labelFont = this.label.getFont();

        this.label.setForeground(textColor);

        // Set the label's font size to the newly determined size.
        this.label.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
    }

    public JLabel get() {
        return this.label;
    }

    public void setText(String text) {
        this.label.setText(text);
    }
}
