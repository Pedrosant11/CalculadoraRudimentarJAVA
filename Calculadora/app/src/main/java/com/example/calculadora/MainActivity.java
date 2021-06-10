package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_valor1, et_valor2;
    TextView tv_resultado;
    Button bt_mais, bt_menos, bt_mult, bt_divisao, bt_potencia, bt_raiz, bt_limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);

        tv_resultado = findViewById(R.id.tv_resultado);

        bt_mais = findViewById(R.id.bt_mais);
        bt_menos = findViewById(R.id.bt_menos);
        bt_mult = findViewById(R.id.bt_mult);
        bt_divisao = findViewById(R.id.bt_divisao);
        bt_potencia = findViewById(R.id.bt_potencia);
        bt_raiz = findViewById(R.id.bt_raiz);
        bt_limpar = findViewById(R.id.bt_limpar);
        
        bt_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1, valor2, res;
                String s_valor1, s_valor2;

                s_valor1 = et_valor1.getText().toString();
                s_valor2 = et_valor2.getText().toString();

                valor1 = Float.parseFloat(s_valor1);
                valor2 = Float.parseFloat(s_valor2);
                res = valor1 + valor2;

                tv_resultado.setText("" + res);
            }
        });

        bt_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1, valor2, res;
                String s_valor1, s_valor2;

                s_valor1 = et_valor1.getText().toString();
                s_valor2 = et_valor2.getText().toString();

                valor1 = Float.parseFloat(s_valor1);
                valor2 = Float.parseFloat(s_valor2);
                res = valor1 - valor2;

                tv_resultado.setText("" + res);
            }
        });

        bt_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1, valor2, res;
                String s_valor1, s_valor2;

                s_valor1 = et_valor1.getText().toString();
                s_valor2 = et_valor2.getText().toString();

                valor1 = Float.parseFloat(s_valor1);
                valor2 = Float.parseFloat(s_valor2);
                res = valor1 * valor2;

                tv_resultado.setText("" + res);
            }
        });

        bt_divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1, valor2, res;
                String s_valor1, s_valor2;

                s_valor1 = et_valor1.getText().toString();
                s_valor2 = et_valor2.getText().toString();

                valor1 = Float.parseFloat(s_valor1);
                valor2 = Float.parseFloat(s_valor2);
                res = valor1 / valor2;

                tv_resultado.setText("" + res);
            }
        });

        bt_potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1, valor2;
                double res;
                String s_valor1, s_valor2;

                s_valor1 = et_valor1.getText().toString();
                s_valor2 = et_valor2.getText().toString();

                valor1 = Float.parseFloat(s_valor1);
                valor2 = Float.parseFloat(s_valor2);
                res = Math.pow(valor1, valor2);

                tv_resultado.setText("" + res);
            }
        });

        bt_raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1, valor2;
                double res;
                String s_valor1, s_valor2;

                s_valor1 = et_valor1.getText().toString();
                s_valor2 = et_valor2.getText().toString();

                valor1 = Float.parseFloat(s_valor1);
                valor2 = Float.parseFloat(s_valor2);
                res = Math.sqrt(valor1);

                tv_resultado.setText("" + res);
            }
        });

        bt_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_valor1.setText("");
                et_valor2.setText("");
                tv_resultado.setText("");
            }
        });
    }
}