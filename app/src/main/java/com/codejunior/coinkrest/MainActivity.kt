package com.codejunior.coinkrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.codejunior.coinkrest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val nanController: NavController = Navigation.findNavController(View(applicationContext))
        val arrayDocuments = resources.getStringArray(R.array.DocumentArray)
        val arrayGender = resources.getStringArray(R.array.Gender)

        val adapterDocuments = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item, arrayDocuments
        )

        val adapterGender = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item, arrayGender
        )

        binding?.spinnerDocument?.adapter = adapterDocuments
        binding?.spinnerGender?.adapter = adapterGender

        binding?.btnMain?.setOnClickListener{
            nanController.navigate(R.id.action_global_viewData)
        }

    }
}