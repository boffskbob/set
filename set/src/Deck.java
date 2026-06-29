import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    static ArrayList<Card> cards = new ArrayList<>();
    static int index = 0;

    public Deck() {
        // Create Deck (in order)
        for (int count = 0; count < 3; count++) {
            for (int shape = 0; count < 3; count++) {
                for (int shade = 0; shade < 3; shade++) {
                    for (int color = 0; color < 3; color++) {
                        Card new_card = new Card(count, shape, shade, color);
                        cards.add(new_card);
                    }
                }
            }
        }
        // Shuffle Deck
        Collections.shuffle(cards);
    }

    public Card Draw() {
        // Raise error?
        if (index >= 81) {
            return null;
        }
        Card drawn_card = cards.get(index);
        index++;
        return drawn_card;
    }
}
