package jp.starfree.tera98meteor.texteditortest

import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        val fontSize = viewModel.textFontSize.value ?: 10F
        val rowText = vH.rowView.list_item as TextView
        rowText.setTextSize(TypedValue.COMPLEX_UNIT_SP ,fontSize)
    }
    class ViewHolderOfCell(_rowView: View) : RecyclerView.ViewHolder(_rowView){
        val rowView: View =  _rowView
    }

    fun changeFontSize(){
        notifyDataSetChanged()
    }
}
class CustomItemDecoration(val margin:Int):RecyclerView.ItemDecoration() {

    fun createDefaultDecoration(context: Context): CustomItemDecoration? {
        val spacingInPixels = context.resources.getDimensionPixelSize(R.dimen.item_margin)
        return CustomItemDecoration(spacingInPixels)
    }
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.top = margin
        outRect.left = 4
        outRect.right = 4
        outRect.bottom = margin
    }
}