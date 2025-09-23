package liveCoding;

import javax.swing.JComponent;
import java.util.ArrayList;

public class CatComponent extends JComponent {
    private ArrayList<Cat> cats;

    public CatComponent() {
        this.cats = new ArrayList<>();
        // TODO - add some Cat objects to the list
    }

    // TODO: override paintComponent to draw all the cats in the list
}
