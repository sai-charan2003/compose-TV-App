package com.example

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column



import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ModalDrawer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.material3.Border
import androidx.tv.material3.Button
import androidx.tv.material3.Carousel
import androidx.tv.material3.CarouselDefaults

import androidx.tv.material3.ExperimentalTvMaterial3Api

import androidx.tv.material3.CarouselState
import androidx.tv.material3.ClickableSurfaceDefaults
import androidx.tv.material3.Icon
import androidx.tv.material3.ModalNavigationDrawer
import androidx.tv.material3.NavigationDrawer
import androidx.tv.material3.NavigationDrawerItem
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import co.joebirch.composetv.HomeItemBody
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter

import com.example.DataFactory.makeCarouselItem
import com.example.aha.R

@Composable
@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalAnimationApi::class)
fun homescreen() {
    
    var selectedIndex by remember { mutableIntStateOf(0) }

    val items1 = listOf(
        "Home" to Icons.Default.Home,
        "Settings" to Icons.Default.Settings,
        "Favourites" to Icons.Default.Favorite,
    )
    NavigationDrawer(
        drawerContent = {
            Column(
                Modifier

                    .fillMaxHeight()
                    .padding(12.dp)
                    .selectableGroup(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items1.forEachIndexed { index, item ->
                    val (text, icon) = item

                    NavigationDrawerItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        leadingContent = {
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                            )
                        }
                    ) {
                        Text(text)
                    }
                }
            }
        },

        )
    {
        if(selectedIndex==0){
            list()
            
        }
        else if(selectedIndex==1){
            Text(text = "Settings")
        }



    }
}
@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalAnimationApi::class)
@Composable
fun list() {
    val items = makeCarouselItem()
    val state = remember {
        CarouselState()
    }
    Carousel(
        itemCount = items.size,

        carouselState = state,
        modifier = Modifier
            .fillMaxSize()


            .height(400.dp)
            .padding(40.dp),

        contentTransformEndToStart =
        fadeIn(tween(1000)).togetherWith(fadeOut(tween(1000))),
        contentTransformStartToEnd =
        fadeIn(tween(1000)).togetherWith(fadeOut(tween(1000)))
    ) { itemIndex ->







                    Box()
                    {

                        AsyncImage(

                            model = items[itemIndex].image,

                            contentDescription = "Movie poster",
                            modifier = Modifier


                                .animateEnterExit(
                                    enter = slideInHorizontally(animationSpec = tween(1000)) { it / 2 },
                                    exit = slideOutHorizontally(animationSpec = tween(1000))
                                )
                        )
                        HomeItemBody(item = items[itemIndex],)


                    }

                }
            }




@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun listofmovies(){
    val items = makeCarouselItem()
    TvLazyRow(){
        items(items.size){

                Column {
                    Text(text = "HI")


            }
        }
    }


}
