import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderingFormPopup {

        private JFrame frame;

        public void show() {
            // Create a JFrame for the popup window
            frame = new JFrame("Create Your Special Taste!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLayout(new BorderLayout());
            frame.setResizable(false);

            // Main Panel
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            frame.add(mainPanel);

            // Title Label
            JLabel titleLabel = new JLabel("CREATE YOUR SPECIAL TASTE!", JLabel.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
            mainPanel.add(titleLabel, BorderLayout.NORTH);

            // Content Panel
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new GridLayout(5, 2, 10, 10)); // Rows, Columns, HGap, VGap
            contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            mainPanel.add(contentPanel, BorderLayout.CENTER);

            // Size Dropdown
            JLabel sizeLabel = new JLabel("SIZE:", JLabel.RIGHT);
            sizeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            JComboBox<String> sizeComboBox = new JComboBox<>(new String[]{"Regular", "Medium", "Large"});
            contentPanel.add(sizeLabel);
            contentPanel.add(sizeComboBox);

            // Filling Dropdown
            JLabel fillingLabel = new JLabel("FILLING:", JLabel.RIGHT);
            fillingLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            JComboBox<String> fillingComboBox = new JComboBox<>(new String[]{"Vanilla", "Chocolate", "Strawberry", "Custard"});
            contentPanel.add(fillingLabel);
            contentPanel.add(fillingComboBox);

            // Glaze Dropdown
            JLabel glazeLabel = new JLabel("GLAZE:", JLabel.RIGHT);
            glazeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            JComboBox<String> glazeComboBox = new JComboBox<>(new String[]{"Chocolate", "White Chocolate", "Caramel", "None"});
            contentPanel.add(glazeLabel);
            contentPanel.add(glazeComboBox);

            // Dressing Dropdown
            JLabel dressingLabel = new JLabel("DRESSING:", JLabel.RIGHT);
            dressingLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            JComboBox<String> dressingComboBox = new JComboBox<>(new String[]{"Sprinkles", "Chopped Nuts", "None"});
            contentPanel.add(dressingLabel);
            contentPanel.add(dressingComboBox);

            // Image Display (Placeholder)
            JPanel imagePanel = new JPanel();
            imagePanel.setLayout(new BorderLayout());
            JLabel imageLabel = new JLabel("Your donut image goes here", JLabel.CENTER);
            imageLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            imagePanel.add(imageLabel, BorderLayout.CENTER);
            contentPanel.add(new JLabel()); // Spacer to align the grid
            contentPanel.add(imagePanel);

            // Quantity and Total Price Panel
            JPanel quantityPanel = new JPanel();
            quantityPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            quantityPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

            JLabel quantityLabel = new JLabel("Quantity:");
            quantityLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            JTextField quantityField = new JTextField(5); // Small input field for quantity

            JLabel totalPriceLabel = new JLabel("Total Price: $0.00");
            totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 14));

            JButton calculateButton = new JButton("Calculate Total");
            calculateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int quantity = Integer.parseInt(quantityField.getText());
                        double pricePerItem = 5.0; // Assume $5 per item (customize as needed)
                        double totalPrice = quantity * pricePerItem;
                        totalPriceLabel.setText(String.format("Total Price: $%.2f", totalPrice));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Please enter a valid quantity.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            quantityPanel.add(quantityLabel);
            quantityPanel.add(quantityField);
            quantityPanel.add(calculateButton);
            quantityPanel.add(totalPriceLabel);
            mainPanel.add(quantityPanel, BorderLayout.SOUTH);

            // Display Frame
            frame.setVisible(true);
        }
    }


