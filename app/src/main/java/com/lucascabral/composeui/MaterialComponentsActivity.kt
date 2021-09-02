package com.lucascabral.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lucascabral.composeui.ui.theme.ComposeUiTheme

class MaterialComponentsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiTheme {
                LayoutsTest()
            }
        }
    }
}

@Composable
fun LayoutsTest() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "Material Components")
            })
        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable()
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi There!")
        Text(text = "Have a nice day!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeUiTheme {
        LayoutsTest()
    }
}