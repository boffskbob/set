import java.awt.*;
import java.awt.event.*;

public class CardItemListener implements ItemListener {
    private Card myCard;
    private CardSelectionHandler handler;

    public CardItemListener(Card c, CardSelectionHandler h) {
        myCard = c;
        handler = h;
    }

    public void itemStateChanged(ItemEvent e) {
        // Selected
        if (e.getStateChange() == ItemEvent.SELECTED) {
            handler.cardSelected(myCard);
        }
        // Not selected
        else {
            handler.cardDeselected(myCard);
        }
    }
}