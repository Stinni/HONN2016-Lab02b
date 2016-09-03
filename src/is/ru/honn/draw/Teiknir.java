package is.ru.honn.draw;

/**
 * Forritið Teiknir (Teiknir.java)
 * TODO: ...
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
import is.ru.honn.draw.shapes.Rectangle;

import javax.swing.*;
import java.awt.*;

class Teiknir extends JPanel
{
    private Page page = new Page();

    public Teiknir ()
    {
        page.add(new Rectangle(100, 100, 200, 150, Color.blue));
        page.add(new Rectangle(50, 50, 200, 150, Color.red));
    }

    public static void main (String[] argv)
    {
        JFrame f = new JFrame ();

        f.setTitle("Teiknir");
        f.setResizable(true);
        f.setSize(500, 500);

        Teiknir panel = new Teiknir ();
        f.getContentPane().add(panel);
        f.setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        this.setBackground(Color.white);
        page.paint(g);
    }
}
