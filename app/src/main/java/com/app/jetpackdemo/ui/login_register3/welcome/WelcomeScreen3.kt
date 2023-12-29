package com.app.jetpackdemo.ui.login_register3.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyFoodGreen

@Composable
fun WelcomeScreen3(navigateToLogin: () -> Unit, navigateToRegister: () -> Unit) {

    Box(
        Modifier
            .fillMaxSize()
            .background(color = MyFoodGreen)
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_pattern), contentDescription = ""
        )

        Box(
            Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp)
        ) {

            Image(
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.ic_ill5),
                contentDescription = "",
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text = "Donut worry,\nbe happy and eat more donuts!",
                style = TextStyle(
                    fontSize = 36.sp,
                    lineHeight = 44.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                    fontWeight = FontWeight(700),
                    color = Color.White,
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)
            )

            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(20.dp)
            ) {
                Button(
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    modifier = Modifier
                        .weight(1f)
                        .background(
                            color = Color.Transparent, shape = RoundedCornerShape(size = 6.dp)
                        ),
                    onClick = navigateToRegister,
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color.White
                    )
                ) {
                    Text(
                        text = "SignUp",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                        fontWeight = FontWeight(600),
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(containerColor = MyBlack),
                    modifier = Modifier
                        .weight(1f),
                    onClick = navigateToLogin
                ) {
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                        fontWeight = FontWeight(600),
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                    )
                }
            }
        }
    }
}