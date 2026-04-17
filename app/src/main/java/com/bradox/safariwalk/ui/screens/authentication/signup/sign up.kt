package com.bradox.safariwalk.ui.screens.authentication.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.bradox.safariwalk.R
import com.bradox.safariwalk.ui.components.LottieAnimationWidget
import com.bradox.safariwalk.ui.theme.greenColor
import com.bradox.safariwalk.ui.theme.primaryColor

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    var retypePasswordInput by remember { mutableStateOf(TextFieldValue("")) }
    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LottieAnimationWidget(R.raw.loading)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Create Account")

        Spacer(modifier = Modifier.height(16.dp))

        // email section
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
            placeholder = { Text(text = "eg johndoe@example.com") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(8.dp))


        // password section
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(text = "Password") },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.pass),
                    contentDescription = "Password",
                    tint = greenColor,
                )
            },
            trailingIcon = {
                IconButton(
                    onClick = { isVisible = !isVisible }
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_visibility_24),
                        contentDescription = "Password",
                        tint = greenColor,
                    )

                }
            },
            visualTransformation = if (isVisible) VisualTransformation.None else PasswordVisualTransformation(),
            placeholder = { Text(text = "*******") },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = primaryColor,
                focusedBorderColor = greenColor,
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        // retype password
        OutlinedTextField(
            value = retypePasswordInput,
            onValueChange = { retypePasswordInput = it },
            label = { Text(text = "Retype Password") },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.pass),
                    contentDescription = "Password",
                    tint = greenColor,
                )
            },
            trailingIcon = {
                IconButton(
                    onClick = { isVisible = !isVisible }
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_visibility_24),
                        contentDescription = "Password",
                        tint = greenColor,
                    )

                }
            },
            visualTransformation = if (isVisible) VisualTransformation.None else PasswordVisualTransformation(),
            placeholder = { Text(text = "*******") },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = primaryColor,
                focusedBorderColor = greenColor,
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = greenColor)
        ) {
            Text(text = "Sign Up")
        }
    }
}
