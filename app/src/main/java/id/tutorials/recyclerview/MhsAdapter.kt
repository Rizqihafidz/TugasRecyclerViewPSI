package id.tutorials.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MhsAdapter (private val listMhs: ArrayList<Mahasiswa>) : RecyclerView.Adapter<MhsAdapter.CardViewViewHolder>(){
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_item_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_mahasiswa,parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMhs.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val mhs = listMhs[position]

        Glide.with(holder.itemView.context)
            .load(mhs.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = mhs.name
        holder.tvDeskripsi.text = mhs.deskripsi

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih "+listMhs[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
    }

}