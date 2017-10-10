
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Junior Garcia
 */
public class InterfazServidor extends JFrame{

    JTextArea textArea;
    JButton btnSend;

    public InterfazServidor() {
        super("PepaServer");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createContent();
    }

    public void createContent() {
        JPanel panelChat = new JPanel();
        panelChat.setLayout(new BorderLayout());
        textArea = new JTextArea();
        panelChat.add(textArea, BorderLayout.CENTER);

        add(panelChat, BorderLayout.CENTER);
    }

  
}
