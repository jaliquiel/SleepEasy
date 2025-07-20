package com.example.sleepeasy.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.sleepeasy.navigation.AppNavigationGraph
import com.example.sleepeasy.ui.theme.SleepEasyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SleepEasyTheme {
                SleepEasyEntryPoint()
            }
        }
    }
}

@Composable
fun SleepEasyEntryPoint() {
    AppNavigationGraph()
}
