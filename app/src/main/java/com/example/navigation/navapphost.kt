package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.homescreen
import com.example.profileselect

@Composable

fun navapphost(navController: NavHostController){
    NavHost(navController=navController,startDestination=Destination.profile.route){
        composable(Destination.profile.route){
            profileselect(navController)
        }
        composable(Destination.homescreen.route){
            homescreen()
        }

    }

}