import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {

    // Attributes
    private JLabel responseMessage;

    public App() {
        // Add controls/components
        JPanel centerPanel = new JPanel();
        JButton helloBtn = new JButton("Click Me");
        helloBtn.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 24));
        helloBtn.setSize(300, 200);
        helloBtn.addActionListener(this);
        centerPanel.add(helloBtn);
        this.add(centerPanel, BorderLayout.CENTER);

        this.responseMessage = new JLabel();
        this.add(this.responseMessage, BorderLayout.SOUTH);

        this.setTitle("Demo App");
        this.setSize(600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        System.out.println("JButton text: " + temp.getText());
        String name = JOptionPane.showInputDialog(null, "Please enter your name:", "Question", JOptionPane.QUESTION_MESSAGE);
        this.responseMessage.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 36));
        this.responseMessage.setText("Hi " + name + " !!");

        // source: http://www.java2s.com/Tutorial/Java/0240__Swing/HorizontalAlignmentCENTER.htm
        this.responseMessage.setHorizontalAlignment(JLabel.CENTER);
        this.responseMessage.setVerticalAlignment(JLabel.CENTER);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
