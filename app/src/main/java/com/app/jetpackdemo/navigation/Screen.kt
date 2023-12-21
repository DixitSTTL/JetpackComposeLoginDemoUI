package com.muratozturk.conversai.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login_screen")
    object Register : Screen("register_screen")
    object Forgot_pass : Screen("forgot_pass_screen")
    object OTP : Screen("otp_screen")

}