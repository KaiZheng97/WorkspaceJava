package _04_hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class _01_GenerarResumenHash {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		//Creamos el mensaje del cual queremos crear su resumen.
		//En este caso quiero "hashear" una serie de canciones.
		//Notese que lo pasamos a bytes ya que se necesita que la 
		//informaci�n este as� para poder crear su resumen hash.
		byte[] cancion1 = "Bohemian Rhapsody".getBytes();
		byte[] cancion2 = "Imagine".getBytes();
		byte[] cancion3 = "We Are the Champions".getBytes();
		byte[] cancion4 = "Hotel California".getBytes();
		byte[] cancion5 = "".getBytes();
		
		
		//Creamos un objeto MessageDigest a trav�s del m�todo est�tico 
		//getInstance() al que se le pasa el tipo de algoritmo que vamos a 
		//utilizar. 
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(cancion1);
		md.update(cancion2);
		md.update(cancion3);
		md.update(cancion4);
		md.update(cancion5);
		
		//El �ltimo paso ser� ejecutar el m�todo "digest()" de nuestro 
		//objeto MessageDigest para obtener el resumen, que tambi�n 
		//ser� una cadena de bytes.
		
		byte[] resumen = md.digest();
		String mensaje = new String(resumen);
		System.out.println("Resumen hash: " + mensaje);
		
		//Mejor pasarlo a Base64, que es una codificaci�n que nos puede dar
		//menos problemas para trabajar con el
		String mensajeHashBase64 = Base64.getEncoder().encodeToString(resumen);
		System.out.println(mensajeHashBase64);
	}
}