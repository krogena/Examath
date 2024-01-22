package com.example.examath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.examath.databinding.FragmentMatricesBinding

import com.example.examath.databinding.FragmentSlauBinding


class SlauFragment : Fragment() {
    private lateinit var binding: FragmentSlauBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.slau_1))
        binding = FragmentSlauBinding.inflate(inflater, container, false)
        return binding.root
    }
}