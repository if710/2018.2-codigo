package br.ufpe.cin.if710.broadcastreceiver

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val STA_BROADCAST_ACTION = "br.ufpe.cin.if710.broadcasts.exemplo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enviarBroadcast.setOnClickListener {
            sendBroadcast(Intent(STA_BROADCAST_ACTION))
        }

        abrirActivity.setOnClickListener { startActivity(Intent(applicationContext, DynRecActivity::class.java)) }
        smsActivity.setOnClickListener { startActivity(Intent(applicationContext, SmsActivity::class.java)) }

        bateriaActivity.setOnClickListener { startActivity(Intent(applicationContext, BateriaActivity::class.java)) }
    }
}
