package my.project.randomcoordinates.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.project.randomcoordinates.data.models.CoordinationModel
import my.project.randomcoordinates.databinding.CoordinationItemBinding
import my.project.randomcoordinates.other.CoordinatesCalculation

class CoordinationAdapter : RecyclerView.Adapter<CoordinationAdapter.CoordinationViewHolder>() {

    private val cocalculation = listOf<CoordinatesCalculation>()
    private val coordinationList = listOf<CoordinationModel>()

    class CoordinationViewHolder(
        private val binding: CoordinationItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(coordination: CoordinationModel) {
            binding.textView.text = coordination.addCoordinates().toString()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CoordinationViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = CoordinationItemBinding.inflate(layoutInflater, parent, false)
        return CoordinationViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: CoordinationViewHolder,
        position: Int,
    ) {
        holder.bind(coordinationList[position])
    }

    override fun getItemCount(): Int {
        return coordinationList.size
    }
}