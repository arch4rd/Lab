package labirynt;

import java.io.FileNotFoundException;

public class Wypisz {

	static char[][] dane(char[][] tablica) throws FileNotFoundException{
		int j = 0;
		char[][] zrobto = tablica;
		
		do {
		for(int i = 0; i != 12; i++) {
			System.out.print(zrobto[i][j]);
		}
		
		j++;
		System.out.println();
		}
		while (j != 5);
	return(tablica);
}
	
}
