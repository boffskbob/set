import javax.swing.*;

public class Gamemaster implements CardSelectionHandler {
    private JFrame frame;
    private Board board;
    private Deck deck;
    // so gaemaster in charge of dealing cards and checking sets, app is j in charge
    // of existing and hosting the window/running stuff
    // keyboard keyboard keyboard keyboard keyboard keyboard uhhh keyboard keyboard
    // okayboard woooooaoaooaho caught in a bad romance rah rah rah ah ah

    public Gamemaster(JFrame frame) {
        this.frame = frame;
        this.deck = new Deck();
        this.board = new Board(this.deck, this.frame, this);
    }

    @Override
    public void cardSelected(Card card) {
        System.out.println("selected!" + card);
    }

    @Override
    public void cardDeselected(Card card) {
        System.out.println("unselectd!");
    }
}
