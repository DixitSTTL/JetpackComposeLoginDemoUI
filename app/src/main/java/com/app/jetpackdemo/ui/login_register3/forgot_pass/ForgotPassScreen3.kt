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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.common.TopToolBar
import com.app.jetpackdemo.ui.theme.MyA0A5BA
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyFoodOrange
import com.app.jetpackdemo.ui.theme.MyGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPassScreen3(navigateBack: () -> Unit, navigateVerify: () -> Unit) {

    var mEmail by remember { mutableStateOf("") }

    Box() {

        Image(
            painter = painterResource(
                id = R.drawable.ic_ill3
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

            TopToolBar(navigateBack, "Forgot Password", "Please enter your existing\nemail address")

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
                        text = "Email",
                        color = MyBlack,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontWeight = FontWeight(600),
                        fontSize = 12.sp,
                        modifier = Modifier
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    OutlinedTextField(
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
                            cursorColor = MyFoodOrange,
                            containerColor = MyGray,
                            focusedIndicatorColor = MyFoodOrange,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        shape = RoundedCornerShape(10)

                    )

                    Spacer(modifier = Modifier.height(26.dp))

                    Button(shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(containerColor = MyFoodOrange),
                        onClick = navigateVerify,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(horizontal = 30.dp),
                        content = {
                            Text(
                                text = "Send Code",
                                color = Color.White,
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(600)
                            )
                        })

                    Spacer(modifier = Modifier.height(20.dp))

                }
            }
        }
    }
}