package com.matveyaka.quizapp.resultFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.matveyaka.quizapp.R
import com.matveyaka.quizapp.helpers.dataManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint

class ResultFrament: Fragment() {

    @Inject
    lateinit var storage: dataManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frsgment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resultText = view.findViewById<TextView>(R.id.resultTest)
        resultText.text = getString(R.string.test_result, storage.test.score)
        val restartButton = view.findViewById<Button>(R.id.restartButton)
        restartButton.setOnClickListener {
            storage.test.score = 0
            findNavController().popBackStack(R.id.loginFragment, false)
        }
    }
}