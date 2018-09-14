package br.ufpe.cin.if710.datamanagement

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_prefs.*

class PrefsActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prefs)

        edit_pref_button.setOnClickListener {
            startActivity(Intent(
                    this@PrefsActivity,
                    PrefsEditActivity::class.java))
        }
        check_pref_button.setOnClickListener {
            startActivity(Intent(
                    this@PrefsActivity,
                    PrefsMenuActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        //Obtém o valor para a preference de nome de usuário
        val user_name = prefs.getString(USERNAME, "nada escolhido...")
        textoUsername.text = user_name
    }

    companion object {
        val USERNAME = "uname"
    }


}