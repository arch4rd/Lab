package labirynt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mapa {
	static char[][] level() throws FileNotFoundException{
	  File file = new File("labirynt.txt");
	  Scanner in = new Scanner(file);
	  String zdanie;
	  char[][] tab = new char[12][5];
	  int j = 0;
	  String kropka = ".";
	  
	  do {
	  zdanie = in.nextLine();
	  for (int i = 0 ; i != 12; i++ ) {
		 tab [i][j] = zdanie.charAt(i) ;
		 tab[5][3] = kropka.charAt(0) ;
		}
	  j++; 
	  }
	  while (j != 5);
	  
	  
	  in.close();
	  return(tab);
	}
	  
	  
	  
	
	  
}
