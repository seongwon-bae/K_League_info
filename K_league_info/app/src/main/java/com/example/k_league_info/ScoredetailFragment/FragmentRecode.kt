package com.example.k_league_info.ScoredetailFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.k_league_info.R
import kotlinx.android.synthetic.main.fragment_scoredetail_recode.view.*
class FragmentRecode : Fragment() {
    var name = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =inflater.inflate(R.layout.fragment_scoredetail_recode, container, false)
        view.textView2.text = name

        return view
    }


}