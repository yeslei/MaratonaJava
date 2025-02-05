package Secao4Aulas;

import java.util.Locale;

public class operacoesDeSaida{
    public static void main(String[] args) {

        // Operacoes de Saida
        System.out.println("Printa pulando a proxima linha");
        System.out.print("Apenas printa");
        double x = 3.12414;
        System.out.printf("%nFormata: %.2f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%nFormata: %.4f\n", x);

        // CONCATENACOES DE STRINGS
        System.out.println("Resultado " + x + " em metros");
        System.out.printf("Resultado %.2f em metros\n", x);

        String nome = "Maria";
        int idade = 31;
        double saldo = 4000.124;

        System.out.printf("%s tem %d anos e possui %.2f de saldo na conta", nome,idade, saldo);
    }
}
