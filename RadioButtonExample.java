import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        // Set positions
        male.setBounds(50, 50, 100, 30);
        female.setBounds(50, 80, 100, 30);

        // Group them (ensures only one selection)
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        // Add to frame
        frame.add(male);
        frame.add(female);

        // Make frame visible
        frame.setVisible(true);
    }
}