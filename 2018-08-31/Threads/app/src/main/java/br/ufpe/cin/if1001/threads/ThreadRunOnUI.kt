package br.ufpe.cin.if1001.threads

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.threads.*

class ThreadRunOnUI : Activity() {

    private var mBitmap: Bitmap? = null
    private val mDelay = 5000
    internal var toasts = 0

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.threads)

        loadButton.setOnClickListener { loadIcon() }
        otherButton.setOnClickListener {
            toasts++
            contadorToasts!!.text = getString(R.string.contador_de_toasts) + toasts
            Toast.makeText(applicationContext, "Estou trabalhando... ($toasts)", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadIcon() {
        Thread(Runnable {
            try {
                Thread.sleep(mDelay.toLong())
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            mBitmap = BitmapFactory.decodeResource(resources,
                    R.drawable.painter)

            //mImageView.setImageBitmap(mBitmap);
            this@ThreadRunOnUI.runOnUiThread { imageView.setImageBitmap(mBitmap) }
        }).start()
    }

}
