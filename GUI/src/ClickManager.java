public class ClickManager {
    private int clicks;

    public ClickManager() {
        this.clicks = 0;
    }

    public int getClicks() {
        return this.clicks;
    }

    public void increment() {
        this.clicks++;
    }

    public void reset() {
        this.clicks = 0;
    }

    public void decrement() {
        if (this.clicks > 0) {
            this.clicks--;
        }
    }
}
