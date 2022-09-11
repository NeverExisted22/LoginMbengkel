//package com.example.loginmbengkel
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.loginmbengkel.entity.Pesan
//
//class FragmenPesan : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_pesan, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
//        super.onViewCreated(view, savedInstanceState)
//        val layoutManager = LinearLayoutManager(context)
//        val adapter : RVPesanAdapter = RVPesanAdapter(Pesan.listOfPesan)
//
//        val rvDosen : RecyclerView = view.findViewById(R.id.rv_pesan)
//
//        rvDosen.layoutManager = layoutManager
//
//        rvDosen.setHasFixedSize(true)
//
//        rvDosen.adapter = adapter
//
//    }
//}