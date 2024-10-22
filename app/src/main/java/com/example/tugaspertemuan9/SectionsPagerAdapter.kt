package com.example.tugaspertemuan9

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

//Deklarasi Kelas SectionsPagerAdapter
class SectionsPagerAdapter (activity: AppCompatActivity) :
FragmentStateAdapter(activity) {
    //Metode getItemCount
    override fun getItemCount(): Int {
        return 2
        //mengembalikan jumlah total fragment yang akan ditampilkan
    }

    //mengembalikan jumlah total fragment yang akan ditampilkan
    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = RegisterFragment()
            1 -> fragment = LoginFragment()
            else -> throw IllegalStateException("Unexpected position: $position")
        }
        return fragment as Fragment
    }

}