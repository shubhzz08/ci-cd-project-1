import java.awt.*;
import javax.swing.*;

public class CollegeAdmissionPage {
    public static void main(String[] args) {
        // Check if the environment is headless
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("This application requires a graphical environment.");
            System.exit(1);
        }

        // Run the GUI code on the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Create JFrame
        JFrame frame = new JFrame("College Admission Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create JPanel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Set JFrame visibility
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Name Label
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        // Name Text Field
        JTextField nameTextField = new JTextField(20);
        nameTextField.setBounds(100, 20, 165, 25);
        panel.add(nameTextField);

        // Age Label
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10, 50, 80, 25);
        panel.add(ageLabel);

        // Age Text Field
        JTextField ageTextField = new JTextField(20);
        ageTextField.setBounds(100, 50, 165, 25);
        panel.add(ageTextField);

        // Gender Label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(10, 80, 80, 25);
        panel.add(genderLabel);

        // Gender Combo Box
        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(100, 80, 165, 25);
        panel.add(genderComboBox);

        // Major Label
        JLabel majorLabel = new JLabel("Intended Major:");
        majorLabel.setBounds(10, 110, 100, 25);
        panel.add(majorLabel);

        // Major Text Field
        JTextField majorTextField = new JTextField(20);
        majorTextField.setBounds(100, 110, 165, 25);
        panel.add(majorTextField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 160, 80, 25);
        panel.add(submitButton);
    }
}
