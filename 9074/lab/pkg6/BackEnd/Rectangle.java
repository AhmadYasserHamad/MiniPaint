/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.BackEnd;

import java.awt.*;
import java.awt.geom.*;
import java.util.Map;

/**
 *
 * @author ahmadyasserhamad
 */
public class Rectangle extends Common {

    public Rectangle(Point point, Map<String, Double> properties, Color color, Color fillColor) {
        super(point, properties, color, fillColor);
    }

    @Override
    public void draw(java.awt.Graphics canvas) {
        RenderingHints render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Graphics2D graphics2D = (Graphics2D) canvas;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(getPosition().x, getPosition().y, getProperties().get("length"), getProperties().get("width"));
        if (getFillColor() != null) {
            graphics2D.setColor(getFillColor());
            graphics2D.fill(rectangle);
        } else {
            graphics2D.setColor(getColor());
        }        graphics2D.draw(rectangle);
        graphics2D.setRenderingHints(render);
    }
}
