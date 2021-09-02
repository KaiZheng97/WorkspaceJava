![Javadoc](img/javadoc.png "Javadoc")
# Javadoc

Javadoc es una utilidad de Oracle para la generaci�n de documentaci�n de APIs en formato HTML a partir de c�digo fuente Java. Javadoc es el est�ndar de la industria para documentar clases de Java. La mayor�a de los IDEs los generan autom�ticamente.


## Objetivos

El objetivo de Javadoc es el de proporcionar informacion a otro desarrolladores de como tienen que utilizar nuestros clases y metodos. Esta documentacion no es para nosotros (que tambien) es principalmente para los programadores que usen nuestro codigo.

Es fundamental entender que con la documentaci�n queremos dar a conocer la funci�n que realizan nuestras clases y metodos sin necesidad de meternos en el codigo fuente de las clases para entender lo que hace.

No confundir Javadoc con los comentarios normales de java, que estos empiezan por /* y suelen ir dentro de los m�todos para explicar el c�digo. 

Es muy importante entender la diferencia entre los comentarios normales y Javadoc. El objetivo de los comentarios normales es explicar lineas de c�digo a programadores que se meten a ver el c�digo fuente, el objetivo de Javadoc es explicar a otros programadores como deben de usar las clases y los m�todos que hemos realizado, sin necesidad de ver el codigo fuente ni de entenderlo.

En el siguiente enlace podemos ver un ejemplo resultante de una documentacion hecha para la clase [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html). En esta documentaci�n, realizada con Javadoc por la gente de Oracle, podemos ver como se nos explica perfectamente toda la clase String y todos los m�todos que tiene. Este ser�a nuestro objetivo cuando realizamos Javadoc en nuestras clases.

A su vez, la documentaci�n esta muy ligada con las pruebas unitarias, hasta tal punto de que si la documentaci�n esta bien hecha, podemos hacer las pruebas unitarias sin necesidad de entender el c�digo.

Una buena practica ser�a documentar el c�digo antes de implementarlo.

## Creacion de Javadoc

El Javadoc se crea dentro de las clases de java y tendr� la siguiente forma:

	/** 
	* DOCUMENTACION
	*
	* ANOTACIONES 
	*/ 
    
	Notese que Javadoc empieza con "/**", es decir, una barra y dos asteriscos. El cierre de Javadoc es con "*/"

El Javadoc <b>DEBERA IR</b> al principio de cada clase, atributo, constructor o m�todo, dependiendo de qu� parte se quiera documentar.


## Anotaciones Javadoc

Para generar API con Javadoc podemos usar ciertas palabras reservadas precedidas por el car�cter "@" que son llamadas <b>anotaciones</b>. El objetivo de las anotaciones es la de enriquecer la documentaci�n y de organizarla de una manera estandar. Cada anotaci�n representa un valor diferente y tenemos distinto tipos.

Veamos las principales anotaciones que existen:

<table style="border: 1px solid">
 	<tr><th>ANOTACION</th><th style="text-align:left">DESCRIPCION</th></tr>
 	<tr><td style="font-weight:bold">@author</td><td>Nombre del desarrollador</td></tr>
	<tr><td style="font-weight:bold">@version</td><td>Versi�n del m�todo o clase</td></tr>
	<tr><td style="font-weight:bold">@param</td><td>Definici�n de un par�metro de un m�todo, es requerido para todos los par�metros del m�todo</td></tr>
	<tr><td style="font-weight:bold">@return</td><td>Informa de lo que devuelve el m�todo, no se puede usar en constructores o m�todos "void"</td></tr>
	<tr><td style="font-weight:bold">@throws</td><td>Excepci�n lanzada por el m�todo, primero la clase y luego la explicaci�n</td></tr>
	<tr><td style="font-weight:bold">@see</td><td>Asocia con un elemento externo como un m�todo, una clase o cualquier recurso en la red. Varias maneras de hacer referencia -> #m�todo(); clase#m�todo(); paquete.clase; paquete.clase#m�todo(). Tambien podemos usar la anotacion @link (ver m�s abajo)</td></tr>
	<tr><td style="font-weight:bold">@since</td><td>Usado principalmente en metodos. Nos dice desde que versi�n de la clase se encuentra el metodo en dicha clase</td></tr>
	<tr><td style="font-weight:bold">@link</td><td>Para crear un hipervinculo sobre un texto dentro del mismo programa. Si queremos usar hiperviculos externos podemos usar la etiqueta A de HTML.</td></tr>
	<tr><td style="font-weight:bold">@deprecated</td><td>Indica que el m�todo o clase es antigua y que no se recomienda su uso porque posiblemente desaparecer� en versiones posteriores</td></tr>
</table>

Estas anotaciones se escriben dentro del Javadoc, Ej:

    /**
    *
    * @author Steven Grant Rogers
    *
    */


## Enriquecer el Javadoc con HTML

Dento de un comentario de Javadoc, se pueden poner etiquetas HTML para enriquecer el formato. Javadoc acepta la mayor�a de ellas.

    /**
    * El objetivo de esta clase es proporcionar una <b>comunicaci�n con una impresora</b>
    *
    * @author Steven Grant Rogers
    *
    */

## Documentaci�n de una clase

El objetivo de documentar una clase es informar de la funcionalidad y la finalidad de dicha clase.

Son importantes anotaciones como <b>@author o @version</b>.

Primero habr�a que documentar la clase y luego poner las anotaciones que estimemos oportunas.

    /**
    * El objetivo de esta clase es proporcionar una <b>comunicaci�n con una impresora</b>
    *
    * Tendr� diferentes m�todos para realizar acciones con la impresora, tales como
    * <u>imprimir, scanear o fotocopiar</u>.
       
    * @author Steven Grant Rogers
    * @version 1.0
    *
    */
    public class GestionImpresora {
    
    
    }

Notese como la documentaci�n esta justo arriba de la clase que queremos documentar

## Documentaci�n de atributos

El objetivo de documentar atibutos es la de informar de lo que representa el atributo. Se puede a�adir posibles valores, unidades, etc.

Para cada uno de los atributos, primero habr�a que documentar el atributo y luego poner las anotaciones que estimemos oportunas.

## Documentaci�n de un m�todo

Documentar m�todos es de las partes m�s importantes de Javadoc, y el objetivo es el de explicar perfectamente lo que hace el m�todo, con todas sus casuisticas posibles o resultados.

Son muy importantes las anotaciones <b>@param</b> para cada uno de sus par�metros o <b>@return</b> para explicar los posibles valores que devuelve. Puede haber varios <b>@param</b> (uno para cada par�metro de entrada), pero como m�ximo habr� UN SOLO <b>@return</b> (y no lo habr� en caso de que el m�todo devuelva <b>void</b>).

Primero habr�a que documentar el metodo y luego poner las anotaciones que estimemos oportunas.

	 /**
	  * M�todo que establece el valor al atributo titulo. El titulo pasado por parametro no pude 
	  * ser nulo ni estar vacio. En caso de que sea nulo o vacio el m�todo arrojara una excepci�n.
	  *
	  * @param titulo El nuevo t�tulo que queremos establecer
	  * @throws IllegalArgumentException Si titulo es <b>null</b>, est� vac�o o contiene s�lo espacios.s	
	  */
	 public void setTitulo (String titulo) throws IllegalArgumentException
	 {
	   if (titulo == null || titulo.trim().equals(""))
	   {
	       throw new IllegalArgumentException("El t�tulo no puede ser nulo o vac�o");
	   }
	   else
	   {
	       this.titulo = titulo;
	   }
	 }

Notese que solo ponemos un <b<@param</b> porque solo hay un par�metro de entrada y no ponemos <b>@return</b> porque el metodo es void y no retorna nada. Tambi�n observamos como la documentaci�n esta justo encima del m�todo que queremos documentar.

<b>IMPORTANTE!</b> Los setter y los getter normalmente NO se comentan. Solo se comentan en caso de que hagan alguna funcionalidad diferente a lo que hace por defecto (asingar o devolver valores de atributos). Un ejemplo podr�a ser el metodo anterior <b>setTitulo</b>, normalmente no se documentar�a, pero en este caso SI que ser�a obligatorio hacerlo ya que hace una funcionalidad diferente al setTitulo por defecto que nos crearia un IDE como eclipse.

## Documentaci�n de constructores

Los constructores tambien se pueden documentar. Siguen las mismas reglas que los m�todos pero teniendo en cuenta que no se puede poner la anotaci�n <b>@return</b> ya que los constructores no devuelven nada. 

## Generar ficheros de documentaci�n de manera autom�tica (HTML)

Una vez aplicado el javadoc sobre el codigo, podemos generar documentos html de manera autom�tica con toda la informaci�n que hemos puesto sobre dicho codigo. La documentaci�n quedar� como la documentaci�n oficial de Oracle, [documentacion oficial String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html) 

Para hacerlo con eclipse debemos de realizar los siguientes casos.

1. Ir a la siguiente pesta�a de eclipse: Proyect -> Generate JavaDoc
	
2. Elegiremos el proyecto el cual queremos generar su documentaci�n. Nos dan muchas opciones de creaci�n de javadoc, normalmente con elegir las opciones por defecto son suficientes.

3. Si nos da un error de tipo "javadoc command does not exist" debemos de buscar en dicha pantalla la ruta del ejecutable para que nos genere la documentaci�n. El ejecutable que podemos escoger por defecto seria "javadoc.exe" que se encuentra donde tengamos instalado nuesta jdk de java. Un ejemplo de la ruta por defecto podr�a ser -> C:\Program Files\Java\jdk-11.0.11\bin

## Como ver los ejemplos

1. Ver la clase <b>basico/ClaseJavaDoc</b> para ejemplos teoricos de como hacer documentaci�n

2. En la clase <b>basico/MainJavaDoc</b> hay ejemplos de como usar la clase anterior y como podemos ver el javadoc hecho poniendo el cursor encima de la clase o los m�todos

3. En el paquete <b>entidad</b> hay ejemplos m�s practicos de como hacer documentaci�n

## Bibliograf�a

[https://es.wikipedia.org/wiki/Javadoc](https://es.wikipedia.org/wiki/Javadoc)

[https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)

[https://www.markdownguide.org/extended-syntax/#tables](https://www.markdownguide.org/extended-syntax/#tables)
