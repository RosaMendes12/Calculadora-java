import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equals("s") || opc.equals("S")) {
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scanner.nextInt());

            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scanner.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%nA soma de %d com %d é igual a %d",
                    n1.getValor(), n2.getValor(), res.getValor());

            System.out.printf("%nSe deseja somar outro valor, digite: s , ou , digite qualquer outra letra para encerrar  ");
            opc = scanner.next();
            System.out.printf("%n%n%n");
        }

        if (!opc.equals("s") && !opc.equals("S")) {
            System.out.println("Encerrando o programa");
        }

        scanner.close();
    }
}
