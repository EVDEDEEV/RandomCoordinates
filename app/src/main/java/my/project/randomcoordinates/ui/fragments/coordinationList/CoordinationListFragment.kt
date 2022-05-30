package my.project.randomcoordinates.ui.fragments.coordinationList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.project.randomcoordinates.adapters.CoordinationAdapter
import my.project.randomcoordinates.databinding.FragmentCoordinationListBinding
import my.project.randomcoordinates.other.CoordinatesCalculation


class CoordinationListFragment : Fragment() {



    private lateinit var _binding: FragmentCoordinationListBinding
    private val binding get() = _binding
    private val adapter = CoordinationAdapter()
    private val cocalculation = CoordinatesCalculation()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentCoordinationListBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

        }


    }


}