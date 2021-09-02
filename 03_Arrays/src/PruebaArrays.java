public class PruebaArrays {
	public static void main(String[] args) {
		//El tama�o es fijo, y se inicializan a 0
		int[] arrayEnteros = new int[10];
		arrayEnteros[0] = 4;
		arrayEnteros[1] = 9;
		int tama�oArray = arrayEnteros.length;
		//el tama�o es con ell que se creo, no del numero de
		//elementos
		System.out.println("El tama�o del array es: " + tama�oArray);
		
		for(int i = 0;i<tama�oArray;i++){
			System.out.println("El valor en la posicion "
					+ i + " es " + arrayEnteros[i]);
		}
		
		for(int i : arrayEnteros){
			System.out.println("El valor es: " + i);
		}
		
		//Otra manera de crear arrays
		//se puede poner los [] despues del nombre
		int arrayEnterosDirectamente[] = {1,2,3};
		for(int i : arrayEnterosDirectamente){
			System.out.println("El valor es: " + i);
		}
		System.out.println("===========================");
		System.out.println(arrayEnterosDirectamente);
	}
}
