import java.util.Locale;
import java.util.Scanner;

/**
 * Classe para objetos do tipo Conta, onde serão capturados através do terminal
 * valores para o mesmo.
 * 
 * @author Vinícius Santos
 * @version 0.1
 * @since 06-09-2023
 */

public class ContaTerminal {

    /**
     * Método principal para receber dados via terminal, por meio da classe Scanner
     * no fim da captura das informações irá trazer um resumo da conta.
     * 
     * @author Vinícius Santos
     * @param numero       int - Número da conta.
     * @param agencia      String - Número da agência.
     * @param nomeCliente  String - Nome do Cliente.
     * @param saldo        Double - Saldo da conta.
     * 
     */

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta. ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência. ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente. ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta. ");
        saldo = scanner.nextDouble();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo));

        scanner.close();

    }
}
