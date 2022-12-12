import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CircleGUI extends JFrame{
    JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;
    CircleGUI(){
        tfRadius.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enter_pressed();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enter_pressed();
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfArea.setText("");
                tfCircumference.setText("");
                tfRadius.setText("");
            }
        });

    }
    public void enter_pressed(){
        double r;
        r = Double.parseDouble(tfRadius.getText());
        tfArea.setText(String.format("%.2f", Math.PI * (r*r)));
        tfCircumference.setText(String.format("%.2f", Math.PI * r * 2));
    }
//    public static void main(String[] args) {
//
//    }
}
