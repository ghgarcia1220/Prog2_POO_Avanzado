import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner ingreso = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("000428", "Maria", 5000);
        Cuenta cuenta2 = new Cuenta("000630", "Juan");

        System.out.println("\n>>> CUENTA 1: " + cuenta1);
        System.out.println("\n>>> CUENTA 2: " + cuenta2);

        System.out.print("");

        System.out.println("----------------------------------------------\n");

        System.out.print("> Ingrese el monto a Acreditar en la cuenta 1: ");
        int depositar = ingreso.nextInt();

        System.out.print("> Ingrese le monto a Debitar de la cuenta 2: ");
        int retirar = ingreso.nextInt();

        cuenta1.credito(depositar);
        cuenta2.debito(retirar);

        System.out.println("\nMonto de la CUENTA 1 despues de credito: " + cuenta1);
        System.out.println("Monto de la CUENTA 2 despues del debito: " + cuenta2);

        System.out.println("----------------------------------------------\n");
        /* SECCION DE PUEBA */
        System.out.print("\nIngrese el monto a transferir a la cuenta 2: ");
        int transferencia = ingreso.nextInt();

        cuenta1.tansferirA(cuenta2, transferencia);

        System.out.println("----------------------------------------------\n");
        
        System.out.println("\n==> Monto de la CUENTA 1 despues la transferencia realizada a la CUENTA 2: " + cuenta1);
        System.out.println("==> Monto de la CUENTA 2 despues de recibir la transferencia de la CUENTA 1: " + cuenta2 + "\n");
    }
}
