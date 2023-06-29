public class opComparacao {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int c = 2;

        boolean maior = b > a + c;
        boolean maiorOuIgual = b >= a - c;
        boolean menor = b < a;
        boolean menorOuIgual = b < a;
        boolean igual = a == b - c;
        boolean diferente = a != c;

        System.out.println(maior);
        System.out.println(maiorOuIgual);
        System.out.println(menor);
        System.out.println(menorOuIgual);
        System.out.println(igual);
        System.out.println(diferente);
    }
}