package br.ufpe.cin.if1001.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_txt.*;

class TxtActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_txt)

        //val i = intent
        assunto.text = intent.getStringExtra(Intent.EXTRA_SUBJECT)
        texto.text = intent.getStringExtra(Intent.EXTRA_TEXT)

    }
}
