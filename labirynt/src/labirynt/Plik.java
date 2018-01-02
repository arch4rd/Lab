package labirynt;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Plik {

	
	static void zapis (char[][] tablica) throws FileNotFoundException{
		PrintWriter zap = new PrintWriter("labpo.txt");
		int j = 0;
		
		do {
			  for (int i = 0 ; i != 12; i++ ) {
				 zap.print(tablica [i][j]);
				}
			  j++; 
			  zap.println("");
			  }
			  while (j != 5);
			  
			  
		zap.close();
	}
	
	
	static char[][] wypiszp () throws FileNotFoundException{
		File file = new File("labpo.txt");
		  Scanner in = new Scanner(file);
		  String zdanie;
		  char [][] tab = new char[12][5];
		  int j = 0;
		 
		  
		  do {
		  zdanie = in.nextLine();
		  for (int i = 0 ; i != 12; i++ ) {
			 tab [i][j] = zdanie.charAt(i) ;	
			}
		  j++; 
		  }
		  while (j != 5);
		  
		in.close();
		return (tab);
	}
}
