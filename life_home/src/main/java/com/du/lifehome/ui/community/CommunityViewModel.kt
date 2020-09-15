package com.du.lifehome.ui.community

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ClassName: CommunityViewModel.kt
 * Function: 社区
 * Date: 2020-09-02 - 15:03
 * Author 杜时光
 * version 0.1
 */
class CommunityViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is community Fragment"
    }
    val text: LiveData<String> = _text
}