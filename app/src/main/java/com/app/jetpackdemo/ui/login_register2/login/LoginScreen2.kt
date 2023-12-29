package com.app.jetpackdemo.ui.login_register.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyPink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen2(navigateBack: () -> Unit) {

    var mEmailText by remember { mutableStateOf("") }
    var mPassText by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MyPink)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())

        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier
                    .padding(10.dp, 30.dp)
                    .fillMaxWidth()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_close),
                    contentDescription = "bottom",
                    alignment = Alignment.TopEnd,
                    modifier = Modifier.clickable(onClick = navigateBack)

                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_ill2), contentDescription = "bottom"
            )
            Column(
                modifier = Modifier
                    .padding(20.dp, 20.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    text = "Welcome",
                    fontSize = 50.sp,
                    color = Color(0xFFDCC2CA),
                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                    fontWeight = FontWeight(600)
                )
                Text(
                    text = "Back!",
                    fontSize = 50.sp,
                    color = Color(0xFFDCC2CA),
                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                    fontWeight = FontWeight(600)
                )

                Spacer(modifier = Modifier.height(16.dp))

                TextField(
                    textStyle = TextStyle(
                        fontSize = 22.sp, fontFamily = FontFamily(Font(R.font.montserrat_medium))
                    ),
                    value = mEmailText, onValueChange = {
                        mEmailText = it
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_email2),
                            contentDescription = ""
                        )
                    },
                    label = {
                        Text(
                            text = "Email",
                            color = MyBlack,
                            fontWeight = FontWeight.Light,
                            fontFamily = FontFamily(Font(R.font.montserrat_light)),
                        )
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done, keyboardType = KeyboardType.Email
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = MyBlack,
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = MyBlack,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                )


                TextField(
                    textStyle = TextStyle(
                        fontSize = 22.sp, fontFamily = FontFamily(Font(R.font.montserrat_medium))
                    ),
                    value = mPassText,
                    onValueChange = {
                        mPassText = it
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_lock2),
                            contentDescription = ""
                        )
                    },
                    label = {
                        Text(
                            text = "Password",
                            color = MyBlack,
                            fontWeight = FontWeight.Light,
                            fontFamily = FontFamily(Font(R.font.montserrat_light)),
                        )
                    },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done, keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = MyBlack,
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = MyBlack,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(30.dp))

                Button(
                    shape = RoundedCornerShape(size = 6.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MyBlack),
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    content = {
                        Text(
                            text = "Login",
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                            fontWeight = FontWeight(600)
                        )
                    })
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Forgot Password?",
                    color = MyBlack,
                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                    fontWeight = FontWeight(600),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center

                )

            }

        }

    }

}




