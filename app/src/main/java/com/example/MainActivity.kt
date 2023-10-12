package com.example.tvcomposeintroduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.example.homescreen
import com.example.navigation.navapphost
import com.example.profileselect
import com.example.tvcomposeintroduction.ui.theme.TvComposeIntroductionTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val isdark:Boolean= isSystemInDarkTheme()

            TvComposeIntroductionTheme(useDarkTheme = true) {
                Surface(
                    shape = RectangleShape,
                    modifier = Modifier.fillMaxSize(),

                ) {
                    val navController= rememberNavController()
                    navapphost(navController = navController)

                }
            }
        }
    }
}