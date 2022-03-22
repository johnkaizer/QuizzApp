package com.example.quizzy

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionsList =ArrayList<Question>()

        val que1 =Question(
            1,
            "What type of dog breed is this?",
             R.drawable.german,
            "BoerBel",
            "German Shepherd",
            "Maltese",
            "Rotweiller",
            2

            )
        questionsList.add(que1)
        val que2 =Question(
            1,
            "What type of dog breed is this?",
            R.drawable.maltese,
            "BoerBel",
            "German Shepherd",
            "Maltese",
            "Rotweiller",
            3

        )
        questionsList.add(que2)
        val que3 =Question(
            1,
            "What type of dog breed is this?",
            R.drawable.boerrbel,
            "BoerBel",
            "German Shepherd",
            "Maltese",
            "Rotweiller",
            1

        )
        questionsList.add(que3)
        val que4 =Question(
            1,
            "What type of german shepherd is this?",
            R.drawable.sab,
            "White shepherd",
            "Black shepherd",
            "Black n Tarn",
            "Sable",
            4

        )
        questionsList.add(que4)
        val que5 =Question(
            1,
            "What type of dog is this?",
            R.drawable.sab,
            "German shepherd",
            "Rottweiler",
            "Maltese",
            "Spitz",
            2

        )
        questionsList.add(que5)
        return questionsList
    }
}