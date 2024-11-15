package com.dsw.pam.thermohouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dsw.pam.thermohouse.ui.LoginScreen
import com.dsw.pam.thermohouse.ui.theme.ThermoHouseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThermoHouseTheme {
                // Zamiast "Hello Android!" ustawiamy `LoginScreen`
                LoginScreen()
            }
        }
    }
}
