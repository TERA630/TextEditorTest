package jp.starfree.tera98meteor.texteditortest

import android.app.ActionBar
import android.text.Layout
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.MarginLayoutParamsCompat
import androidx.core.view.marginBottom
import androidx.core.view.marginStart
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_simple.view.*


class FirstListAdaptor (private val viewModel: MainViewModel):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    // Adaptor lifecycle
    override fun getItemCount(): Int = 12
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_simple, parent, false)
        return ViewHolderOfCell(itemView)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vH = holder as ViewHolderOfCell
        val container = holder.rowView
        val rowText = TextView(holder.rowView.context)
        rowText.text = "我が輩は猫である｡"
        val fontSize = viewModel.textFontSize.value ?: 10F
        rowText.setTextSize(TypedValue.COMPLEX_UNIT_SP ,fontSize)
        val layoutParam = rowText.layoutParams
        layoutParam.height = ConstraintLayout.LayoutParams.WRAP_CONTENT
        layoutParam.width = ConstraintLayout.LayoutParams.WRAP_CONTENT
        val mlp  = ViewGroup.MarginLayoutParams(layoutParam)
        val margin = viewModel.textLineSpace.value ?: 0
        mlp.setMargins(mlp.marginStart,margin,mlp.marginEnd, margin)
        
     //   rowText.layoutParams = mlp
    }
    class ViewHolderOfCell(_rowView: View) : RecyclerView.ViewHolder(_rowView){
        val rowView: View =  _rowView
    }

    fun changeFontSize(){
        notifyDataSetChanged()
    }
}
