package com.orchifai.todoapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter(private val dataTemp: Array<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
//        TODO: set a function to change the TextView inside the whole View
    }


//     Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.MyViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false) as View
        // set the view's size, margins, paddings and layout paramzeters
        return MyViewHolder(view)
    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val cellForRow = layoutInflater.inflate(R.layout.my_text_view, parent, false)
//        return CustomViewHolder(cellForRow)
//    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.view.findViewById<TextView>(R.id.tvToDoItem).text = dataTemp[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
//    override fun getItemCount() = myDataset.size
    override fun getItemCount() = dataTemp.size

}

class CustomViewHolder(v: View): RecyclerView.ViewHolder(v){

}