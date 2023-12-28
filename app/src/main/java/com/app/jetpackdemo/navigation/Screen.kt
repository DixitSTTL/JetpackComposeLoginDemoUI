package com.muratozturk.conversai.navigation

sealed class Screen(val route: String) {

    object Selector_screen : Screen("selector_screen")

    //Login1
    object Login : Screen("login_screen")
    object Register : Screen("register_screen")
    object Forgot_pass : Screen("forgot_pass_screen")
    object OTP : Screen("otp_screen")



    //Login2
    object Welcome : Screen("welcome_screen")
    object Login2 : Screen("login_screen2")
    object Register2 : Screen("register_screen2")


    //Login3
    object Welcome3 : Screen("welcome_screen3")
    object Login3 : Screen("login_screen3")
    object Register3 : Screen("register_screen3")


}