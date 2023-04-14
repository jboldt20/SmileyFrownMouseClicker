import javax.swing.*;
import java.awt.*;

public class myCustomPanel extends JPanel {
    myToggle mt;

    public myCustomPanel() {
        setPreferredSize(new Dimension(5000,5000));
        mt = new myToggle();
        add(mt);
    }
}
