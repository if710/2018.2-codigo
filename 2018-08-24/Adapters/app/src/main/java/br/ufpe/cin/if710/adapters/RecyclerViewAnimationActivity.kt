package br.ufpe.cin.if710.adapters

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import android.support.v7.util.SortedList
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recycler_view_animation.*
import kotlinx.android.synthetic.main.item_cardview.view.*
import java.util.*

class RecyclerViewAnimationActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_animation)

    }

}
