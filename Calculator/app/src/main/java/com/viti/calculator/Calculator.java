package com.viti.calculator;

import android.view.View;

public  class Calculator
{
    private static int figure=0;
    private static  int preview=0;
    private static String fre ="0";
    private static String mov = "";

    public static void AddFig(String a)
    {
        if(a=="." && fre=="0")
        {
            fre="0.";
        }

        if (fre=="0")
        {
            fre=a;
        }
        else
        {
            fre+=a;
        }
        MainActivity.SetPre();
    }

    private static void Change()
    {
        figure= Integer.parseInt(fre);
        fre="0";
        MainActivity.SetPre();
    }

    public static void Move(String dia)
    {
        Change();
        if(mov=="")
        {
            mov=dia;
            preview=figure;
        }
        else
        {
            Dia();
            mov=dia;
        }

    }

    public static void Dia() {
        switch (mov) {
            case "+":
                preview += figure;
                break;
            case "-":
                preview -= figure;
                break;
            case "/":
                preview /= figure;
                break;
            case "*":
                preview *= figure;
                break;
            case "%":preview/=figure;
                        preview*=100;
                break;
        }
        MainActivity.SetRes();
    }

    public static void Reset()
    {
        fre="0";
        preview=0;
        figure=0;
        mov="";
        MainActivity.SetPre();
        MainActivity.SetRes();
    }


    public static void Delete()
    {
        if (fre!="0")
        {
            fre = fre.substring(0,fre.length()-1);
            MainActivity.SetPre();
        }
    }

    public static String Res()
    {
        return Integer.toString(preview);
    }
    public static String Ent()
    {
        return fre;
    }

}
