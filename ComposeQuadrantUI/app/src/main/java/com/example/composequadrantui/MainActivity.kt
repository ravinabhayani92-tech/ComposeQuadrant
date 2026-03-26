package com.example.composequadrantui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrantui.ui.theme.ComposeQuadrantUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(){
    Box{
        Column(modifier = Modifier.fillMaxSize()){
            Row(Modifier.weight(1f)) {
                ComposeQuadrantInfoCard(
                    title = stringResource(R.string.first_title),
                    description = stringResource(R.string.first_description),
                    backgroundColor = colorResource(R.color.quadrant1),
                    modifier = Modifier.weight(1f)
                )
                ComposeQuadrantInfoCard(
                    title = stringResource(R.string.second_title),
                    description = stringResource(R.string.second_description),
                    backgroundColor = colorResource(R.color.quadrant2),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                ComposeQuadrantInfoCard(
                    title = stringResource(R.string.third_title),
                    description = stringResource(R.string.third_description),
                    backgroundColor = colorResource(R.color.quadrant3),
                    modifier = Modifier.weight(1f)
                )
                ComposeQuadrantInfoCard(
                    title = stringResource(R.string.fourth_title),
                    description = stringResource(R.string.fourth_description),
                    backgroundColor = colorResource(R.color.quadrant4),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun ComposeQuadrantInfoCard(
    title : String,
    description : String,
    backgroundColor : Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier
        .fillMaxSize()
        .background(backgroundColor)
        .padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            modifier = Modifier.padding(16.dp),
            fontWeight = Bold,
            text = title
        )
        Text(
            text = description,
            textAlign = Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantUITheme {
        ComposeQuadrant()
    }
}