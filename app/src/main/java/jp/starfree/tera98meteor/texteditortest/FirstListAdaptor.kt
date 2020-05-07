package jp.starfree.tera98meteor.texteditortest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FirstListAdaptor ():RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int = 7
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)
        return FirstListAdaptor.ViewHolderOfCell(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class ViewHolderOfCell(val rowView: View) : RecyclerView.ViewHolder(rowView)
}
