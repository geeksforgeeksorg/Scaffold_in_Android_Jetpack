@file:OptIn(ExperimentalMaterial3Api::class)
package com.gfg.scaffold_android_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gfg.scaffold_android_jetpack.ui.theme.Scaffold_Android_JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold_Android_JetpackTheme {
                MyApp() // Only apply the theme here
            }
        }
    }
}

@Composable
fun MyApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Geeks fo Geeks") },
                modifier = Modifier.background(MaterialTheme.colorScheme.primary) // Modifier applied properly
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Your action */ }) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            // Main content with padding applied correctly
            Box(modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()) {
                Text("This is the Main Body of the Application", modifier = Modifier.align(Alignment.Center))
            }
        },
        bottomBar = {
            BottomAppBar {
                Text("Bottom Bar")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Scaffold_Android_JetpackTheme {
        MyApp()
    }
}
