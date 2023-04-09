package com.matveyaka.quizapp.helpers

import com.matveyaka.quizapp.model.Answer
import com.matveyaka.quizapp.model.Question
import com.matveyaka.quizapp.model.Test

var answer1 = Answer(
    isCorrect = false,
    text = "не я"
)

var answer2 = Answer(
    isCorrect = false,
    text = "туристы"
)

var answer3 = Answer(
    isCorrect = false,
    text = "тот, кто пукнул"
)

var question1 = Question(
    text = "кто пукнул",
    answers = listOf(answer1, answer2, answer3)
)

//////////////////

var question2 = Question(
    text = "кто четкий",
    answers = listOf(
        Answer(
            isCorrect = true,
            text = "я"
        ),
        Answer(
            isCorrect = true,
            text = "оптимус прайм"
        ),
        Answer(
            isCorrect = true,
            text = "не знаю"
        ),
    )
)

var question3 = Question(
    text = "что задали на дом",
    answers = listOf(
        Answer(
            isCorrect = true,
            text = "математика номер 307"
        ),
        Answer(
            isCorrect = true,
            text = "кактус"
        ),
        Answer(
            isCorrect = true,
            text = "очки"
        ),
    )
)

val textExample = Test(
    score = 0,
    questions = listOf(question1, question2, question3)
)