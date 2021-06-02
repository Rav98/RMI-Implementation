
import java.rmi.Naming;
import java.util.Scanner;

/*
 * @author Rafael Antunes Vieira -- 2018000980
 */
public class Cliente {

    // Cliente Recolhe os dados e passa os valores para o servidor
    public static void main(String[] args) {
        try {
            // Criando um objeto interface e informando para o cliente qual metodo ele tem que chamar
            Interface Servidor = (Interface) Naming.lookup("rmi://192.168.0.104:1099/Baskara");
            Scanner entrada = new Scanner(System.in);
            System.out.print("\n\nCalculadora de Bascara");
            System.out.print("\nDigite valor de A:");
            double a = entrada.nextDouble(); 
            System.out.print("\nDigite valor de B:");
            double b = entrada.nextDouble();
            System.out.print("\nDigite valor de C:");
            double c = entrada.nextDouble();
            System.out.println(Servidor.Bhaskara(a, b, c));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
