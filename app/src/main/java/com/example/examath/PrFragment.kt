package com.example.examath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.examath.databinding.FragmentPrBinding


class PrFragment : Fragment() {
    private lateinit var binding: FragmentPrBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.pr_1))
        binding = FragmentPrBinding.inflate(inflater, container, false)
        return binding.root
    }
}