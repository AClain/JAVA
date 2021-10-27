import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Objects;

public class Button implements ActionListener {
    private final JButton button;

    public Button(String label, Integer ...size) {
        this.button = new JButton();
        this.button.setText(label);

        this.resize(size);
    }

    public void resize(Integer ...size) {
        int width = 50;
        int height = 25;

        if (size.length == 1) {
            width = size[0];
            height = size[0];
        } else if (size.length == 2) {
            width = size[0];
            height = size[1];
        }

        this.button.setPreferredSize(new Dimension(width, height));
        this.button.setMaximumSize(new Dimension(width, height));
    }

    public void setTransparent() {
        this.button.setOpaque(false);
        this.button.setContentAreaFilled(false);
        this.button.setBorderPainted(false);
    }

    public void setIcon(String path) {
        this.button.setText("");

        try {
            Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(path)));

            Dimension size = this.button.getSize();
            Insets insets = this.button.getInsets();
            size.width -= insets.left + insets.right;
            size.height -= insets.top + insets.bottom;
            if (size.width > size.height) {
                size.width = -1;
            } else {
                size.height = -1;
            }
            Image scaled = img.getScaledInstance(size.width, size.height, java.awt.Image.SCALE_SMOOTH);
            this.button.setIcon(new ImageIcon(scaled));

            this.button.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    JButton btn = (JButton) e.getComponent();
                    Dimension size = btn.getSize();
                    Insets insets = btn.getInsets();
                    size.width -= insets.left + insets.right;
                    size.height -= insets.top + insets.bottom;
                    if (size.width > size.height) {
                        size.width = -1;
                    } else {
                        size.height = -1;
                    }
                    Image scaled = img.getScaledInstance(size.width, size.height, java.awt.Image.SCALE_SMOOTH);
                    btn.setIcon(new ImageIcon(scaled));
                }

            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setCursor(int cursor) {
        this.get().setCursor(Cursor.getPredefinedCursor(cursor));
    }

    public JButton get() {
        return this.button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
