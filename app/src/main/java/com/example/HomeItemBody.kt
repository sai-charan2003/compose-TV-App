package co.joebirch.composetv

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.TvItem

@Composable
fun HomeItemBody(item: TvItem) {
    Box(
        modifier = Modifier
            .fillMaxSize()

            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Black.copy(alpha = 0.3f),
                        Color.Transparent
                    )
                )
            ),
    ) {
        Column(
            modifier = Modifier

                .padding(16.dp)
                .width(500.dp)

                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {
            Text(
                text = item.title, fontSize = 32.sp, color = Color.White
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = item.description,
                fontSize = 16.sp,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                color = Color.White
            )

        }
    }
}