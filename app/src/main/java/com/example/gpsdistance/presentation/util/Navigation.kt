package com.example.gpsdistance.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gpsdistance.presentation.gps_distance.GpsDistanceScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.GpsDistanceScreen.route){
        composable(route = Screen.GpsDistanceScreen.route){ GpsDistanceScreen(navController = navController) }
    }
}