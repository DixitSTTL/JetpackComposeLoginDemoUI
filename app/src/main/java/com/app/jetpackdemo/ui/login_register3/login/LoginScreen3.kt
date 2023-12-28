package com.app.jetpackdemo.ui.login_register3.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.common.EditInputType
import com.app.jetpackdemo.common.TopToolBar
import com.app.jetpackdemo.ui.theme.MyA0A5BA
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyFoodOrange
import com.app.jetpackdemo.ui.theme.MyGray

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginScreen3() {
    var mEmail by remember { mutableStateOf("") }
    var mPassword by remember { mutableStateOf("") }
    Box() {
        Image(
            painter = painterResource(
                id = R.drawable.ic_ill3
            ), contentDescription = "", modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF191B2F), Color(0xFF202124)
                        )
                    )
                )
        )

        Column {

            TopToolBar("Login", "Please sign in to your existing account")

            Card(
                modifier = Modifier.fillMaxSize(), colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ), shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                )
            ) {
                Column(modifier = Modifier.padding(horizontal = 26.dp)) {

                    Spacer(modifier = Modifier.height(26.dp))

                    Text(
                        text = "Email",
                        color = MyBlack,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontWeight = FontWeight(600),
                        fontSize = 12.sp,
                        modifier = Modifier
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    TextField(
                        textStyle = TextStyle(
                            fontFamily = FontFamily(
                                Font(R.font.poppins_light)
                            )
                        ),
                        value = mEmail,
                        placeholder = {
                            Text(
                                text = "example@gmail.com",
                                color = MyA0A5BA,
                                fontFamily = FontFamily(
                                    Font(R.font.poppins_light)
                                )
                            )
                        },
                        onValueChange = {
                            mEmail = it
                        },
                        keyboardOptions = KeyboardOptions.Default.copy(
                            imeAction = ImeAction.Done, keyboardType = KeyboardType.Email
                        ),
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyGray,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        shape = RoundedCornerShape(10)

                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Password",
                        color = MyBlack,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontWeight = FontWeight(600),
                        fontSize = 12.sp,
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(6.dp))

                    TextField(
                        textStyle = TextStyle(
                            fontFamily = FontFamily(
                                Font(R.font.poppins_light)
                            )
                        ),
                        trailingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.ic_lock),
                                contentDescription = ""
                            )
                        },
                        value = mPassword,
                        placeholder = {
                            Text(
                                text = "**********", color = MyA0A5BA, fontFamily = FontFamily(
                                    Font(R.font.poppins_light)
                                )
                            )
                        },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions.Default.copy(
                            imeAction = ImeAction.Done, keyboardType = KeyboardType.Number
                        ),
                        onValueChange = {
                            mPassword = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyGray,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        visualTransformation = PasswordVisualTransformation(),
                        shape = RoundedCornerShape(10)

                    )
                    Spacer(modifier = Modifier.height(26.dp))

                    Button(shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(containerColor = MyFoodOrange),
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(horizontal = 30.dp),
                        content = {
                            Text(
                                text = "Login",
                                color = Color.White,
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(600)
                            )
                        })
                }

            }
        }
    }
}