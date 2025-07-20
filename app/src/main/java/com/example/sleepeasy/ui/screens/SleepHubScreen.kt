package com.example.sleepeasy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sleepeasy.ui.viewmodel.SleepHubViewModel

@Composable
fun SleepHubScreen(
    sleepHubViewModel: SleepHubViewModel = hiltViewModel(),
    navigateToSleepForm: () -> Unit = { /* No-op by default */ }
) {
    Scaffold(
        modifier = Modifier.systemBarsPadding(),
        content = { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                Text("Sleep Hub Screen")
                Button(onClick = navigateToSleepForm) {
                    Text("Input Sleep Data")
                }
            }
        }
    )
}

@Preview
@Composable
fun SleepHubScreenPreview() {
    SleepHubScreen(
        navigateToSleepForm = { /* No-op for preview */ }
    )
}