package com.app.jetpackdemo.ui.login_register3.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jetpackdemo.R
import com.app.jetpackdemo.common.TopToolBar
import com.app.jetpackdemo.ui.theme.MyA0A5BA
import com.app.jetpackdemo.ui.theme.MyBlack
import com.app.jetpackdemo.ui.theme.MyD3D1D8
import com.app.jetpackdemo.ui.theme.MyFoodOrange
import com.app.jetpackdemo.ui.theme.MyGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen3(navigateBack: () -> Unit, navigateForgotPass: () -> Unit) {

    var mEmail by remember { mutableStateOf("") }
    var mPassword by remember { mutableStateOf("") }

    Box() {

        Image(
            painter = painterResource(
                id = R.drawable.ic_ill6
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

            TopToolBar(navigateBack, "Login", "Please sign in to your\nexisting account")

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

                    OutlinedTextField(
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
                                text = "**********",
                                color = MyA0A5BA,
                                fontFamily = FontFamily(
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
                            cursorColor = MyFoodOrange,
                            containerColor = MyGray,
                            focusedIndicatorColor = MyFoodOrange,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        visualTransformation = PasswordVisualTransformation(),
                        shape = RoundedCornerShape(10)

                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        onClick = navigateForgotPass,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                        content = {
                            Text(
                                text = "Forgot Password",
                                color = MyFoodOrange,
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(600),
                                modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
                            )
                        })

                    Spacer(modifier = Modifier.height(10.dp))

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

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Or login with",
                        color = MyD3D1D8,
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                        fontWeight = FontWeight(600),
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(horizontal = 4.dp, vertical = 2.dp),
                    )

                    Spacer(modifier = Modifier.height(26.dp))

                    Row {
                        Button(
                            elevation = ButtonDefaults.elevatedButtonElevation(
                                defaultElevation = 4.dp, hoveredElevation = 8.dp
                            ),
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            onClick = { },
                            content = {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_facebook),
                                    contentDescription = "",
                                    Modifier
                                        .background(
                                            color = Color(0xFF1877F2), shape = CircleShape
                                        )
                                        .size(35.dp)
                                        .padding(5.dp)
                                )
                                Text(
                                    text = "FACEBOOK",
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                    fontWeight = FontWeight(600),
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
                                )
                            },
                            modifier = Modifier.weight(1f)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Button(
                            modifier = Modifier.weight(1f),
                            elevation = ButtonDefaults.elevatedButtonElevation(
                                defaultElevation = 4.dp, hoveredElevation = 8.dp
                            ),
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            onClick = { },
                            content = {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_google),
                                    contentDescription = "",

                                    Modifier
                                        .clip(CircleShape)
                                        .size(35.dp)
                                        .padding(5.dp)
                                )
                                Text(
                                    text = "GOOGLE",
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                    fontWeight = FontWeight(600),
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
                                )
                            }
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                }
            }
        }
    }
}