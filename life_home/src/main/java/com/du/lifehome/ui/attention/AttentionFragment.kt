package com.du.lifehome.ui.attention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.du.lifehome.R

/**
 * ClassName: AttentionFragment.kt
 * Function: 关注
 * Date: 2020-09-14 - 11:26
 * Author 杜时光
 * version 0.1
 */
class AttentionFragment : Fragment() {

    private lateinit var homeViewModel: AttentionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(AttentionViewModel::class.java)
        val root = inflater.inflate(R.layout.home_fragment_home, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }
}