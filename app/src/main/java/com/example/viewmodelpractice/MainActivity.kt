package com.example.viewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel : MainViewModel
    var firstNum :Int = 0
    var secondNum :Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val enteredTable : Int

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.btnAdd.setOnClickListener {

            firstNum = binding.edtInput.text.toString().toInt()
            val add : String = "+"
            mainViewModel.result(firstNum,add)
            binding.edtInput.text.clear()
        }
        binding.btnSub.setOnClickListener {

            firstNum = binding.edtInput.text.toString().toInt()
            val sub : String = "-"
            mainViewModel.result(firstNum , sub)
            binding.edtInput.text.clear()
        }
        binding.btnEquals.setOnClickListener {

            secondNum = binding.edtInput.text.toString().toInt()
            mainViewModel.add(secondNum)
            mainViewModel.sub(secondNum)
            binding.txtview.setText("Hi Ajay ${mainViewModel.mainResult}")

        }
    }
}