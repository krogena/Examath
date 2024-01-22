package com.example.examath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.examath.databinding.FragmentFsBinding


class FsFragment : Fragment() {
    private lateinit var binding: FragmentFsBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.fs_1))
        binding = FragmentFsBinding.inflate(inflater, container, false)
        return binding.root
    }
}