package com.mycompany.app;

public class VoceMenu implements Comparable
{
    private String testo;
    private int pos;
    
    public VoceMenu(String testo, int pos)
    {
        if(pos>0)
        {
            this.testo = testo;
            this.pos = pos;
        }
        else
        {
            this.testo = "Exit";
            this.pos = 0;            
        }
    }

    public int compareTo(Object v)
    {
        return pos-((VoceMenu)v).pos;
    }

    @Override
    public String toString()
    {
        return pos+") "+testo;
    }
    
    public int getPos()
    {
        return pos;
    }

    public String getTesto()
    {
        return testo;
    }
}