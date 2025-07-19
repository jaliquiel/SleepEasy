package com.example.sleepeasy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sleepeasy.ui.theme.SleepEasyTheme

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
    Text(
        text = "Hello!",
    )
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SleepEasyTheme {
//        SleepEasyEntryPoint("Android")
//    }
//}