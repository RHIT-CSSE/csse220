//package liveCoding;
//
//import javax.swing.JComponent;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import java.util.ArrayList;
//
//public class CatComponent extends JComponent {
//    private ArrayList<Cat> cats;
//
//    public CatComponent() {
//        this.cats = new ArrayList<>();
//        this.cats.add(new Cat()); // default cat
//        this.cats.add(new Cat(120, 200, 400));
//        this.cats.add(new Cat(250, 500, 350, Color.MAGENTA, Color.CYAN));
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//
//        for (Cat cat : this.cats) {
//            cat.drawOn(g2);
//        }
//    }
//}
