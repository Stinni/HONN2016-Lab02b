package is.ru.honn.draw.shapes;

/**
 * Klasinn Rectangle (Rectangle.java)
 * Layered Supertype fyrir teiknihluti
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
import java.awt.*;

public class Rectangle extends Shape
{
    private int width, height;

    public Rectangle(int x, int y, int width, int height, Color color)
    {
        super.x = x;
        super.y = y;
        this.height = height;
        this.width = width;
        super.color = color;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }
}
