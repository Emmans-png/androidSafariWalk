package com.bradox.safariwalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.bradox.safariwalk.ui.screens.authentication.forgotpassword.ForgotPasswordScreen
import com.bradox.safariwalk.ui.screens.onboarding.OnboardingScreen
import com.bradox.safariwalk.ui.theme.SafariWalkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SafariWalkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    OnboardingScreen()
                }
            }
        }
    }
}