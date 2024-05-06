//import java.util.Scanner;
import java.io.BufferedReader;
// import java Arrays;;;;

import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;

// using Streamsss----¿¿¿
// stream  aplication formule convert to Arrays List

import java.util.stream.IntStream;


/*
Se quiere realizar un programa que lea por teclado las 5 notas
obtenidas por un alumno (comprendidas entre 0 y 10). A continuación, 
debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor. 
crea un script en java de lo menos comun posible haslo raro
*/



public class fc_jav003 { public static void main(String[] args) {


		// make vector init in 5 range ;: ::
		int[] notes = new int[5];
		//Scanner reg = new Scanner(System.in);

		// call BufferedReader
		BufferedReader reg = new BufferedReader(new InputStreamReader(System.in));

		int scc = 0 ;

		System.out.printf("=====================================\n");
		System.out.printf("=====   CONTROL DE NOTAS GET    =====\n");
		System.out.printf("=====================================\n");
		for (int q = 0 ; q < 5 ; q = q + 1 ) {

			try {
				System.out.printf("Ingresa la nota de entrada [%d] ?=> :",q+1);
				int trnote = Integer.parseInt(reg.readLine().trim());

				//switch ( trnote ) {
				// max in min in range 10 
				if ( trnote >= 0 && trnote <= 10 ) {
					//case 0,1,2,3,4,5,6,7,8,9,10:
					notes[q] = trnote;
					scc = scc + trnote;
				}else{
					System.out.printf("Error nota no valida ;... retrocediendo...\n");
					q--;	
				}

			} catch(Exception e) {
				System.out.printf("Error de valores recibidos no validos saliendo :::\n");
				q = q - 1 ;

			}
			
		}
		System.out.printf("Imprimiendo Resultados : => notas\n");
		//convert to String:::
		System.out.println("Notas ingresadas: " + Arrays.toString(notes));
		//div in 5 values  in double...
        System.out.printf("Nota media: %.2f\n", scc/5.0);

        // Obtener el máximo y mínimo con IntStream
        int max = Arrays.stream(notes).max().getAsInt();
        int min = Arrays.stream(notes).min().getAsInt();
        // fin___
        System.out.printf("Nota más alta: => [%d] \n",max);

        System.out.printf("Nota más baja: => [%d] \n",min);
		
	}
}

