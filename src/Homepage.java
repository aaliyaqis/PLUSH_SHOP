import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Homepage {
    private JFrame frame;

    public void show() {
        //main frame
        frame = new JFrame("☆☆☆☆☆ HOMEPAGE ☆☆☆☆☆");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setVisible(true);

        //left panel (pink)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.PINK);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        JLabel titleLabel =  new JLabel ("PLUSH SHOP");
        titleLabel.setFont(new Font ("Arial", Font.BOLD, 36));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
