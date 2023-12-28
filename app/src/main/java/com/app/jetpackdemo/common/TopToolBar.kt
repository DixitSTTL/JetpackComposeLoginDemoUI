package com.app.jetpackdemo.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R

@Preview
@Composable
fun TopToolBar(title: String = "title", subTitle: String = "sub title") {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp)) {
            Column {
                Spacer(modifier = Modifier.height(26.dp))

                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "",
                    modifier = Modifier
                        .background(color = Color.White, RoundedCornerShape(20))
                        .padding(5.dp)
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight(700),
                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
                )
                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = subTitle,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
                )
                Spacer(modifier = Modifier.height(26.dp))

            }
        }
    }
}