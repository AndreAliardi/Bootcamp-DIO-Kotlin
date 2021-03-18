package br.everis.myfirstapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular //btCalcular foi a variável que foi criada para ser usada aqui
        // e calcular é o ID do botão que tem la no res > layout > activity_main.xml
        val resultado = resultado

        // evento que ocorre quando o botão é apertado
        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString()) // a gente recebe um valor como texto
            // então precisa converter para string e depois para Int
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10){
                resultado.setText("Aluno foi aprovado\nNota final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            } else{
                resultado.setText("Aluno foi reprovado\nNota final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }

        }
    }
}