package com.example.tugaspertemuan9

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.example.tugaspertemuan9.databinding.ActivityMain2Binding
import com.example.tugaspertemuan9.databinding.ActivityMain3Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Pengaturan ActionBar
        supportActionBar?.elevation = 0f
        //Menghapus bayangan di bawah ActionBar.
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#3A61F6")))
        //Mengubah latar belakang ActionBar menjadi biru

        //Mengambil data yang dikirim dari activity sebelumnya melalui Intent
        val username = intent.getStringExtra("USERNAME")
        val password = intent.getStringExtra("PASSWORD")
        val email = intent.getStringExtra("EMAIL")
        val number = intent.getStringExtra("NUMBER")
        val gender = intent.getStringExtra("GENDER")

        //Mengisi Data ke View
        with(binding) {
            edtUsername.setText(username)
            edtNumber.setText(number)
            edtGender.setText(gender)
        }

    }
}