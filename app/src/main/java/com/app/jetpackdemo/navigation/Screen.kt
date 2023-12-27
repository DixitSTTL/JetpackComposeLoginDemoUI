package com.muratozturk.conversai.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen("welcome_screen")
    object Login : Screen("login_screen")
    object Login2 : Screen("login_screen2")
    object Register : Screen("register_screen")
    object Register2 : Screen("register_screen2")
    object Forgot_pass : Screen("forgot_pass_screen")
    object OTP : Screen("otp_screen")

}