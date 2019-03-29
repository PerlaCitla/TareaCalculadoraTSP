package com.example.calculadoraact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvDispResultado;
    TextView txtvDispOpera;
    Button btnC;
    int n;
    String texto_opera;
    String resultadoFinal;
    boolean banderaSum=false;
    boolean banderaRes=false;
    boolean banderaDiv=false;
    boolean banderaMult=false;
    boolean banderaCos=false;
    boolean banderaSin=false;
    boolean banderaTan=false;
    boolean banderaCos1=false;
    boolean banderaSin1=false;
    boolean banderaTan1=false;
    boolean banderaPi;

    float valor1;
    float valor2;
    float res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvDispOpera=findViewById(R.id.txtvDispOpera);
        txtvDispResultado=findViewById(R.id.txtvResultado);
        btnC=findViewById(R.id.btnC);
        txtvDispResultado.setText("");
        txtvDispOpera.setText("");



        btnC.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                try
                {
                    texto_opera="";
                    txtvDispOpera.setText(texto_opera);
                }catch ( IndexOutOfBoundsException error) {
                    Log.d("Clear", "No se puede eliminar más ");
                }

                return false;
            }
        });
    }

    public void onClick (View v)
    {
        int selecciona=v.getId();
        texto_opera=txtvDispOpera.getText().toString();
        n=texto_opera.length();
        switch (selecciona)
        {
            case R.id.btnUno:
                texto_opera+="1";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnDos:
                texto_opera+="2";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnTres:
                texto_opera+="3";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnCuatro:
                texto_opera+="4";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnCinco:
                texto_opera+="5";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnSeis:
                texto_opera+="6";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnSiete:
                texto_opera+="7";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnOcho:
                texto_opera+="8";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnNueve:
                texto_opera+="9";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnCero:
                texto_opera+="0";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnCeros:
                texto_opera+="000";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnC:
                try
                {
                    texto_opera=texto_opera.substring(0,n-1);
                    txtvDispOpera.setText(texto_opera);
                }catch ( IndexOutOfBoundsException error) {
                    Log.d("Clear", "No se puede eliminar más ");
                }
                break;
            case R.id.btnDel:
                texto_opera="";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnPunto:
                texto_opera+=".";
                txtvDispOpera.setText(texto_opera);
                break;

            case R.id.btnMas:
                valor1= Float.parseFloat(texto_opera);
                banderaSum=true;

                texto_opera+="+";
                txtvDispOpera.setText(texto_opera);

                texto_opera="";

                break;
            case R.id.btnMenos:
                valor1= Float.parseFloat(texto_opera);
                banderaRes=true;

                texto_opera+="-";
                txtvDispOpera.setText(texto_opera);
                texto_opera="";
                break;
            case R.id.btnPor:
                valor1= Float.parseFloat(texto_opera);
                banderaMult=true;
                texto_opera+="x";
                txtvDispOpera.setText(texto_opera);
                texto_opera="";
                break;
            case R.id.btnDiv:
                valor1= Float.parseFloat(texto_opera);
                banderaDiv=true;
                texto_opera+="/";
                txtvDispOpera.setText(texto_opera);
                texto_opera="";
                break;
            case R.id.btnCos:
                texto_opera+= "cos(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnSin:
                texto_opera+= "sin(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnTan:
                texto_opera+= "tan(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnSin1:
                texto_opera+= "sin-1(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnCos1:
                texto_opera+= "cos-1(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnTan1:
                texto_opera+= "tan-1(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnParDer:
                texto_opera+= ")";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnParIzq:
                texto_opera+= "(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnPi:
                texto_opera+= "π";
                txtvDispOpera.setText(texto_opera);
                banderaPi=true;

                break;
            case R.id.btnCubo:
                texto_opera+= "³";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnCuadrado:
                texto_opera+= "²";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnLn:
                texto_opera+= "Ln(";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnFac:
                texto_opera+= "!";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnE:
                texto_opera+= "e";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnExponencial:
                texto_opera+= "^";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnRaiz:
                texto_opera+= "√";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnRaizCub:
                texto_opera+= "³√";
                txtvDispOpera.setText(texto_opera);
                break;
            case R.id.btnIgual:
                valor2=Float.parseFloat(texto_opera);

                if(banderaSum)
                {
                    res = valor1 +  valor2;
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaSum=false;
                }
                else if(banderaRes)
                {
                    res=valor1-valor2;
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaRes=false;
                }
                else if(banderaMult)
                {
                    res=valor1*valor2;
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaMult=false;
                }
                else if(banderaDiv)
                {
                    res=valor1/valor2;
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaDiv=false;
                }
                else if(banderaCos)
                {
                    double angulo= (double)valor2;
                    res=(float)Math.cos((angulo));
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaCos=false;

                }
                else if(banderaSin)
                {
                    double angulo= (double)valor2;
                    res=(float)Math.sin((angulo));
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaSin=false;

                }
                else if(banderaTan)
                {
                    double angulo= (double)valor2;
                    res=(float)Math.tan((angulo));
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaSin=false;

                }
                else if(banderaCos1)
                {
                    double angulo= (double)valor2;
                    res=(float)Math.acos((angulo));
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaCos1=false;

                }else if(banderaSin1)
                {
                    double angulo= (double)valor2;
                    res=(float)Math.asin((angulo));
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaSin1=false;

                }
                else if(banderaTan1)
                {
                    double angulo= (double)valor2;
                    res=(float)Math.atan((angulo));
                    resultadoFinal= Float.toString(res);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaTan1=false;
                }
                else if(banderaPi)
                {
                    resultadoFinal= Double.toString(Math.PI);
                    txtvDispResultado.setText(resultadoFinal);
                    banderaPi=false;
                }

                break;




        }
    }

}
