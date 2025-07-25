package com.example.sleepeasy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sleepeasy.ui.viewmodel.SleepHubViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SleepHubScreen(
    sleepHubViewModel: SleepHubViewModel = hiltViewModel(),
    navigateToSleepForm: () -> Unit = { /* No-op by default */ }
) {
    Scaffold(
        modifier = Modifier.systemBarsPadding(),
        topBar = {
            TopAppBar(
                title = {
                    Text("SimpleSleep")
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                Text("Sleep Hub Screen")
                Button(onClick = navigateToSleepForm) {
                    Text("Record Sleep Data")
                }
                // TODO: add graph of sleep time

                // TODO: do exercise flow
                // TODO: do caffeine flow
                // TODO: do stress level flow
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