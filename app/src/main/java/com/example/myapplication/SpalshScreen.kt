package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow


class SpalshScreen : Fragment(R.layout.fragment_spalsh_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
                              parentFragmentManager.commit {
                                  add(R.id.fragment_host, BlankFragment())
                              }

        }, 5000)
    }

}