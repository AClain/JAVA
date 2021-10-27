import java.awt.*;

public class Main  {
	public static void main(String[] args) {
		GUI gui = new GUI();

		gui.build(new FlowLayout(FlowLayout.LEFT));
		gui.build(new FlowLayout());
		gui.build(new FlowLayout());
		gui.resize(750, 350);

		ClickManager cm = new ClickManager();
		ThemeManager tm = new ThemeManager();

		Button minusButton = new Button("Decrease");
		minusButton.setIcon("resources/minus.png");
		minusButton.setTransparent();
		minusButton.setCursor(Cursor.HAND_CURSOR);
		minusButton.resize(150, 75);

		Button resetButton = new Button("Reset");
		resetButton.setIcon("resources/refresh.png");
		resetButton.setTransparent();
		resetButton.setCursor(Cursor.HAND_CURSOR);
		resetButton.resize(150, 75);

		Button plusButton = new Button("Increase");
		plusButton.setIcon("resources/plus.png");
		plusButton.setTransparent();
		plusButton.setCursor(Cursor.HAND_CURSOR);
		plusButton.resize(150, 75);

		gui.addButton(minusButton, 1);
		gui.addButton(resetButton, 1);
		gui.addButton(plusButton, 1);

		Label clicksLabel = new Label("0", Color.WHITE);
		gui.addLabel(clicksLabel, 2);

		Button themeButton = new Button("Switch theme");
		themeButton.setIcon("resources/sun.png");
		themeButton.setTransparent();
		themeButton.setCursor(Cursor.HAND_CURSOR);
		themeButton.resize(100, 50);
		gui.addButton(themeButton, 0);

		plusButton.get().addActionListener((e) -> {
			cm.increment();
			clicksLabel.setText(Integer.toString(cm.getClicks()));
		});

		resetButton.get().addActionListener((e) -> {
			cm.reset();
			clicksLabel.setText("0");
		});

		minusButton.get().addActionListener((e) -> {
			cm.decrement();
			clicksLabel.setText(Integer.toString(cm.getClicks()));
		});

		themeButton.get().addActionListener((e) -> {
			tm.switchTheme(gui.getFrame(), gui.getLabels());
			themeButton.setIcon(tm.getThemeIcon());
		});

		gui.setMinimumSize(500, 250);
		gui.setBackgroundColor(34, 40, 49);
		gui.launch(false);
    }
}
