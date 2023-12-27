package com.app.jetpackdemo.ui.login_register.forgot_pass

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.repeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.jetpackdemo.R
import com.app.jetpackdemo.common.EditInputType
import com.app.jetpackdemo.ui.theme.JetpackDemoTheme
import com.muratozturk.conversai.navigation.Screen

@Composable
fun ForgotScreen(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()) {

        Image(painter = painterResource(id = R.drawable.bg_top), contentDescription = "top")
        Image(
            painter = painterResource(id = R.drawable.bg_bottom),
            contentDescription = "bottom",
            modifier = Modifier.align(alignment = Alignment.BottomStart)
        )

        newBox(navController)

    }

}

@Composable
fun newBox(navController: NavHostController) {

    Box(
        modifier = Modifier
            .padding(30.dp, 100.dp)
            .fillMaxSize(),
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            )
            Text(
                text = "Forgot Password",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 32.sp,
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )

            editText("E-mail", R.drawable.ic_email, EditInputType.EMAIL)

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )

            Row(
                modifier = Modifier.align(alignment = Alignment.End),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Send OTP",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(10.dp, 0.dp, 0.dp, 0.dp)
                        .clickable {
                            navController.navigate(Screen.OTP.route)
                        }
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun editText(str: String, drawable: Int, editInputType: EditInputType) {
    var mText by remember { mutableStateOf("") }
    val color = remember { Animatable(Color.Black) }
    var isAnimated by remember { mutableStateOf(true) }

    // animate to green/red based on `button click`
    LaunchedEffect(isAnimated) {
        color.animateTo(if (isAnimated) Color.LightGray else Color.Red, animationSpec = infiniteRepeatable(
            tween(2000),RepeatMode.Reverse))
    }
    TextField(
        value = mText,
        onValueChange = {
            mText = it
        },
        leadingIcon = {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = ""
            )
        },
        label = {
            Text(
                text = str,
                color = color.value,
                fontWeight = FontWeight.Light,
                modifier = Modifier
                    .fillMaxWidth()

            )
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done,
            keyboardType =  when (editInputType) {
                EditInputType.EMAIL -> {
                    KeyboardType.Email
                }

                EditInputType.PASSWORD -> {
                    KeyboardType.Number
                }

                EditInputType.MOBILE -> {
                    KeyboardType.Phone
                }

                EditInputType.TEXT -> {
                    KeyboardType.Text
                }

                else -> {
                    KeyboardType.Text
                }
            }
        ),
        visualTransformation =when (editInputType) {
            EditInputType.PASSWORD -> {
                PasswordVisualTransformation()
            }

            else -> {
                VisualTransformation.None
            }
        },

        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black
        ),
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = 12.dp)
            .fillMaxWidth()
            .shadow(12.dp, shape = CircleShape)
            .clip(CircleShape)
            .background(color = colors.surface),
    )


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackDemoTheme {

    }
}

