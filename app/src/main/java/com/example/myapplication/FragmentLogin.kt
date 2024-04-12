package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class FragmentLogin : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button  = view.findViewById<Button>(R.id.registr)
        button.setOnClickListener {
            parentFragmentManager.commit {
                replace<fragment_Registration>(R.id.fragment_host)
            }
        }
    }
}