package com.example.examplemvvm.model

class QuoteProvider {

    companion object {
        fun random(): QuoteModel {
            val position = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "It's not a bug. It's an undocumented feature!",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Life is like riding a bicycle. To keep your balance, you must keep moving.",
                author = "Albert Einstein"
            ),
            QuoteModel(
                quote = "The only way to do great work is to love what you do.",
                author = "Steve Jobs"
            )
        )
    }
}