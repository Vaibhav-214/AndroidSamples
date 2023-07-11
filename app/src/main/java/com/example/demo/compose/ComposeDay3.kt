package com.example.demo.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demo.ui.theme.DeepBlue

@Composable
fun MeditationUI() {
    Column (
        modifier = Modifier.background(color = DeepBlue).padding(16.dp)
    ){
        Section1()
        Section2()
        Spacer(modifier = Modifier.height(10.dp))
        Section3()
        Spacer(modifier = Modifier.height(20.dp))
        Section4()
        Spacer(modifier = Modifier.height(20.dp))
        Section5()
    }
}



@Preview(showBackground = false, showSystemUi = true)
@Composable
fun MeditationUIPreview() {
    MeditationUI()
}