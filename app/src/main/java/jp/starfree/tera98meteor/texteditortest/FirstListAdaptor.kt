package jp.starfree.tera98meteor.texteditortest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_simple.view.*

class FirstListAdaptor ():RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int = 12
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_simple, parent, false)
        return ViewHolderOfCell(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val VH = holder as ViewHolderOfCell
        VH.rowView.list_item.text = "我が輩は猫である｡"
    }
    class ViewHolderOfCell(val rowView: View) : RecyclerView.ViewHolder(rowView)
}
