import java.util.Locale;
import java.util.Scanner;

public class operacoesDeEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de Strings
//        String x = sc.next();
//        System.out.println("Voce digitou: " + x);
//
        //    Entrada de Inteiros
//        int number = sc.nextInt();
//        System.out.println(number);

        // Entrada de Flutuantes
        double numberPointFlutuante = sc.nextDouble();
        System.out.printf("%.2f%n",numberPointFlutuante);

        char caractere = sc.next().charAt(0);
        System.out.println(caractere);

        sc.close();


    }
}
