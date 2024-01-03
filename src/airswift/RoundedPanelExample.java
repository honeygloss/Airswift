package airswift;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedPanelExample extends JPanel {
    private int arcRadius;

    public RoundedPanelExample(int arcRadius) {
        this.arcRadius = arcRadius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, arcRadius, arcRadius);
        g2d.setColor(getBackground());
        g2d.fill(roundedRectangle);

        g2d.dispose();
    }
}
