package HomensMulheres;
import java.util.Scanner;

public class HomensMulheres {

	public static void main(String[] args) {
		int sexo, qtMulheres = 0, qtHomens = 0;
		double altura = 0, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homen): ");
			sexo = entrada.nextInt();
			System.out.print("Digite a altura: ");
			altura = entrada.nextDouble();
			
			if (sexo == 1) {
				qtMulheres++;
			} else if (sexo == 2) {
				qtHomens++;
				somaH = somaH + altura;
			} else {
				System.out.println("Opcao de sexo Invalido");
			}
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}
		}
		mediaHomens = somaH / qtHomens;
		
		System.out.println("A maior altura do grupo e de: " + altura + "m, e a menor e de: " + menor + " m");
		System.out.println("A media de altura dos Homens e: " + mediaHomens + " m");
		System.out.println("O numero de mulheres e: " + qtMulheres);
		
		entrada.close();
	}

}
