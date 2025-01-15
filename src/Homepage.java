import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


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
        leftPanel.add(Box.createVerticalStrut(20)); // Spacer
        leftPanel.add(titleLabel);

        // Add description to left panel
        JLabel descriptionLabel = new JLabel("<html>Try the best donuts in Lugano with free delivery.<br>" +
                "You can combine your own unique taste<br>with the donut constructor!</html>");
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftPanel.add(Box.createVerticalStrut(20)); // Spacer
        leftPanel.add(descriptionLabel);

        // Add Menu button to left panel
        JButton menuButton = new JButton("MENU");
        menuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftPanel.add(Box.createVerticalStrut(20)); // Spacer
        leftPanel.add(menuButton);

        // Right Panel (Image placeholder)
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);

        // Add a placeholder image
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("donuts.jpg"); // Replace with your donut image path
        Image scaledImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage));
        rightPanel.add(imageLabel);

        // Add panels to the frame
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.CENTER);

    }
}
