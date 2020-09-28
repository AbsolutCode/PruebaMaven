package dad.maven.prueba;

public class Combinar {
	
	public static String combinar(Object [] array) {
		// TODO implementar este método
		String resultado = "";
		for (int i=0; i<array.length; i++) {
			resultado += array[i];
			if (i<array.length-1) {
				resultado += "";
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		Object [] array = {"hola", 3.1416, "adios", 15, true};
		String resultado = combinar(array); // "hola 3.1416 adios 15 true"
		System.out.println(resultado);
	}

}
