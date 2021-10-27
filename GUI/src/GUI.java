import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    private final JFrame frame;
    private final JPanel mainPanel;
    private final ArrayList<JPanel> panels;
    private final ArrayList<Label> labels;

    public GUI() {
        this.frame = new JFrame();
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.PAGE_AXIS));
        this.mainPanel.setOpaque(false);
        this.panels = new ArrayList<>();
        this.labels = new ArrayList<>();
    }

    public void build(LayoutManager layout, Integer ...size) {
        JPanel panel = new JPanel();
        int top, right, bottom, left;

        if (size.length == 4) {
            top = size[0];
            right = size[1];
            bottom = size[2];
            left = size[3];
        } else {
            top =  10;
            right = 10;
            bottom = 10;
            left = 10;
        }

        panel.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
        panel.setLayout(layout);
        panel.setOpaque(false);

        this.panels.add(panel);

        this.mainPanel.add(panel);
    }

    public void resize(int width, int height) {
        this.frame.setPreferredSize(new Dimension(width, height));
    }

    public void setMinimumSize(int width, int height) {
        this.frame.setMinimumSize(new Dimension(width, height));
    }

    public void launch(Boolean resizable) {
        // Add panel to the frame
        this.frame.add(this.mainPanel, BorderLayout.CENTER);
        // Set what happens when you close the frame
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(resizable);
        this.frame.setTitle("GUI");
        // Set window to match a certain size
        this.frame.pack();
        // Center frame to center of screen
        this.frame.setLocationRelativeTo(null);
        // Set the window to be visible and in focus
        this.frame.setVisible(true);
    }

    public void addButton(Button button, int i) {
       JPanel panel = this.panels.get(i);
       panel.add(button.get());
    }

    public void addLabel(Label label, int i) {
        JPanel panel = this.panels.get(i);
        panel.add(label.get());

        this.labels.add(label);
    }

    public void setBackgroundColor(int r, int g, int b) {
        this.frame.getContentPane().setBackground(new Color(r,g,b));
    }

    public JFrame getFrame() {
        return frame;
    }

    public ArrayList<Label> getLabels() {
        return this.labels;
    }
}
