import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myToggle extends JLabel {
    private ImageIcon smileyIcon;
    private ImageIcon frownyIcon;

    public myToggle() {
        setOpaque(true);
        setBackground(Color.green);
        setPreferredSize(new Dimension(1000,1000));

//        smileyIcon = new ImageIcon("/Volumes/CS/jframe/jframe/src/smiley.png");
//        frownyIcon = new ImageIcon("/Volumes/CS/jframe/jframe/src/frowny.png");

        smileyIcon = new ImageIcon("src/smiley.png");
        frownyIcon = new ImageIcon("src/frowny.png");
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    setIcon(smileyIcon);
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    setIcon(frownyIcon);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Color.red);

            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {

            }
        });
    }
}
