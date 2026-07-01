import javax.swing.*;

public class Card {
    private int count;
    private int shape;
    private int shade;
    private int color;

    private int position;

    private JToggleButton button = null;

    public Card(int card_count, int card_shape, int card_shade, int card_color) {
        this.count = card_count;
        this.shape = card_shape;
        this.shade = card_shade;
        this.color = card_color;
    }

    public void displayCard(JFrame game) {

    }

    // Card will know where it is on the board, so it can be removed from the board
    // and replaced
    // when selected
    public void setPosition(int new_position) {
        this.position = new_position;
    }

    public int getPosition() {
        return this.position;
    }

    public String toString() {
        return String.valueOf(count) + String.valueOf(shape) + String.valueOf(shade) + String.valueOf(color);
    }

    public void setButton(JToggleButton button) {
        this.button = button;
    }

}
