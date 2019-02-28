package cenfotec.Exam1;

public class Analytics {

	// Punto A palabra larga
	public Object ValoresPalabraLarga(String Vpalabra) {
		if (Vpalabra.isEmpty()) {
			return 0;
		}

		String[] palabra = SeparadorPalabras(Vpalabra);

		return masLarga(palabra);
	}
	
	//Punto B palabra corta
	public Object ValoresPalabraCorta(String palabraCorta) {
		if (palabraCorta.isEmpty()) {
			return 0;
		}

		String[] palabra = SeparadorPalabras(palabraCorta);

		return masLarga(palabra);
	}
	
	/*
	//Punto C Palabras largas ordenadas alfabeticamente
	
	private String PalabrasLargasAlfabetics(String[] Palabras) {
		String palabraLarga = "";

		for(String valorPalabra:Palabras) {
			
			
			
		}
		
		return palabraLarga;
	}
	
	
	
	//Punto D Palabras cortas ordenadas alfabeticamente
	
	
	private String PalabrasCortasAlfabetics(String[] Palabras) {
		String palabraCorta = "";

	for(String valorPalabra:Palabras) {
			
			
			
		}
		
		
		
		
		
		return palabraCorta;
	}
	
	*/

	// Separador de palabras
	private String[] SeparadorPalabras(String string) {
		String separador[] = null;

		if (string.contains(",")) {

			separador = string.split(",");

		} else if (string.contains(" ")) {
			separador = string.split(" ");

		}

		return separador;
	}

	
	// Generador palabras
	private String masLarga(String[] Palabras) {
		String palabraLarga = "";

		for (String valorPalabra : Palabras) {

			// Validacion de palabras(Si es mas larga que la otra)
			// ...	
			
		
			

			palabraLarga = valorPalabra;

		}

		return palabraLarga;
	}

	
	
	
	private String masCorta(String[] Palabras) {

		String palabraCorta = "";

		for (String valorPalabra : Palabras) {

			// Validacion de palabras(Si es mas corta que la otra)
			// ...

			palabraCorta = valorPalabra;

		}

		return palabraCorta;
	}

}
