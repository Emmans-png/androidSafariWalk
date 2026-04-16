package com.bradox.safariwalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.bradox.safariwalk.ui.screens.authentication.login.LoginScreen
import com.bradox.safariwalk.ui.screens.authentication.signup.SignupScreen
import com.bradox.safariwalk.ui.theme.SafariWalkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SafariWalkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SignupScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}