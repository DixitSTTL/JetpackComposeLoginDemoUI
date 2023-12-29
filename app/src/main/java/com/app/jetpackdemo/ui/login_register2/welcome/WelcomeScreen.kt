package com.app.jetpackdemo.ui.login_register2.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyGreen

@Composable
fun WelcomeScreen(
    navigateToLogin: () -> Unit, navigateToRegister: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MyGreen)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_ill), contentDescription = ""

        )

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier.padding(horizontal = 46.dp),
        ) {

            Text(
                text = "We are here",
                color = MyBlack,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                fontWeight = FontWeight(600),
                fontSize = 22.sp

            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Your search is over here. We provide great figma designs to use in your project.",
                color = MyBlack,
                fontFamily = FontFamily(Font(R.font.montserrat_light)),
                fontWeight = FontWeight(400),

                )

            Spacer(modifier = Modifier.height(36.dp))

            Row(
                modifier = Modifier.border(
                    width = 2.dp, color = MyBlack, shape = RoundedCornerShape(size = 6.dp)
                )
            ) {

                Button(
                    shape = RoundedCornerShape(size = 6.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MyBlack),
                    modifier = Modifier
                        .weight(1f)
                        .background(color = MyBlack, shape = RoundedCornerShape(size = 6.dp)),
                    onClick = navigateToLogin
                ) {
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                        fontWeight = FontWeight(600)
                    )
                }
                Button(
                    shape = RoundedCornerShape(size = 6.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    modifier = Modifier
                        .weight(1f)
                        .background(
                            color = Color.Transparent, shape = RoundedCornerShape(size = 6.dp)
                        ),
                    onClick = navigateToRegister
                ) {
                    Text(
                        text = "SignUp",
                        color = MyBlack,
                        fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                        fontWeight = FontWeight(600)
                    )
                }
            }

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "App Version 1.0.0",
                color = MyBlack,
                fontSize = 10.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                fontWeight = FontWeight(400),
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
        }

    }

}