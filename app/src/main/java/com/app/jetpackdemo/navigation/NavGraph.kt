package com.muratozturk.conversai.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.app.jetpackdemo.ui.activity.SelectorScreen
import com.app.jetpackdemo.ui.login_register.enter_otp.OTPScreen
import com.app.jetpackdemo.ui.login_register.forgot_pass.ForgotScreen
import com.app.jetpackdemo.ui.login_register.login.LoginScreen
import com.app.jetpackdemo.ui.login_register.login.LoginScreen2
import com.app.jetpackdemo.ui.login_register.register.RegisterScreen
import com.app.jetpackdemo.ui.login_register2.register.RegisterScreen2
import com.app.jetpackdemo.ui.login_register2.welcome.WelcomeScreen
import com.app.jetpackdemo.ui.login_register3.login.LoginScreen3
import com.app.jetpackdemo.ui.login_register3.register.RegisterScreen3
import com.app.jetpackdemo.ui.login_register3.welcome.WelcomeScreen3
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.muratozturk.conversai.common.Constants.TRANSITION_ANIMATION_DURATION


@OptIn(ExperimentalMaterialNavigationApi::class)
@ExperimentalAnimationApi
@Composable
fun NavGraph(
    navController: NavHostController
) {

    val paddingBottom = animateDpAsState(
        0.dp, animationSpec = tween(TRANSITION_ANIMATION_DURATION)
    )

    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.Selector_screen.route,
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .padding(bottom = paddingBottom.value)

    ) {

        composable(route = Screen.Selector_screen.route) {
            SelectorScreen(
                navigateToLogin1 = {
                    navController.navigate(Screen.Login.route)
                }, navigateToLogin2 = {
                    navController.navigate(Screen.Welcome.route)
                }, navigateToLogin3 = {
                    navController.navigate(Screen.Welcome3.route)
                }
            )
        }


        //Login 1
        composable(route = Screen.Login.route) {
            LoginScreen(navigateToRegister = {
                navController.navigate(Screen.Register.route)

            },
                navigateToForgotPass = {
                    navController.navigate(Screen.Forgot_pass.route)

                })
        }

        composable(route = Screen.Register.route) {
            RegisterScreen(navController)
        }

        composable(route = Screen.Forgot_pass.route) {
            ForgotScreen(navController)
        }

        composable(route = Screen.OTP.route) {
            OTPScreen()
        }


        //Login 2
        composable(route = Screen.Welcome.route) {

            WelcomeScreen(
                navigateToLogin = {
                    navController.navigate(Screen.Login2.route)

                },
                navigateToRegister = {
                    navController.navigate(Screen.Register2.route)

                })

        }

        composable(route = Screen.Login2.route) {
            LoginScreen2 {
                navController.popBackStack()

            }
        }

        composable(route = Screen.Register2.route) {
            RegisterScreen2 {
                navController.popBackStack()

            }
        }


        //Login 3
        composable(route = Screen.Welcome3.route) {

            WelcomeScreen3(
                navigateToLogin = {
                    navController.navigate(Screen.Login3.route)

                },
                navigateToRegister = {
                    navController.navigate(Screen.Register3.route)

                }
            )

        }

        composable(route = Screen.Login3.route) {
            LoginScreen3 (
//                navController.popBackStack()
            )
        }

        composable(route = Screen.Register3.route) {
            RegisterScreen3 (
//                navController.popBackStack()

            )
        }


    }

}
