import java.util.Scanner;

public class operacoesDeEntradaV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1,s2,s3;
        int x;
        // Ler ate apertar enter, sc.next() le apenas a primeira palavra
        x = sc.nextInt(); // quebras linhas ficam pendentes em qualquer tipo de next que nao seja o nextline, por isso precisamo s consumir essa quebra de linha
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}
