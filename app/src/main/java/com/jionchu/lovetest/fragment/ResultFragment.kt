package com.jionchu.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.jionchu.lovetest.R
import kotlinx.android.synthetic.main.fragment_result.*

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {

    var option = -1
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)

        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option: Int) {
        when(option) {
            1 -> {
                tv_main.text = getString(R.string.result_1)
                tv_sub.text = getString(R.string.result_detail_1)
            }
            2 -> {
                tv_main.text = getString(R.string.result_2)
                tv_sub.text = getString(R.string.result_detail_2)
            }
            3 -> {
                tv_main.text = getString(R.string.result_3)
                tv_sub.text = getString(R.string.result_detail_3)
            }
            4 -> {
                tv_main.text = getString(R.string.result_4)
                tv_sub.text = getString(R.string.result_detail_4)
            }
        }
    }

}