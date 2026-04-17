package com.bradox.safariwalk.ui.screens.onboarding

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    AsyncImage(
        model = "https://images.pexels.com/photos/17875617/pexels-photo-17875617.jpeg",
        contentDescription = "Safari Walk Image",
        modifier = modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}
