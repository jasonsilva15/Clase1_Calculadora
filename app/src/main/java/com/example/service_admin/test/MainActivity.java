package com.example.service_admin.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private boolean yaTienePunto=false;
    private double valor1=0.0;
    private double valor2=0.0;
    private int Action =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddButtonActions();
    }

    public void AddButtonActions() {

        final EditText resultado = findViewById(R.id.txt_valor1);

        AddButton1Action(resultado);
        AddButton2Action(resultado);
        AddButton3Action(resultado);
        AddButton4Action(resultado);
        AddButton5Action(resultado);
        AddButton6Action(resultado);
        AddButton7Action(resultado);
        AddButton8Action(resultado);
        AddButton9Action(resultado);
        AddButton0Action(resultado);
        AddPuntoAction(resultado);
        AddClearAction(resultado);
        AddSumaAction(resultado);
        AddCalcularAction(resultado);
        AddRestAction(resultado);
        AddMultiAction(resultado);
        AddDiviAction(resultado);
        AddModuloAction(resultado);


    }

        public void AddButton1Action(final EditText resultado){

            Button numero1=findViewById(R.id.btn_1);
            numero1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Aqui estara la accion
                    resultado.setText(resultado.getText()+"1");

                }
            });

        }


    public void AddButton2Action(final EditText resultado){

        Button numero2=findViewById(R.id.btn_2);
        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"2");
            }
        });

    }


    public void AddButton3Action(final EditText resultado){

        Button numero3=findViewById(R.id.btn_3);
        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"3");
            }
        });

    }


    public void AddButton4Action(final EditText resultado){

        Button numero4=findViewById(R.id.btn_4);
        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"4");
            }
        });

    }


    public void AddButton5Action(final EditText resultado){

        Button numero5=findViewById(R.id.btn_5);
        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"5");
            }
        });

    }


    public void AddButton6Action(final EditText resultado){

        Button numero6=findViewById(R.id.btn_6);
        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"6");
            }
        });

    }

    public void AddButton7Action(final EditText resultado){

        Button numero7=findViewById(R.id.btn_7);
        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"7");
            }
        });

    }

    public void AddButton8Action(final EditText resultado){

        Button numero8=findViewById(R.id.btn_8);
        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"8");
            }
        });

    }

    public void AddButton9Action(final EditText resultado){

        Button numero9=findViewById(R.id.btn_9);
        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"9");
            }
        });

    }

    public void AddButton0Action(final EditText resultado){

        Button numero0=findViewById(R.id.btn_0);
        numero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                resultado.setText(resultado.getText()+"0");
            }
        });

    }


    public void AddPuntoAction(final EditText resultado){

        Button punto=findViewById(R.id.btn_punto);
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                if(!yaTienePunto){
                    if( resultado.getText().toString().equals("")){
                        resultado.setText(resultado.getText()+"0.");
                    } else {
                        resultado.setText(resultado.getText()+".");
                    }

                }
                yaTienePunto=true;
            }

        });

    }


    public void AddClearAction(final EditText resultado){

        Button Limpiar=findViewById(R.id.btn_Limpiar);
        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                resultado.setText("");
                yaTienePunto=false;
                valor1=0.0;
                valor2=0.0;
                Action=-1;
            }

        });

    }


    public void AddSumaAction(final EditText resultado){
        Button suma=findViewById(R.id.btn_s);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                valor1=Double.parseDouble(resultado.getText().toString());
                Action=0;
                resultado.setText("");
            }

        });


    }


    public void AddRestAction(final EditText resultado){
        Button resta=findViewById(R.id.btn_r);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                valor1=Double.parseDouble(resultado.getText().toString());
                Action=1;
                resultado.setText("");
            }

        });


    }

    public void AddMultiAction(final EditText resultado){
        Button multi=findViewById(R.id.btn_m);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                valor1=Double.parseDouble(resultado.getText().toString());
                Action=2;
                resultado.setText("");
            }

        });


    }


    public void AddDiviAction(final EditText resultado){
        Button divi=findViewById(R.id.btn_d);
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                valor1=Double.parseDouble(resultado.getText().toString());
                Action=3;
                resultado.setText("");
            }

        });


    }

    public void AddModuloAction(final EditText resultado){
        Button Modu=findViewById(R.id.btn_Resi);
        Modu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion

                valor1=Double.parseDouble(resultado.getText().toString());
                Action=4;
                resultado.setText("");
            }

        });


    }



    public void AddCalcularAction(final EditText resultado){
        Button igual=findViewById(R.id.btn_igual);

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui estara la accion
                if(Action !=-1){

                    if(resultado.getText().toString().equals("")){
                        valor2=0.0;
                    }else{
                        valor2=Double.parseDouble(resultado.getText().toString());
                    }
                    switch (Action){
                        case 0:
                            double resultadoOperacion=valor1+valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 1:
                             resultadoOperacion=valor1-valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 2:
                            resultadoOperacion=valor1*valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 3:
                            if(valor2==0){
                                break;
                            }
                            resultadoOperacion=valor1/valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;

                        case 4:
                            resultadoOperacion=valor1%valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;

                    }

                }

            }

        });


    }

}
