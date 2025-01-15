import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderingFormPopup {
    private JFrame frame;

    public void show() {
        // Create a JFrame for the popup window
        frame = new JFrame("☆☆☆☆☆ ORDERING FORM ☆☆☆☆☆ ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500); // Larger window size
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        // Main Split Panels
        JPanel leftPanel = new JPanel(); // Left: White Panel
        leftPanel.setBackground(Color.WHITE); // Set background to white

        JPanel rightPanel = new JPanel(); // Right: Pink Panel
        rightPanel.setBackground(new Color(255, 182, 193)); // Light Pink Color (RGB: 255, 182, 193)

        // Setting layout proportions for 1/2 and 1/2
        leftPanel.setPreferredSize(new Dimension(frame.getWidth() / 2, frame.getHeight()));
        rightPanel.setPreferredSize(new Dimension(frame.getWidth() / 2, frame.getHeight()));

        // Adding the panels to the frame
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);

        // Adding Content to Left Panel
        leftPanel.setLayout(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("CREATE YOUR SPECIAL TASTE!", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        leftPanel.add(titleLabel, BorderLayout.NORTH);

        // Content Panel (Dropdowns, etc.)
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(4, 2, 15, 15)); // Adjust grid to match layout
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        leftPanel.add(contentPanel, BorderLayout.CENTER);

        // Customize ComboBox for Pink Style
        UIManager.put("ComboBox.background", new Color(255, 182, 193)); // Set dropdown background to light pink
        UIManager.put("ComboBox.foreground", Color.BLACK); // Text color for readability
        UIManager.put("ComboBox.selectionBackground", new Color(255, 140, 160)); // Darker pink for selected item
        UIManager.put("ComboBox.selectionForeground", Color.WHITE); // White text for selected item

        // Size Dropdown
        JLabel sizeLabel = new JLabel("SIZE:", JLabel.RIGHT);
        sizeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JComboBox<String> sizeComboBox = new JComboBox<>(new String[]{"Regular", "Medium", "Large"});
        contentPanel.add(sizeLabel);
        contentPanel.add(sizeComboBox);

        // Filling Dropdown
        JLabel fillingLabel = new JLabel("FILLING:", JLabel.RIGHT);
        fillingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JComboBox<String> fillingComboBox = new JComboBox<>(new String[]{"Vanilla", "Chocolate", "Strawberry", "Custard"});
        contentPanel.add(fillingLabel);
        contentPanel.add(fillingComboBox);

        // Glaze Dropdown
        JLabel glazeLabel = new JLabel("GLAZE:", JLabel.RIGHT);
        glazeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JComboBox<String> glazeComboBox = new JComboBox<>(new String[]{"Chocolate", "White Chocolate", "Caramel", "None"});
        contentPanel.add(glazeLabel);
        contentPanel.add(glazeComboBox);

        // Dressing Dropdown
        JLabel dressingLabel = new JLabel("DRESSING:", JLabel.RIGHT);
        dressingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JComboBox<String> dressingComboBox = new JComboBox<>(new String[]{"Sprinkles", "Chopped Nuts", "None"});
        contentPanel.add(dressingLabel);
        contentPanel.add(dressingComboBox);

        // Quantity and Total Price Panel
        JPanel quantityPanel = new JPanel();
        quantityPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        quantityPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        quantityPanel.setBackground(Color.WHITE); // Set quantity panel background to white

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField quantityField = new JTextField(5); // Small input field for quantity

        JLabel totalPriceLabel = new JLabel("Total Price: $0.00");
        totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JButton calculateButton = new JButton("Calculate Total");
        calculateButton.setBackground(new Color(255, 182, 193)); // Set pink background
        calculateButton.setOpaque(true); // Ensure the background color is visible
        calculateButton.setBorderPainted(false); // Optional: remove the border for a cleaner look
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

        leftPanel.add(quantityPanel, BorderLayout.SOUTH);

        // Adding Content to Right Panel
        rightPanel.setLayout(new BorderLayout());

        // Placeholder for Donut Image
        JLabel donutImage = new JLabel("Your Image Here", JLabel.CENTER);
        donutImage.setFont(new Font("Arial", Font.ITALIC, 16));
        donutImage.setForeground(Color.DARK_GRAY);
        donutImage.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        donutImage.setBackground(Color.WHITE); // Set the donut image label's background to white
        donutImage.setOpaque(true); // Ensure the background is visible
        rightPanel.add(donutImage, BorderLayout.CENTER);

        // Display Frame
        frame.setVisible(true);
    }
}
