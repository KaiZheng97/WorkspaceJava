package _01_basico;

public class _00_IntroduccionHilos {
	public static void main(String[] args) {
		// Aqui nacera el hilo principal, en este caso solamente habr� un hilo

		// Podemos obtener el nombre del hilo		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());for (int i = 0; i < 20; i++) {
			try {
				//Este metodo sirve para parar X milisegundos el hilo por el que pasamos
				//4000 milisegundos en este caso
				Thread.sleep(4000);//
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado");
		// aqui morira el hilo principal
	}
}
