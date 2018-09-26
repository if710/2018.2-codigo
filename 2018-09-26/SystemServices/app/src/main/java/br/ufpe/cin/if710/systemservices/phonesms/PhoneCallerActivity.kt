package br.ufpe.cin.if710.systemservices.phonesms

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import br.ufpe.cin.if710.systemservices.R
import kotlinx.android.synthetic.main.activity_phone_dial_call.*

class PhoneCallerActivity : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_dial_call)
        btnDial.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val numberToDial = numberToDial.text.toString()
        val data = Uri.parse("tel:$numberToDial")
        //precisa de permissao CALL_PHONE
        val i = Intent(Intent.ACTION_CALL, data)
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            startActivity(i)
        }
    }
}