package is.ru.honn.draw.shapes;

/**
 * Klasinn Shape (Shape.java)
 * Layered Supertype fyrir teiknihluti
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
import is.ru.honn.draw.Drawable;

import java.awt.*;

abstract public class Shape implements Drawable
{
    protected int x, y;
    protected Color color;

    public abstract void draw(Graphics g);
}
