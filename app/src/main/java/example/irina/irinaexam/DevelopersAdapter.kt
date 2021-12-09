package example.irina.irinaexam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DevelopersAdapter(private val developersNames: List<String>):
    RecyclerView.Adapter<DevelopersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DevelopersViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_list_item,parent,false)
        return DevelopersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DevelopersViewHolder, position: Int) {
        val name = developersNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return developersNames.size
    }
}