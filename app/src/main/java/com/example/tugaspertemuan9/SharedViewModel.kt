package com.example.tugaspertemuan9

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Deklarasi Kelas SharedViewModel
class SharedViewModel : ViewModel() {
    //menyimpan dan mengelola data yang akan dibagikan antar fragment atau activity
    private val _email = MutableLiveData<String>()
    //menyimpan data yang dapat diubah
    val email: LiveData<String> get() = _email
    //properti publik yang hanya dapat dibaca oleh komponen lain
    //livedata lainnya
    private val _password = MutableLiveData<String>()
    val password: LiveData<String> get() = _password

    private val _username = MutableLiveData<String>()
    val username: LiveData<String> get() = _username

    private val _number = MutableLiveData<String>()
    val number: LiveData<String> get() = _number

    private val _gender = MutableLiveData<String>()
    val gender: LiveData<String> get() = _gender

    //Metode Setter
    //untuk mengupdate nilai
    fun setEmail(email: String) {
        _email.value = email
    }

    fun setPassword(password: String) {
        _password.value = password
    }

    fun setUsername(username: String) {
        _username.value = username
    }

    fun setNumber(number: String) {
        _number.value = number
    }

    fun setGender(gender: String) {
        _gender.value = gender
    }

    //Metode clearData
    fun clearData() {
        _email.value = ""
        _password.value = ""
        _username.value = ""
        _number.value = ""
        _gender.value = ""
        //mengatur semua nilai LiveData ke string kosong
    }
}