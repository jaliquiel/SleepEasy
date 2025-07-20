package com.example.sleepeasy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sleepeasy.screens.SleepFormScreen
import com.example.sleepeasy.screens.SleepHubScreen

@Composable
fun AppNavigationGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SleepHubScreenDestination
    ) {
        composable<SleepHubScreenDestination> {
            SleepHubScreen {
                navController.navigate(SleepFormScreenDestination)
            }
        }
        composable<SleepFormScreenDestination> {
            SleepFormScreen()
        }
    }
}
