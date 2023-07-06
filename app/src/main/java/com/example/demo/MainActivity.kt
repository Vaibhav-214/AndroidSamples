package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Greeting(name = "Android")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, parameterFun: () -> Unit) {

    Column (
    ){
        Box (){
            Text(
                modifier = Modifier.clickable { parameterFun()  },
                text = "Hello $name!",
                fontSize = 40.sp,
                color = Color.Red
            )

            Button(
                onClick = { /*TODO*/ }) {
                Text(text = "Button")
            }

            TextField(value = "Edit me ", onValueChange = {})
        }

        Row() {
            Text(
                modifier = Modifier.clickable { parameterFun()  },
                text = "Hello $name!",
                fontSize = 40.sp,
                color = Color.Red
            )

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button")
            }

            TextField(value = "Edit me ", onValueChange = {})
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoxExample() {

    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Text(

            modifier = Modifier.clickable {  },
            text = "Hello Vaibhav!",
            fontSize = 40.sp,
            color = Color.Red
        )

        Image(
            modifier = Modifier.align(Alignment.Center),
            painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
            contentDescription = null)

        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { /*TODO*/ }) {
            Text(text = "Button")
        }

        TextField(
            modifier = Modifier.align(Alignment.BottomCenter),
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Green),
            value = "Edit me ",
            onValueChange = {},
            //  modifier = Modifier.background(color = Color.Green)
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
//    Greeting(
//        name = "Vaibhav") {
//        myFun(name = "Vaibhav", age = 22)
//    }
    BoxExample()
}

fun myFun(name: String, age: Int) {
    println("My name is $name and my age is $age")
}


