import javax.swing.*;

public class App extends JFrame {

    public App() {
        this.setTitle("Demo App");
        this.setSize(600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
