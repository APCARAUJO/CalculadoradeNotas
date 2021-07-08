package br.com.apca.calcnotas

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado




        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val nota3 = Integer.parseInt(nota3.text.toString())
            val nota4 = Integer.parseInt(nota4.text.toString())
            val media = (nota1 + nota2+ nota3 + nota4)/4
            val faltas = Integer.parseInt(Faltas.text.toString())

            if(media >= 7 && faltas<= 5 ){
                resultado.setText("Nota Final: " + media + "\n" + "Faltas: " + faltas + "\n Aluno Aprovado")
                resultado.setTextColor(Color.GREEN)




            }
            else{
                resultado.setText("Nota Final: " + media + "\n " + "Faltas: " + faltas + "\n Aluno Reprovado")
                resultado.setTextColor(Color.RED)
            }
        }

    }
}
