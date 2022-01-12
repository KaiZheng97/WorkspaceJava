# Depuraci�n

La depuracion es una herramienta que nos ayuda a los programadores a detectar errores y a  ejecutar un programa linea por linea para poder ver los resultados parciales que se van ejecutando en los programas.

Es una herramienta importantisima a la hora de desarrollar software y es usada por los programadores en la mayor parte de la creaci�n de los programas.

## Errores de programaci�n

Las tareas de depuraci�n que implementan los IDE sirven para poder revisar y corregir los fallos l�gicos y de otro tipo que tiene el c�digo generado en el desarrollo de software.

Los errores que se producen en el desarrollo de software suelen estar asociados al c�digo fuente y su realizaci�n. Existen diferentes categor�as para clasificar los errores a la hora de desarrollar software, las m�s importantes:

1. <b>Momento</b>: Estos errores se clasifican dependiendo del momento en el que se producen. Podemos encontrar dos tipos:

    - <b>Errores en tiempo de compilaci�n</b> Suelen ser errores principalmente de sintaxis, como puede ser no seguir las reglas de Java, y provocan la no compilaci�n del c�digo. Estos errores son faciles de detectar ya que nos avisa el IDE en cuesti�n y los podemos solucionar de una manera sencilla. Se llaman en tiempo de compilaci�n porque hacen que el programa no compile (no gener� adecuadamente los ficheros con extensi�n .class)
    - <b>Errores en tiempo de ejecuci�n</b> Suelen ser errores de procesos no validos o l�gicos. Estos errores no suelen ser detectados por el IDE, por lo que muchas veces la depuraci�n del c�digo nos van a ayudar a detectarlos. En este caso, el c�digo compila, pero cuando se ejecuta, el comportamiento no es el esperado en algunos o en todos los casos. Un ejemplo podr�a ser un error de cuando intentamos dividir un n�mero por cero, en tiempo de compilaci�n no habr�a problema, pero cuando ejecutamos el c�digo dar�a una excepci�n. 

2. <b>Consecuencia</b>: Estos errores se clasifican dependiendo si la ejecuci�n del programa es suspendida o no. Este tipo de errores no suelen ser detectados por el IDE.

    - <b>Errores que provocan la parada del programa</b>. Este tipo de errores suelen ser debidos a una mala l�gica del c�digo, como puede ser mal uso de operadores o bucles infinitos.
    - <b>Errores que NO provocan la parada del programa</b>. Este tipo de errores son m�s cr�ticos que los anteriores ya que directamente rompen la ejecuci�n del programa. Estos errores lanzan excepciones por lo que podremos capturarlas para evitar la parada del programa en caso de necesidad.

## Funciones de un depurador

Un depurador es el m�dulo que nos va a permitir trabajar con el c�digo para examinarlo en tiempo de ejecuci�n.

Las funciones generales que esta aplicaci�n debe soportar ser�an las siguientes:

1. Parar la ejecuci�n del programa en un momento deseado.

2. Ejecutar el c�digo sentencia a sentencia o paso a paso, como es normalmente llamado.

3. Poder examinar el estado de los hilos de ejecuci�n, de las variables y del estado de los objetos.

4. Cambiar los valores de las variables o del estado de los objetos.

5. Saltarse un trozo de c�digo sin tener que revisarlo o continuar la ejecuci�n en una posici�n diferente de la actual.

## Puntos de ruptura o "breakpoints"

La ejecuci�n del programa principal del proyecto se ejecuta normalmente hasta que el depurador detiene su ejecuci�n, permitiendo al usuario examinar la situaci�n. El depurador se parar� en donde el programador haya indicado un punto de parada o ruptura llamado �breakpoint�.

Para poner un "breakpoint" debemos de hacer doble click sobre el lateral de la linea donde queremos que se para nuestro programa, donde viene el n�mero de linea. La funci�n del punto de ruptura es que cuando la maquina virtual de Java llegue a dicho punto, detenga la ejecuci�n del programa justo en esa linea, para que el programador pueda ver el estado del programa en esa linea.

## Uso del depurador con Eclipse

Para que el programa se detenga en los puntos de ruptura, debemos arrancar el programa en modo depuraci�n, para ello pulsaremos el fichero que tenga el m�todo <b>main</b> con boton derecho -> debug as -> Java Application. Una vez hecho, nos aparecer� una pop-up donde se nos preguntar� si queremos cambiar la perspectiva de eclipse a modo depuraci�n. Esta perspectiva nos ayudar� para ver ciertos valores que no podemos ver en una perspectiva normal de "java", tales como los hilos de ejecuci�n (a la derecha) o el valor de las variables (a la izquierda).

Una vez que hayamos ejecutado el programa en modo depuraci�n, el programa deber� pararse en un punto de ruptura cuando llegue a el. A partir de ah� podemos tomar una ser�e de opciones para continuar con la ejecuci�n de nuestro programa, todas esas opciones las podemos ver en la pesta�a <b>run</b>, las m�s importantes:

1. <b>F8 - Resume</b>: Continua con la ejecuci�n del programa. Se parar� en el siguiente punto de interrupci�n si hubiera.
2. <b>F6 - Step Over</b>: Pasa a la siguiente linea de ejecuci�n del programa y se detiene en dicha linea. Podremos pulsar repetidamente F6 para ir ejecutando el programa linea a linea.
3. <b>F5 - Step Into</b>: Si la linea en la que estamos es un m�todo, entonces nos meteremos dentro de dicho m�todo. Es muy util cuando queremos ver como actua el metodo en cuesti�n.

## Bibliograf�a

- [http://www.edu4java.com/es/java/depurar-debug-programa-java-eclipse.html](http://www.edu4java.com/es/java/depurar-debug-programa-java-eclipse.html)
- [https://www.youtube.com/watch?v=ymV7lUUHkUU](https://www.youtube.com/watch?v=ymV7lUUHkUU)