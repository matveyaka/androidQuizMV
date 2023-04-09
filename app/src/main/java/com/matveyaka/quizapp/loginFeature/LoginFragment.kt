package com.matveyaka.quizapp.loginFeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.matveyaka.quizapp.R
import com.matveyaka.quizapp.helpers.dataManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class LoginFragment:Fragment() {
    @Inject
    lateinit var manager: dataManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.enter_button)
        button.isEnabled = manager.userName.isNotEmpty()
        button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_quizFragment2)
        }

        val userText = view.findViewById<EditText>(R.id.username_field)
        userText.doOnTextChanged { text, start, before, count ->
            manager.userName = text.toString()
            button.isEnabled = manager.userName.isNotEmpty()
        }
    }
}