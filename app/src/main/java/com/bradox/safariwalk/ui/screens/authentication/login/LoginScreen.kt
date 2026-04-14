package com.bradox.safariwalk.ui.screens.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.bradox.safariwalk.R
import com.bradox.safariwalk.ui.components.LottieAnimationWidget
import com.bradox.safariwalk.ui.theme.greenColor
import com.bradox.safariwalk.ui.theme.primaryColor


@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    var emailInput by remember { mutableStateOf(TextFieldValue("") )}
    var passwordInput by remember { mutableStateOf(TextFieldValue("") )}
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        LottieAnimationWidget(R.raw.loading)
        
        Spacer(modifier = Modifier.height(16.dp))
//Welcome message
        Text(text = "Welcome Back!")

        // input email
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            label = { Text(text = "Email Address") },
            maxLines = 1,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Email"
                )
            },
          shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = primaryColor,
                focusedBorderColor = greenColor,
                unfocusedLabelColor = primaryColor,
                focusedLabelColor = greenColor,

            ),
            placeholder = {Text(text = "eg johndoe@example.com")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        
        Spacer(modifier = Modifier.height(8.dp))

        // input password
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(text = "Password") },
            maxLines = 1,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "Password"
                )
            },
            shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = primaryColor,
                focusedBorderColor = greenColor,
                unfocusedLabelColor = primaryColor,
                focusedLabelColor = greenColor,
            ),
            visualTransformation = PasswordVisualTransformation(),
            placeholder = { Text(text = "*******") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
    }
}
