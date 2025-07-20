package com.example.sleepeasy.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SleepHubScreen(
    navigateToSleepForm: () -> Unit = { /* No-op by default */ }
) {
    Column {
        Text("Sleep Hub Screen")
        Button(onClick = navigateToSleepForm) {
            Text("Go to Sleep Form")
        }
    }
}