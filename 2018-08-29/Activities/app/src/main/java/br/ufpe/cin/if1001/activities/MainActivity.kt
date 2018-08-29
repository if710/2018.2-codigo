package br.ufpe.cin.if1001.activities

import android.app.Activity
import android.content.Intent
import android.content.Intent.CATEGORY_BROWSABLE
import android.content.Intent.CATEGORY_DEFAULT
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}