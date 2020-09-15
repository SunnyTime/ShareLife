package com.du.lifehome.ui.attention

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AttentionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is attention Fragment"
    }
    val text: LiveData<String> = _text
}