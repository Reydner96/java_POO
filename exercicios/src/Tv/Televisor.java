package Tv;

public class Televisor {

	Integer canal = 130;
	Integer volume = 20;
	
	void mudarCanal(Integer novoCanal) {
		if (canal == novoCanal) {
			System.err.println("Novo canal e tambem canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		} 
	}
	
	void mudarVolume(Integer novoVolume) {
		if (novoVolume == volume) {
			System.out.println("Novo volume e tambem o volume atual.");
		} else {
			volume = new Integer(novoVolume.byteValue());
			System.out.println("Volume alterado para " + volume);
		}
	}
	
	// Estamos aproveitando a classe Televisor para fazer nossos testes
	
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}

}
