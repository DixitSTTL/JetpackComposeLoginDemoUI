package com.app.jetpackdemo.ui.login_register.enter_otp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.jetpackdemo.R
import com.app.jetpackdemo.ui.theme.JetpackDemoTheme

@Composable
fun OTPScreen(navController: NavHostController) {


    Box(modifier = Modifier.fillMaxSize()) {

        Image(painter = painterResource(id = R.drawable.bg_top), contentDescription = "top")
        Image(
            painter = painterResource(id = R.drawable.bg_bottom),
            contentDescription = "bottom",
            modifier = Modifier.align(alignment = Alignment.BottomStart)
        )

        Box(
            modifier = Modifier
                .padding(30.dp, 100.dp)
                .fillMaxSize(),
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                )
                Text(
                    text = "Enter OTP",
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 32.sp,
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                var otpValue by remember { mutableStateOf("") }

                BasicTextField(
                    value = otpValue, onValueChange = { newValue ->

                        if (newValue.length <= 4) {
                            otpValue = newValue.filter { it.isDigit() }
                        }

                    },
                    keyboardOptions = KeyboardOptions(

                        keyboardType = KeyboardType.Number
                    ),

                    decorationBox = {
                        Row {
                            repeat(4) { index ->
                                val char = when {
                                    index >= otpValue.length -> ""
                                    else -> otpValue[index].toString()
                                }
                                val isFocused = otpValue.length == index
                                Box(
                                    modifier = Modifier
                                        .size(60.dp)
                                        .padding(2.dp)
                                        .border(
                                            if (isFocused) 2.dp
                                            else 0.dp, if (isFocused) Color.Black
                                            else Color.White, RoundedCornerShape(50)
                                        )
                                        .shadow(12.dp, shape = CircleShape)
                                        .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(50)
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = char,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Color.Black,
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                            }


                        }
                    }
                )

            }



            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )

            Row(
                modifier = Modifier.align(alignment = Alignment.CenterEnd),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Verify OTP",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.bg_gradient),
                        contentDescription = ""
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_right_arrow),
                        contentDescription = "",
                        modifier = Modifier.padding(16.dp, 6.dp)
                    )
                }
            }
        }

    }

}



//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackDemoTheme {

    }
}


