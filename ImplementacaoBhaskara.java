/*
 * @author Rafael Antunes Vieira -- 2018000980
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementação do metodo listado na Interface
public class ImplementacaoBhaskara extends UnicastRemoteObject implements Interface {

    // Serealização do dado
    private static final long serialVersionULD = 1L;

    // Construtor
    protected ImplementacaoBhaskara() throws RemoteException {
        super();
    }

    // Implementação do metodo
    @Override
    public String Bhaskara(double a, double b, double c) throws RemoteException {

        double delta, x1, x2;
        delta = (b * b) + (-4 * (a * c));

        if (delta >= 0) {
            x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
            x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
            return ("\nValores das raizes:\nX1= " + x1 + "\nx2= " + x2);

        } else {
            return ("O Delta é negativo! Tente novamente com outros valores.");
        }
    }
}
