package com.romakumari.appdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil.setContentView
import com.romakumari.appdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
lateinit var binding: ActivityMainBinding
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.name="PRIYA"
    binding.number=33
    binding.mainActivity=this
    binding.show=true

}
    fun ButtonClick(){
        Toast.makeText(this,"click", Toast.LENGTH_SHORT).show()
        binding.show=!(binding.show?:false)

    }

}