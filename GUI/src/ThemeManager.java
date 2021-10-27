import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class ThemeManager {
    private String theme;

    public ThemeManager() {
        this.theme = "dark";
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void switchTheme(JFrame contextFrame, ArrayList<Label> labels) {
        if (Objects.equals(this.getTheme(), "dark")) {
            this.setTheme("light");
            contextFrame.getContentPane().setBackground(new Color(241, 241, 241));
            for (int i = 0 ; i < labels.size() ; i++) {
                labels.get(i).get().setForeground(Color.DARK_GRAY);
            }
            return;
        }

        this.setTheme("dark");
        contextFrame.getContentPane().setBackground(new Color(34, 40, 49));
        for (int i = 0 ; i < labels.size() ; i++) {
            labels.get(i).get().setForeground(Color.WHITE);
        }
    }

    public String getThemeIcon() {
        String iconPath = "resources/moon.png";

        if (Objects.equals(this.getTheme(), "dark")) {
            iconPath = "resources/sun.png";
        }

        return iconPath;
    }
}
