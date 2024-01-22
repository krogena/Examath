package com.example.examath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.example.examath.databinding.FragmentFuncBinding


class FuncFragment : Fragment() {
    private lateinit var binding: FragmentFuncBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.f_1))
        binding = FragmentFuncBinding.inflate(inflater, container, false)
        return binding.root
    }
}