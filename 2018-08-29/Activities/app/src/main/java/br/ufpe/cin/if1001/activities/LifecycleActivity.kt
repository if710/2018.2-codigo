package br.ufpe.cin.if1001.activities

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lifecycle.*
import org.jetbrains.anko.alert

class LifecycleActivity : Activity() {
    private var keyDIGITADO = "oQueFoiDigitado"
    private var keyLIFECYCLE = "lifecycle"
    private var status: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        status = "onCreate() de " + this.localClassName
        atualizaLifecycle(status)
        toast(status)
        Log.d(this.localClassName, status)

    }



    private fun atualizaLifecycle(msg: String) {
        val m = lifecycleLog.text.toString()
        lifecycleLog.text = "$msg \n $m"
    }

    fun Any.toast(msg:String) {
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }
}
