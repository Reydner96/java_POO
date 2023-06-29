import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        if (ano % 400 == 0) {
                System.out.println("O ano \"" + ano + "\" e um ano bissexto");
        } else if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    System.out.println("O ano \"" + ano + "\" e um ano bissexto");
            } else {
                System.out.println("O ano \"" + ano + "\" não e um ano bissexto");
            }
        } else {
            System.out.println("O ano \"" + ano + "\" não e um ano bissexto");
        }
    }
}

/*
    São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, ...
    São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, ...
    Não são bissextos todos os demais anos.

 */