/*
 * @author Rafael Antunes Vieira -- 2018000980
 */

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

// Classe servidor faz com que o servidor suba disponibilizando o método que o usuario irá usar 
public class Servidor {

    Servidor() {
        try {
            // Disponibiliza o servidor no IP e Porta setados
            System.setProperty("java.rmi.server.hostname", "192.168.0.104");
            LocateRegistry.createRegistry(1099);
            Interface Servidor = new ImplementacaoBhaskara();
            // Metodo que recebe o serviço disponibilizado e o objeto remode que tem a implementação
            Naming.bind("Baskara", (Remote) Servidor);
            System.out.print("\n\nServidor ATIVO!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main servidor que chama o metodo responsavel por subir o servidor
    public static void main(String[] args) {
        new Servidor();
    }
}
