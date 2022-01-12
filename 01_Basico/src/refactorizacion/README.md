# Refactorizaci�n

El concepto de refactorizaci�n (refactoring) de c�digo se asocia al proceso de alteraci�n de ciertos aspectos del c�digo, de forma que se reestructura y cambia sin alterar su funcionalidad.

Muchos entornos de desarrollo IDE proporcionan soporte automatizado para la refactorizaci�n. Si logramos hacer bien la refactorizaci�n del c�digo tambi�n se pueden resolver errores ocultos y vulnerabilidades en el sistema mediante la simplificaci�n de la l�gica y la eliminaci�n de niveles innecesarios de complejidad.

Si se hace mal, puede fallar el requisito de que la funcionalidad externa no se puede cambiar, y/o introducir nuevos errores.

Algunas de las t�cnicas m�s comunes desarrolladas en los IDE ser�an:

1. <b>Mejora de nombres y ubicaci�n de c�digo</b>, como pueden ser:
    - Mover un campo o un m�todo
    - Cambiar el nombre de m�todo o cambiar el nombre de campo
2. <b>Bloques de c�digo m�s l�gicos</b>
    - Extraer de una clase parte del c�digo en otra una clase.
    - Extraer un m�todo. Partir en varios m�todos uno que sea muy largo. Al trocear el c�digo en trozos m�s peque�os es m�s f�cil de comprender.

## Opciones de refactorizaci�n

Los IDE como Eclipse tienen implantadas las opciones de refactorizaci�n m�s utilizadas. A continuaci�n describimos algunas de ellas. 

1. <b>Move</b>, Esta opci�n permite mover el objeto hacia otros �mbitos dentro del mismo. Si seleccionamos una clase nos ofrecer� cambiar de paquete y cambiar� las referencias a esa clase desde las otras.
2. <b>Copy</b>, Esta opci�n permite copiar la clase a otro paquete del proyecto.
3. <b>Rename</b>, Esta opci�n permite cambiar el nombre a cualquier elemento de nuestro c�digo, tanto campos, variables, m�todos, clases, paquetes, ficheros, etc.
4. <b>Extract local variable</b>, cuando queremos extraer valores a variables locales.
5. <b>Change Method Signature</b>, Esta opci�n permite cambiar toda la firma de un m�todo, como el nombre, los parametros de entrada y salida, etc.
6. <b>Extract method</b>, podemos hacer que un determinado c�digo lo extraigamos a un m�todo a parte para facilitar su legibilidad.
7. <b>Extract interface</b>, La refactorizaci�n extract interface permite seleccionar m�todos p�blicos no est�ticos y moverlos a una interfaz independiente. Esto puede hacer que el c�digo sea m�s legible y f�cil de mantener.
8. <b>Extract superclass</b>, Esta refactorizaci�n funciona exactamente de la misma manera que la refactorizaci�n extract interface. Sin embargo, esta opci�n mueve los m�todos a una nueva superclase y extiende la clase refactorizada (aquella de la que se retiraron los m�todos).

En eclipse todas las opciones de refactorizaci�n est�n en <b>refactor</b>, que se puede acceder pulsando bot�n derecho del rat�n sobre lo que queramos refactorizar.

## Bibliograf�a

- [https://www.baeldung.com/eclipse-refactoring](https://www.baeldung.com/eclipse-refactoring)
- [https://dzone.com/articles/java-eclipse-code-refactoring-shortcuts-and-tips](https://dzone.com/articles/java-eclipse-code-refactoring-shortcuts-and-tips)