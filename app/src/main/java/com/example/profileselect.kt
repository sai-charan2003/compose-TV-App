package com.example

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.tv.foundation.lazy.grid.TvGridCells
import androidx.tv.foundation.lazy.grid.TvLazyHorizontalGrid
import androidx.tv.foundation.lazy.grid.TvLazyVerticalGrid
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.material3.Border
import androidx.tv.material3.ClickableSurfaceDefaults

import androidx.tv.material3.ExperimentalTvMaterial3Api

import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.example.aha.R
import com.example.navigation.Destination
import kotlinx.coroutines.delay

@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalAnimationApi::class)


@Composable
fun profileselect(navHostController: NavHostController) {
    var visible by remember { mutableStateOf(true) }
    var visible1 by remember { mutableStateOf(true) }
    var imageLoaded by remember { mutableStateOf(false) }
    TvLazyRow(
        //rows = TvGridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        item {



            Column(modifier = Modifier.padding(end = 20.dp)) {
                Surface(



                    onClick = {
                              navHostController.navigate(Destination.homescreen.route)

                    },
                    shape = ClickableSurfaceDefaults.shape(CircleShape),


                    scale = ClickableSurfaceDefaults.scale(),
                    border = ClickableSurfaceDefaults.border(
                        focusedBorder = Border(
                            BorderStroke(
                                1.dp,
                                Color(0xffff6b3a)
                            ), inset = 1.dp
                        ),
                    )


                ) {


                    Image(

                        painter = painterResource(id = R.drawable.black),
                        contentScale = ContentScale.Crop,


                        contentDescription = "Profile 1",

                        modifier = Modifier


                            .clip(CircleShape)
                            .height(80.dp)
                            .width(80.dp)
                            .border(1.dp, Color.Black, CircleShape)
                    )
                }
                Text(
                    text = "Sai Charan",
                    modifier = Modifier.padding(top = 10.dp),
                    textAlign = TextAlign.Center
                )
            }



            Column {
                Surface(
                    onClick = {
                        navHostController.navigate(Destination.homescreen.route)
                    },
                    shape = ClickableSurfaceDefaults.shape(CircleShape),


                    scale = ClickableSurfaceDefaults.scale(),
                    border = ClickableSurfaceDefaults.border(
                        focusedBorder = Border(
                            BorderStroke(
                                1.dp,
                                Color(0xffff6b3a)
                            ), inset = 1.dp
                        ),
                    )
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.blackpanther),
                        contentScale = ContentScale.Crop,

                        contentDescription = "Profile 1",

                        modifier = Modifier
                            .clip(CircleShape)
                            .height(80.dp)
                            .width(80.dp)
                            .border(1.dp, Color.Black, CircleShape)
                    )
                }
                Text(
                    text = "Sai Charan",
                    modifier = Modifier.padding(top = 10.dp),
                    textAlign = TextAlign.Center
                )


            }
        }
    }
}






