package com.orchifai.todoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MyActivity : AppCompatActivity() {

            private lateinit var recyclerView: RecyclerView
            private lateinit var viewAdapter: RecyclerView.Adapter<*>
            private lateinit var viewManager: RecyclerView.LayoutManager
           val dataTemp = Array(100, { i -> (i * i).toString() })

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.my_activity)

                viewManager = LinearLayoutManager(this)
//                viewAdapter = MyAdapter(myDataset)
                viewAdapter = MyAdapter(dataTemp)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)

            layoutManager = viewManager

            adapter = viewAdapter

        }
    }
}
