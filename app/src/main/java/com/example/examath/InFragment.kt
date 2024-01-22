package com.example.examath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.examath.databinding.FragmentInBinding
import com.example.examath.databinding.FragmentPrBinding


class InFragment : Fragment() {
    private lateinit var binding: FragmentInBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.in_1))
        binding = FragmentInBinding.inflate(inflater, container, false)
        return binding.root
    }
}