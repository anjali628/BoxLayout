package com.demo.boxlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.demo.boxlayout.ui.theme.BoxLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BoxLayout()
                }
            }
        }
    }
}

@Composable
fun BoxLayout(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow),
    contentAlignment = Alignment.Center){
        Text(text = "Hello World 1")
        Text(text = "Hello World 2", color = Color.Red,
        modifier = Modifier.align(Alignment.TopCenter))
        Button(onClick = { /*TODO*/ },
        modifier = Modifier.align(Alignment.CenterEnd)) {
            Text(text = "Button")
        }
        Text(text = "Hello World 3", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "Hello World 4", modifier = Modifier.align(Alignment.TopStart))

    }


}

