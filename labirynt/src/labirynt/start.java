package labirynt;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.Console;

public class start{

public static void main (String[] args) throws FileNotFoundException, java.io.IOException {

	
	int znak;
	Scanner liczba = new Scanner(System.in);
	Console console = System.console(); 
	
	Wypisz.dane(mapa.level());
	Plik.zapis(mapa.level());
	
	
	

	System.out.println("1. Góra");
	System.out.println("2. Dó³");
	System.out.println("3. Lewo");
	System.out.println("4. Prawo");
	System.out.println("Wybierz w która strone chcesz iœæ:");
	
	for (int i = 0 ; i < 10 ; i++) {
	znak = liczba.nextInt();
	
	switch(znak){
		case 1:
			Click.gora(Plik.wypiszp());
			Wypisz.dane(Plik.wypiszp());
			break;
		case 2:
			Click.dol(Plik.wypiszp());
			Wypisz.dane(Plik.wypiszp());
			break;
		case 3:
			Click.lewo(Plik.wypiszp());
			Wypisz.dane(Plik.wypiszp());
			break;
		case 4:
			Click.prawo(Plik.wypiszp());
			Wypisz.dane(Plik.wypiszp());
			break;
			
	}
	}
	

	
}
}
