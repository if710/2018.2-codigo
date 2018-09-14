package br.ufpe.cin.if710.datamanagement

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMemoriaExterna.setOnClickListener {
            startActivity(Intent(applicationContext,MemoriaExternaActivity::class.java))
        }
        btnMemoriaInterna.setOnClickListener {
            startActivity(Intent(applicationContext,MemoriaInternaActivity::class.java))
        }
        btnSharedPreferences.setOnClickListener {
            startActivity(Intent(applicationContext,MemoriaInternaActivity::class.java))
        }
        btnPreferencesActivity.setOnClickListener {
            startActivity(Intent(applicationContext,PrefsActivity::class.java))
        }
        btnSharedPreferences.setOnClickListener {
            startActivity(Intent(applicationContext,SharedPrefsActivity::class.java))
        }
        btnSQLite.setOnClickListener {
            startActivity(Intent(applicationContext,SQLiteActivity::class.java))
        }
    }
}
