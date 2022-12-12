import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CircleGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;
    private CircleGUI(){
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
    public static void main(String[] args) {
        CircleGUI app = new CircleGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
