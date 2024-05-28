import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println(
                        " ____                          ____ ___ ___  \n" +
                        "| __ )  __ _ _ __   ___ ___   |  _ \\_ _/ _ \\ \n" +
                        "|  _ \\ / _` | '_ \\ / __/ _ \\  | | | | | | | |\n" +
                        "| |_) | (_| | | | | (_| (_) | | |_| | | |_| |\n" +
                        "|____/ \\__,_|_| |_|\\___\\___/  |____/___\\___/ "
        );


        Scanner terminal = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Bem-vindo(a) ao Banco DIO!! Vamos criar sua conta no nosso incrível banco?!  ;D");
        System.out.println(" ");

        System.out.println("Informe seu nome completo:");
        String name = terminal.nextLine();

        System.out.println("Informe a agência:");
        String agency = terminal.nextLine();

        System.out.println("Informe o número da conta:");
        int accountNumber = terminal.nextInt();

        System.out.println("Informe o saldo:");
        double balance = terminal.nextDouble();


        System.out.println("Olá [" + name + "], obrigado por criar uma conta em nosso banco, sua agência é [" + agency + "], conta [" + accountNumber + "] e seu saldo [" + balance + "] já está disponível para saque.");
    }
}
