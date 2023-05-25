package com.mycompany.app;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Menu
{
    private Vector<VoceMenu> voci;

    public Menu()
    {
        this.voci = new Vector<VoceMenu>();
    }

    public void addVoce(String v, int pos)
    {
        if((v!=null) && (pos>0))
        {
            voci.add(new VoceMenu(v,pos));
            Collections.sort(voci);
        }
    }

    public int run ()
    {
        Scanner s=new Scanner (System.in);
        int sclt=0;
        
        for (VoceMenu v : voci)
        {
            System.out.println(v);
        }
        System.out.println("0) Uscita");
        System.out.print("Scelta:");
        try
        {
            sclt=s.nextInt();
            return sclt;
        }
        catch (Exception ex)
        {
            System.out.println("Si è verificato un errore. Inserimento errato");
            return 0;
        } 
    }
    
    public int get_val_opzione(int index)
    {
        return voci.get(index).getPos();
    }

    public String get_testo_opzione(int index)
    {
        return voci.get(index).getTesto();
    }
}
