/**
 *
 * @author Junior Garcia
 */
public class Main {
        public static void main(String[] args) {
        
        InterfazServidor interfaz = new InterfazServidor();
        interfaz.setVisible(true);
        
       Thread hiloServer = new Thread(interfaz);
       hiloServer.start();
    }
}
