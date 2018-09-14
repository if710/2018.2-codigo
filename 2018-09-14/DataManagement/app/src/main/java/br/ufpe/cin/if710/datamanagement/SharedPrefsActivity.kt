package br.ufpe.cin.if710.datamanagement

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_shared_prefs.*

import java.util.Random

class SharedPrefsActivity : Activity() {
    private var maiorPontuacao = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_prefs)

        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        play_button.setOnClickListener {
            val numeroAleatorio = Random().nextInt(10000)
            game_score_text.text = numeroAleatorio.toString()
            if (numeroAleatorio > maiorPontuacao) {
                high_score_text.text = numeroAleatorio.toString()
                maiorPontuacao = numeroAleatorio
                val prefsEditor = sharedPreferences.edit()
                prefsEditor.putInt(RECORDE, maiorPontuacao)
                prefsEditor.commit()
            }
        }

        reset_button.setOnClickListener {
            maiorPontuacao = 0
            game_score_text.text = ""
            high_score_text.text = "0"
            val prefsEditor = sharedPreferences.edit()
            prefsEditor.remove(RECORDE)
            prefsEditor.commit()
        }

        maiorPontuacao = sharedPreferences.getInt(RECORDE, 0)

        high_score_text.text = maiorPontuacao.toString()
    }

    companion object {
        private val RECORDE = "recorde"
    }
}
