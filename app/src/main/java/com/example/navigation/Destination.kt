package com.example.navigation

sealed class Destination(val route:String){
    object profile :Destination("profile")
    object homescreen : Destination("homescreen")
}
