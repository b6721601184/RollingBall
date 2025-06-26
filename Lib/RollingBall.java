package Lib;
import java.awt.*;
import javax.swing.*;

public final class RollingBall extends JFrame {

    Container cp;
    public RollingBall() {
        Intitial();
        setComponent();
        Finally();
    }

    public void Intitial() {
        cp = this.getContentPane();
        cp.setLayout(new GridBagLayout());
    }

    public void setComponent() {
        animCircle p = new animCircle();
        p.setPreferredSize(new Dimension(300,300));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        cp.add(p, gbc);
    }

    public void Finally() {
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class animCircle extends JPanel {
    private int degree = 0;
    private int size = 100;
    private int X = 100;
    private int Y = 100; 
 @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (int i = 0; i < 2; i++) {
            g2d.setColor(i % 2 == 0 ? Color.WHITE : Color.BLACK);
            g2d.fillArc(X, Y, size, size, degree + i * 180, 180);
        }

        g2d.setColor(Color.BLACK);
        g2d.drawOval(X, Y, size, size);
    }
    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }
}





