package com.viti.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button but0;
    private Button butC;
    private Button butDEL;
    private Button butDIV;
    private Button butMUL;
    private Button butMIN;
    private Button butPL;
    private Button butPR;
    private Button butSP;
    private Button butRS;

    public  static TextView Results;
    public static TextView Entering;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        but5=findViewById(R.id.but5);
        but6=findViewById(R.id.but6);
        but7=findViewById(R.id.but7);
        but8=findViewById(R.id.but8);
        but9=findViewById(R.id.but9);
        but0=findViewById(R.id.but0);

        butPL=findViewById(R.id.butPL);
        butMIN=findViewById(R.id.butMIN);
        butMUL=findViewById(R.id.butMUL);
        butDIV=findViewById(R.id.butDIV);

        butDEL=findViewById(R.id.butDEL);
        butPR=findViewById(R.id.butPR);
        butRS=findViewById(R.id.butRS);
        butSP=findViewById(R.id.butSP);
        butC=findViewById(R.id.butC);

        Results=findViewById(R.id.textView2);
        Entering=findViewById(R.id.textView);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.but1:
                Calculator.AddFig("1");
                break;
            case R.id.but2:
                Calculator.AddFig("2");
                break;
            case R.id.but3:
                Calculator.AddFig("3");
                break;
            case R.id.but4:
                Calculator.AddFig("4");
                break;
            case R.id.but5:
                Calculator.AddFig("5");
                break;
            case R.id.but6:
                Calculator.AddFig("6");
                break;
            case R.id.but7:
                Calculator.AddFig("7");
                break;
            case R.id.but8:
                Calculator.AddFig("8");
                break;
            case R.id.but9:
                Calculator.AddFig("9");
                break;
            case R.id.but0:
                Calculator.AddFig("0");
                break;
            case R.id.butSP:
                Calculator.AddFig(".");
                break;

            case R.id.butPL:
                Calculator.Move("+");
                break;
            case R.id.butMIN:
                Calculator.Move("-");
                break;
            case R.id.butMUL:
                Calculator.Move("*");
                break;
            case R.id.butDIV:
                Calculator.Move("/");
                break;
            case R.id.butPR:
                Calculator.Move("%");
                break;
            case R.id.butRS:
                Calculator.Dia();
                break;
            case R.id.butC:
                Calculator.Reset();
                break;
            case R.id.butDEL:
                Calculator.Delete();
                break;
        }

    }

    public static void SetRes()
    {
        String a=Calculator.Res();
      Results.setText(a);
    }
    public static void SetPre()
    {
      Entering.setText(Calculator.Ent());
    }

}
