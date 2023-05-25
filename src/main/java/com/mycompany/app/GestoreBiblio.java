/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.Scanner;

public class GestoreBiblio
{
    Biblioteca bib;
    Anagrafica cli;
    public static void main(String[] args)
    {
        
        Menu menu_p = new Menu();
        menu_p.addVoce("Aggiungi libro a Biblioteca", 1);
        menu_p.addVoce("Aggiungi Film a Biblioteca", 2);
        menu_p.addVoce("", 3);
        menu_p.addVoce("",4);
        menu_p.addVoce("",5);
        menu_p.addVoce("",6);
        menu_p.addVoce("",7);
        menu_p.addVoce("",8);
        menu_p.addVoce("",9);
        menu_p.addVoce("",10);
        int scelta;
        do{
            scelta=menu_p.run();
            switch(scelta)
            {
                case 1:
                {
                    AggiungiLibro();
                }
                break;
                case 2:
                {
                    ;
                }
                break;
                case 3:
                {
                    ;
                }
                break;
                case 4:
                {
                    ;
                }
                break;
                case 5:
                {
                    ;
                }
                break;
                case 8:
                {
                    ;
                }
                break;
                case 9:
                {
                    ;
                }
                break;
                case 10:
                {
                    ;
                }      
                break;      
            }
        }while(scelta!=0);
        System.out.println("Programma terminato");
    }

    public static void AggiungiLibro()
    {
        Scanner inputs=new Scanner (System.in); //input per la stringa
        Scanner inputn=new Scanner (System.in); //input per i numeri
        int appo_cod;
        do
        {
            System.out.println("Inserimento dati nuovo libro");
            System.out.print("Inserisci il nuovo codice: ");
            appo_cod = inputn.nextInt();
            Libro lbr = new Libro(appo_cod);
            if(!bib.Contiene(lbr))
            {
                System.out.print("Inserisci il Titolo del libro: ");   
                lbr.setTitolo(inputs.nextLine().toUpperCase()); //converto tutto in maiuscolo
                System.out.print("Inserisci il costo giornaliero del libro: ");   
                lbr.setCostoGiornaliero(inputs.nextLine().toUpperCase());                
                System.out.print("Inserisci lo scrittore del libro: ");   
                lbr.setScrittore(inputs.nextLine().toUpperCase()); //converto tutto in maiuscolo                
                System.out.print("Inserisci l'Editore del libro: ");   
                lbr.setEditore(inputs.nextLine().toUpperCase()); //converto tutto in maiuscolo                
                bib.addArticolo(lbr); 
            }
            else
            {
                System.out.println("Si è verificato un errore! il codice è già presente");
            }
            System.out.println("Vuoi inserire un'altro libro [S/N]?");
            risp=inputs.nextLine().toUpperCase();
        }while(risp.charAt(0)=='S');
    }
}
