package basico;
import java.util.Date;

/**
 * Ejemplo de creaci�n de documentaci�n para Javadoc.
 * <br>
 * Aqui deberia ir una descripci�n de lo que hace la clase y sus objetivos.
 * <br>
 * Podemos usar HTML para mejorar la calidad de la documentacion
 * <br>
 * <b>Atributos de la clase</b>
 * <ul>
 * <li>texto</li>
 * <li>numero</li>
 * </ul>
 * 
 * Luego irian las anotaciones que estimemos necesarias:
 * 
 * @author Nombre del autor.
 * @version 2.0
 *
 */
public class ClaseJavaDoc {
	// ATRIBUTOS DE CLASE
	/**
	 * Aqui iria una descripci�n de lo que representa esta propiedad
	 */
	private String texto;
	/**
	 * Valor numerico entero.
	 */
	private Integer numero;

	// CONSTRUCTORES
	/**
	 * Comentario de metodo simple. Podriamos add informaci�n sobre este constructor
	 */
	public ClaseJavaDoc() {

	}

	// SETTER Y GETTER. 
	// Normalmente no se documentan
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	// METODOS
	
	/**
	 * Otro comentario de metodo simple. Al no tener parametros de entrada ni de 
	 * salida, simplemente deberiamos aportar una descripci�n de lo que hace 
	 * este m�todo
	 */
	public void metodoUno() {
		// AQUI IRIA EL CODIGO DEL METODO
		// ESTOS COMENTARIOS NO SON JAVADOC, SON COMENTARIOS NORMALES
	}

	/**
	 * Aqu� ir�a una descripci�n del metodo, pero como adem�s tenemos parametros
	 * de entrada y de salida, deberiamos crear anotaciones que representen y
	 * expliquen los parametros de entrada y el parametro de salida
	 * 
	 * @param numero aqu� deberiamos explicar lo que representa este parametro
	 * @param fecha idem anterior
	 * @return explicar lo que devolvemos o los posibles valores de retorno
	 */
	public String metodoDos(Integer numero, Date fecha) {
		//AQUI IRIA EL CODIGO DEL METODO
		return null;
	}

	/**
	 * Aqui ir�a una descripci�n del metodo y sus parametros de entrada y de salida
	 * pero como adem�s tenemos una excepci�n tambien podemos anotarla para explicar
	 * cuando se arroja dicha excepcion
	 * 
	 * @param texto en String.<a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html">Ver la clase</a>

	 * @return Valor numerico.
	 * 
	 * @throws RuntimeException Cuando el texto es null (por ejemplo...) 
	 * @since 1.2 (en este caso, este m�todo esta desde la versi�n 1.2 de la 
	 * clase. Actualmente la clase esta en la versi�n 2.0)
	 */
	public Integer metodoTres(String texto) throws RuntimeException {
		//AQUI IRIA EL CODIGO DEL METODO
		return null;
	}
	
	/**
	 * Aqui ir�a una descripci�n del metodo y sus parametros de entrada y de salida
	 * 
	 * @param texto
	 *            Valor texto.
	 * @return Valor numerico.
	 * @since 1.0
	 * @deprecated Establecemos como obsoleto el m�todo, lo cual aparecera tachado.
	 * Hay veces que se suelen mantener por retrocompatibilidad, pero siempre que 
	 * veamos un m�todo obsoleto, quiere decir que seguramente haya otro m�todo
	 * mejor para usar y hacer la funcionalidad. Metodo reemplazado por
*              {@link #metodoCinco(String)}
	 */
	public Integer metodoCuatro(String texto){
		//AQUI IRIA EL CODIGO DEL METODO
		return null;
	}
	
	/**
	 * Aqui ir�a una descripci�n del metodo y sus parametros de entrada y de salida
	 * 
	 * @since 2.0
	 * @param texto el valor en String
	 * @return valor numerico
	 */
	public Integer metodoCinco(String texto){
		//AQUI IRIA EL CODIGO DEL METODO
		return null;
	}
}