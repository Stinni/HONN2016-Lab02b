package is.ru.honn.draw;

/**
 * Klasinn Page (Page.java)
 * TODO: ...
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
import java.awt.Graphics;
import java.util.ArrayList;

import is.ru.honn.draw.shapes.Shape;

public class Page
{
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void add(Shape s)
    {
        shapes.add(s);
    }

    public void paint(Graphics g)
    {
        for(Drawable d: shapes)
        {
            d.draw(g);
        }
    }
}
