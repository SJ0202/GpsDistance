package com.example.gpsdistance.presentation.util

sealed class Screen(val route:String){

    object GpsDistanceScreen: Screen("gps_distance_screen")

}
