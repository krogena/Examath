package com.example.examath

import android.app.PendingIntent.getActivity
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examath.adapter.DerivativesFragmentAdapter
import com.example.examath.databinding.FragmentMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class PrlistFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: DerivativesFragmentAdapter
    private lateinit var imagesList: ArrayList<Derivatives>
    private lateinit var dbref: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        (activity as AppCompatActivity).supportActionBar?.setTitle(resources.getString(R.string.prlist_1))
        binding = FragmentMainBinding.inflate(inflater)
        binding.rcView.layoutManager = LinearLayoutManager(context)
        imagesList = arrayListOf()
        dbref = FirebaseDatabase.getInstance().getReference("Derivatives")


        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (dataSnapShot in snapshot.children) {
                        val image = dataSnapShot.getValue(Derivatives::class.java)
                        imagesList.add(image!!)
                    }
                    adapter = DerivativesFragmentAdapter(imagesList, this@PrlistFragment)
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