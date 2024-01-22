package com.example.examath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examath.adapter.DerivativesFragmentAdapter
import com.example.examath.adapter.IndefiniteFragmentAdapter
import com.example.examath.databinding.FragmentMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class IndefiniteFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: IndefiniteFragmentAdapter
    private lateinit var imagesList: ArrayList<Indefinite>
    private lateinit var dbref: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.indefinite_1))
        binding = FragmentMainBinding.inflate(inflater)
        binding.rcView.layoutManager = LinearLayoutManager(context)
        imagesList = arrayListOf()
        dbref = FirebaseDatabase.getInstance().getReference("Indefinite")


        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (dataSnapShot in snapshot.children) {
                        val image = dataSnapShot.getValue(Indefinite::class.java)
                        imagesList.add(image!!)
                    }
                    adapter = IndefiniteFragmentAdapter(imagesList, this@IndefiniteFragment)
                    binding.rcView.adapter = adapter
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // обработка ошибки
            }
        })
        return binding.root
    }
}