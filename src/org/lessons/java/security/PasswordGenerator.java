package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome:");
		
        String strName = in.nextLine();
        
        System.out.print("Inserisci il tuo cognome:");
        String strSurname = in.nextLine();
        
        System.out.print("Inserisci il tuo colore preferito:");
        String strColor = in.nextLine();
        
        System.out.print("Inserisci il tuo giorno di nascita:");
        String strDay =in.nextLine();
        int  intDay = Integer.valueOf(strDay);
        
        System.out.print("Inserisci il tuo mese di nascita:");
        String strMonth =in.nextLine();
        int  intMonth = Integer.valueOf(strMonth);
        
        System.out.print("Inserisci il tuo anno di nascita:");
        String strYear =in.nextLine();
        int  intYear = Integer.valueOf(strYear);
        
//        sommo la data di nascita
        
        int sumBirth = intDay + intMonth + intYear;
        
        
        
        in.close();
        
        String password = strName + "-" + strSurname + "-" + strColor + "-" + sumBirth ;
        System.out.println("La tua password è " + password);
       
	}

}
