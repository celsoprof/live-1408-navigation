package br.com.fiap.navigation14_08

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.navigation14_08.screens.AboutScreen
import br.com.fiap.navigation14_08.screens.HomeScreen
import br.com.fiap.navigation14_08.screens.LoginScreen
import br.com.fiap.navigation14_08.ui.theme.Navigation1408Theme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      Navigation1408Theme {
        
        val navController = rememberNavController()
        NavHost(
          navController = navController,
          startDestination = "login"
        ){
          composable(route = "login"){ LoginScreen(navController = navController) }
          composable(route = "home"){ HomeScreen(navController = navController) }
          composable(route = "about"){ AboutScreen(navController = navController) }
        }
        
      }
    }
  }
}



