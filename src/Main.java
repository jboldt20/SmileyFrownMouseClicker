import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Fun");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new myCustomPanel());
        frame.pack();
        frame.setVisible(true);
        System.out.println("Hello world!");
    }
}