package actividad5;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Actividad5 {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");
		Double num;
		double numAleatorios;

		try {

			FileWriter fw = new FileWriter("C:\\Users\\pipe4\\Desktop\\Date.dat");
			PrintWriter pw = new PrintWriter(fw); 
			for (int i = 0; i < 10; i++)
				pw.println(formato.format(numAleatorios = Math.random() * 100)); 
			

			System.out.println("Introduzca un numero para introducir en fichero");
			num = kb.nextDouble(); 
			pw.println(num); 
			pw.flush();
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
