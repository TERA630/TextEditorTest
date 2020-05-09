package jp.starfree.tera98meteor.texteditortest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val textFontSize:MutableLiveData<Float> by lazy {
        MutableLiveData<Float>(8F)
    }
    val textLineSpace:MutableLiveData<Float> by lazy {
        MutableLiveData<Float>(8F)
    }

}