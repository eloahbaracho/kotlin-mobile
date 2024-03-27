package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_aula.R

public class ConversorActivity : AppCompatActivity(){

    override fun onCreate(bundle : Bundle?){
        super.onCreate(bundle);
       setContentView(R.layout.conversorlayout);

        val btnConvert = findViewById<Button>(R.id.btn_converter);
        val edtMoeda = findViewById<EditText>(R.id.input_moeda);
        val edtCotacao = findViewById<EditText>(R.id.input_cotacao);
        val txtResultado = findViewById<TextView>(R.id.txt_resultado);

        btnConvert.setOnClickListener {
            val moeda = edtMoeda.text.toString().toFloat();
            val cotacao = edtCotacao.text.toString().toFloat();

            val resultado = moeda * cotacao;

            txtResultado.text = "Resultado: ${resultado}";
        }
    }
}