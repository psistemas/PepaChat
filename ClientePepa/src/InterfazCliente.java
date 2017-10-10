
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Junior Garcia
 */
public class InterfazCliente extends JFrame implements ActionListener{
    
    JTextField textField;
    JButton btnSend;
    public InterfazCliente(){
        super("PepaCliente");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        createContent();
    }
    
    public void createContent(){
        JPanel panelChat = new JPanel();
        panelChat.setLayout(new BorderLayout());
        textField = new JTextField(20);
        btnSend = new JButton("Enviar");
        btnSend.addActionListener(this);
        panelChat.add(textField, BorderLayout.CENTER);
        panelChat.add(btnSend, BorderLayout.SOUTH);
        
        add(panelChat, BorderLayout.CENTER);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSend){
           
        }
    }
    
    
    
    
    
}
