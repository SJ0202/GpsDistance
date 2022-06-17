package com.example.gpsdistance.presentation.gps_distance

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GpsDistanceViewModel @Inject constructor(

):ViewModel() {

    private val _textState = mutableStateOf("뷰모델 테스트")
    val textState: State<String> = _textState

}