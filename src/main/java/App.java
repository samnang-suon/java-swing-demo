import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {

    public App() {
        // Add controls/components
        JPanel centerPanel = new JPanel();
        JButton helloBtn = new JButton("Click Me");
        helloBtn.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 24));
        helloBtn.setSize(300, 200);
        helloBtn.addActionListener(this);
        centerPanel.add(helloBtn);
        this.add(centerPanel, BorderLayout.CENTER);

        this.setTitle("Demo App");
        this.setSize(600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        String name = JOptionPane.showInputDialog(null, "Please enter your name:", "Question", JOptionPane.QUESTION_MESSAGE);
        temp.setText("Hi " + name);
        temp.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 36));
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
