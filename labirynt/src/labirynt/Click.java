package labirynt;

import java.io.FileNotFoundException;

public class Click {

	
	public static void gora (char[][] tab) throws FileNotFoundException {
		int j = 0;
		char [][] tabela = new char[12][5];
		String kropka = ".";
		String spacja = " ";
		tabela = tab;
		
		 do {
			  for (int i = 0 ; i != 12; i++ ) {
				 if (tabela [i][j] == kropka.charAt(0)) {
					 if (tabela[i][j-1] == spacja.charAt(0)) {
						 tabela [i][j-1] = kropka.charAt(0);
					 	 tabela [i][j] = spacja.charAt(0);
				 }	
				 else {
					System.out.println("Trafi³eœ w œciane");
				}
			  }
				 
				}
			  j++; 
			  }
			  while (j != 5);
			
		Plik.zapis(tabela);

	
	}
	
	
	public static void dol (char[][] tab) throws FileNotFoundException {
		int j = 0;
		char [][] tabela = new char[12][5];
		String kropka = ".";
		String spacja = " ";
		tabela = tab;
		
		 do {
			  for (int i = 0 ; i != 12; i++ ) {
				 if (tabela [i][j] == kropka.charAt(0)) {
					 if (tabela[i][j+1] == spacja.charAt(0)) {
						 tabela [i][j+1] = kropka.charAt(0);
					 	 tabela [i][j] = spacja.charAt(0);
				 }	
				 else {
					System.out.println("Trafi³eœ w œciane");
				}
			    }
				 
				}
			  j++; 
			  }
			  while (j != 5);
			
		Plik.zapis(tabela);

	
	}
	
	public static void lewo (char[][] tab) throws FileNotFoundException {
		int j = 0;
		char [][] tabela = new char[12][5];
		String kropka = ".";
		String spacja = " ";
		tabela = tab;
		
		 do {
			  for (int i = 0 ; i != 12; i++ ) {
				 if (tabela [i][j] == kropka.charAt(0)) {
					 if (tabela[i-1][j] == spacja.charAt(0)) {
						 tabela [i-1][j] = kropka.charAt(0);
					 	 tabela [i][j] = spacja.charAt(0);
				 }	
				 else {
					System.out.println("Trafi³eœ w œciane");
				}
			   }
				 
				}
			  j++; 
			  }
			  while (j != 5);
			
		Plik.zapis(tabela);

	
	}
	
	public static void prawo (char[][] tab) throws FileNotFoundException {
		int j = 0;
		char [][] tabela = new char[12][5];
		String kropka = ".";
		String spacja = " ";
		tabela = tab;
		
		 do {
			  for (int i = 0 ; i != 12; i++ ) {
				 if (tabela [i][j] == kropka.charAt(0) & i < 11) {
					 if (tabela[i+1][j] == spacja.charAt(0)) {
						 tabela [i+1][j] = kropka.charAt(0);
					 	 tabela [i][j] = spacja.charAt(0);
				 }	
				 else {
					System.out.println("Trafi³eœ w œciane");
				}
				}
				 
				}
			  j++; 
			  }
			  while (j != 5);
			
		Plik.zapis(tabela);

	
	}
	
}
		


	
	
	
	
