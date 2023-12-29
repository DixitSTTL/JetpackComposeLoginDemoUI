package com.app.jetpackdemo.ui.activity

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyFoodOrange

@Composable
fun SelectorScreen(
    navigateToLogin1: () -> Unit,
    navigateToLogin2: () -> Unit,
    navigateToLogin3: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center
    ) {


        Text(
            text = "Login",
            color = Color.White,
            fontWeight = FontWeight(600),
            fontSize = 20.sp,

            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(50))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFF97794),
                            Color(0xFF623AA2)
                        )
                    )
                )
                .clickable(onClick = navigateToLogin1)
                .padding(vertical = 30.dp),
            textAlign = TextAlign.Center
        )


        Spacer(modifier = Modifier.height(26.dp))

        Button(
            shape = RoundedCornerShape(size = 6.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MyBlack),
            onClick = navigateToLogin2,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            content = {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                    fontWeight = FontWeight(600)
                )
            })


        Spacer(modifier = Modifier.height(26.dp))

        Button(
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = MyFoodOrange),
            onClick = navigateToLogin3,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            content = {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                    fontWeight = FontWeight(600)
                )
            })


    }


}

