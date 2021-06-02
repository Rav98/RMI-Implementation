/*
 * @author Rafael Antunes Vieira -- 2018000980
 */

// Importação das bibliotecas do RMI
import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface do cliente
// Declara-se os metodos que serão utilziados pelo cliente 
public interface Interface extends Remote {
    // Metodo Bhaskara
    public String Bhaskara(double a, double b, double c) throws RemoteException;
}
