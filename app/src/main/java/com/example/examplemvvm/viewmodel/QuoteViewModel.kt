package com.example.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.QuoteModel
import com.example.examplemvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    // LiveData permite a nuestro Activity subscribirse a un modelo de datos y se llama automaticamente
    //cuando se realiza un cambio en el modelo
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        // Cambiamos valor de LiveData
        quoteModel.postValue(currentQuote)
    }
}