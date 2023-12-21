package com.muratozturk.conversai.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.app.jetpackdemo.ui.login_register.enter_otp.OTPScreen
import com.app.jetpackdemo.ui.login_register.forgot_pass.ForgotScreen
import com.app.jetpackdemo.ui.login_register.login.LoginScreen
import com.app.jetpackdemo.ui.login_register.register.RegisterScreen
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

    val paddingBottom =
        animateDpAsState(
            0.dp,
            animationSpec = tween(TRANSITION_ANIMATION_DURATION)
        )

    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.Login.route,
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .padding(bottom = paddingBottom.value)

    ) {


        composable(route = Screen.Login.route) {
            LoginScreen(navController)
        }

        composable(route = Screen.Register.route) {
            val screenResult = navController.currentBackStackEntry?.savedStateHandle
            RegisterScreen(navController)
        }

        composable(route = Screen.Forgot_pass.route) {
            val screenResult = navController.currentBackStackEntry?.savedStateHandle
            ForgotScreen(navController)
        }

        composable(route = Screen.OTP.route) {
            val screenResult = navController.currentBackStackEntry?.savedStateHandle
            OTPScreen(navController)
        }


    }

}
