package com.app.jetpackdemo.ui.login_register3.enter_otp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.common.TopToolBar
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyFoodOrange
import com.app.jetpackdemo.ui.theme.MyGray

@Composable
fun OtpScreen3(navigateBack: () -> Unit) {

    var otpValue by remember { mutableStateOf("") }

    Box() {
        Image(
            painter = painterResource(
                id = R.drawable.ic_ill4
            ), contentDescription = "", modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF191B2F), Color(0xFF191B2F), Color(0xFF202124)
                        )
                    )
                ), alignment = Alignment.TopEnd
        )

        Column {

            TopToolBar(
                navigateBack,
                "Verification",
                "Please type the code sent\nto email@gmail.com"
            )

            Card(
                modifier = Modifier.fillMaxSize(), colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ), shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                )
            ) {

                Column(
                    modifier = Modifier
                        .padding(horizontal = 26.dp)
                        .verticalScroll(
                            rememberScrollState()
                        )
                ) {

                    Spacer(modifier = Modifier.height(26.dp))

                    Text(
                        text = "Code",
                        color = MyBlack,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontWeight = FontWeight(600),
                        fontSize = 12.sp,
                        modifier = Modifier
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    BasicTextField(
                        value = otpValue,
                        onValueChange = { newValue ->

                            if (newValue.length <= 4) {
                                otpValue = newValue.filter { it.isDigit() }
                            }

                        },
                        keyboardOptions = KeyboardOptions(

                            keyboardType = KeyboardType.Number
                        ),
                        decorationBox = {
                            Row(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
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
                                                else 0.dp,
                                                if (isFocused) MyFoodOrange
                                                else Color.White,
                                                RoundedCornerShape(10)
                                            )
                                            .background(
                                                color = MyGray,
                                                shape = RoundedCornerShape(10)
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = char,
                                            color = Color.Black,
                                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                            fontWeight = FontWeight(700),
                                            fontSize = 24.sp,
                                            textAlign = TextAlign.Center
                                        )
                                    }
                                }
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(26.dp))

                    Button(
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(containerColor = MyFoodOrange),
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(horizontal = 30.dp),
                        content = {
                            Text(
                                text = "Resend Again",
                                color = Color.White,
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(600)
                            )
                        }
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                }
            }
        }
    }
}