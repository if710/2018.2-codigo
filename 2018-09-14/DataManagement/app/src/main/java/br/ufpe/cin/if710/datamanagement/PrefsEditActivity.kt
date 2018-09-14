package br.ufpe.cin.if710.datamanagement

import android.app.Activity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_prefs_edit.*

class PrefsEditActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prefs_edit)
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val username = prefs.getString(PrefsActivity.USERNAME, "nada");
        editTextUsername.setText(username)

        salvarUsername.setOnClickListener {
            //pega o que foi digitado
            val oQueFoiDigitado = editTextUsername.text.toString()
            //obtém objeto que permite manipular SharedPreferences
            val editor = prefs.edit()
            //Atualiza o valor associado com USERNAME
            editor.putString(PrefsActivity.USERNAME, oQueFoiDigitado)
            //Salva a alteração
            editor.commit()
            //Fecha a Activity
            finish()
        }
    }
}
