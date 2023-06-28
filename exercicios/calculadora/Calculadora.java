public class Calculadora {

	public static void main(String[] args) {
		// constante do Pi - 3.1415
		float pi = 3.14f;
		
		// raio - informado pelo professor
		float raio = 5.3f;
		
		// area eh igual ao raio ao quadrado multiplicado por Pi
		float area = raio * raio * pi;
		int areaSemCasasDecimais = (int) area;
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
	}

}