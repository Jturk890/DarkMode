import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Main class that extends JFrame and implements ActionListener for handling button events
public class DarkMode extends JFrame implements ActionListener {

    // Declaring the main JFrame, JLabel, and two JButtons
    JFrame frame = new JFrame("DARK MODE");
    JLabel label1 = new JLabel();
    JButton onbt = new JButton();
    JButton offbt = new JButton();

    // Constructor to initialize the frame setup
    DarkMode() {
        makeFrame();
    }

    public static void main(String[] args) {
        DarkMode dk = new DarkMode();
    }

    // Method to set up the frame and its components
    private void makeFrame() {
        // Setting up the label
        label1.setText("DARK MODE");                // Setting text for the label
        label1.setBounds(70, 0, 100, 50);           // Setting the position and size of the label
        label1.setHorizontalAlignment(JLabel.CENTER); // Center aligning the label text

        // Setting up the 'ON' button
        onbt.setBounds(70, 50, 100, 30);            // Setting the position and size of the button
        onbt.setBackground(Color.white);
        onbt.setText("ON");
        onbt.setFocusable(false);
        onbt.addActionListener(this);

        // Setting up the 'OFF' button
        offbt.setBounds(70, 100, 100, 30);          // Setting the position and size of the button
        offbt.setBackground(Color.white);
        offbt.setText("OFF");
        offbt.setFocusable(false);
        offbt.addActionListener(this);

        // Setting up the frame
        frame.setSize(250, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(label1);
        frame.add(onbt);
        frame.add(offbt);
    }

    // Overriding the actionPerformed method to handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handling the 'ON' button click event
        if(e.getSource() == onbt) {
            frame.getContentPane().setBackground(Color.BLACK); // Changing frame background to black
            onbt.setForeground(Color.WHITE);       // Changing 'ON' button text color to white
            onbt.setBackground(Color.BLACK);       // Changing 'ON' button background to black
            offbt.setForeground(Color.WHITE);      // Changing 'OFF' button text color to white
            offbt.setBackground(Color.BLACK);      // Changing 'OFF' button background to black
            label1.setForeground(Color.WHITE);     // Changing label text color to white
        }
        // Handling the 'OFF' button click event
        if(e.getSource() == offbt) {
            frame.getContentPane().setBackground(Color.WHITE); // Changing frame background to white
            onbt.setForeground(Color.BLACK);       // Changing 'ON' button text color to black
            onbt.setBackground(Color.WHITE);       // Changing 'ON' button background to white
            offbt.setForeground(Color.BLACK);      // Changing 'OFF' button text color to black
            offbt.setBackground(Color.WHITE);      // Changing 'OFF' button background to white
            label1.setForeground(Color.BLACK);     // Changing label text color to black
        }
    }
}