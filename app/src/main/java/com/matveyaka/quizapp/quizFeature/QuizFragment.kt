package com.matveyaka.quizapp.quizFeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.matveyaka.quizapp.R
import com.matveyaka.quizapp.helpers.dataManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class QuizFragment:Fragment() {
    @Inject
    lateinit var manager: dataManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val welcomeLabel = view.findViewById<TextView>(R.id.welcome_text)
        welcomeLabel.text = getString(R.string.welcome_user, manager.userName)
    }
}