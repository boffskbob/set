import java.util.Collections;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Dimension;

public class Board {
    static int max_cards = 12;
    static ArrayList<Card> cards = new ArrayList<>();
    static ArrayList<JToggleButton> buttons = new ArrayList<>();
    JFrame frame;
    Deck deck;
    CardSelectionHandler selectionHandler;

    public Board(Deck deck, JFrame frame, CardSelectionHandler gamemaster) {
        this.deck = deck;
        this.frame = frame;
        this.selectionHandler = gamemaster;
        for (int i = 0; i < 12; i++) {
            JToggleButton button = new JToggleButton();
            buttons.add(button);
        }
        Deal();

    }

    // start the game
    public void Deal() {
        for (int i = 0; i < 12; i++) {
            Card new_card = deck.Draw();
            new_card.setPosition(i);
            cards.add(new_card);
        }
        displayBoard();
    }

    public void Add() {
        // TODO: when no match
    }

    public void Remove(int[] card_indicies) {
        // TODO: 12 vs 12+
        Replace(card_indicies);
        displayBoard();
    }

    // remove cards
    public void Replace(int[] card_indicies) {
        for (int i = 0; i < 3; i++) {
            int index = card_indicies[i];
            Card new_card = deck.Draw();
            new_card.setPosition(index);
            cards.set(index, new_card);
        }
    }

    // rewrite frame
    private void displayBoard() {
        // frame.getContentPane().removeAll();
        for (int i = 0; i < 12; i++) {
            JToggleButton button = buttons.get(i);
            // button.setPreferredSize(new Dimension(50, 50));
            Card card = cards.get(i);
            button.setText(card.toString());
            // attach item listener to each card
            button.addItemListener(new CardItemListener(card, selectionHandler));
            frame.add(button);
        }
        frame.revalidate();
        frame.repaint();
    }
}
