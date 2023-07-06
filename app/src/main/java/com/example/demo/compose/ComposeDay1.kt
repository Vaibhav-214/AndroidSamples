package com.example.demo.compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextView() {
//    Text(
//        modifier = Modifier.width(300.dp).height(250.dp).background(color = Color.Green),
//        color = Color.Red,
//        fontSize = 20.sp,
//        fontWeight = FontWeight.W500,
//        text = "Hello Android Developers")

//    var text  by remember {
//        mutableStateOf("Default String")
//    }
////
//    TextField(
//        modifier = Modifier
//            .width(300.dp)
//            .height(250.dp)
//            .background(color = Color.Green),
//        value = text,
//        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Green),
//        onValueChange = {typedValue ->
//        text = typedValue
//    })
//
//    Button(
//        modifier = Modifier
//            .width(300.dp)
//            .height(250.dp)
//            .background(color = Color.Green),
//        onClick = { /*TODO*/ },
//        colors = ButtonDefaults.textButtonColors(containerColor = Color.Red, contentColor = Color.White)
//        ) {
//        Text(text = "Button")
//    }
//
//    Image(
//        painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
//        contentDescription = null
//    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColumnExample() {
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        var text  by remember {
        mutableStateOf("Default String")
    }
//
    TextField(
        value = text,
        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Green),
        onValueChange = {typedValue ->
        text = typedValue
    })

    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.textButtonColors(containerColor = Color.Red, contentColor = Color.White)
        ) {
        Text(text = "Button")
    }

    Image(
        painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
        contentDescription = null
    )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowExample() {
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
       verticalAlignment = Alignment.Bottom
    ) {

        //content of Row starts here

        var text  by remember {
            mutableStateOf("Default String")
        }

        Image(
            modifier = Modifier.size(40.dp),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
            contentDescription = null
        )
//
        TextField(
            modifier = Modifier.width(200.dp),
            value = text,
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Green),
            onValueChange = {typedValue ->
                text = typedValue
            })

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(containerColor = Color.Red, contentColor = Color.White)
        ) {
            Text(text = "Button")
        }



        //content of Row ends here

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoxExample() {
    Box (
        modifier = Modifier.fillMaxSize().background(color = Color.Cyan)
    ) {

        var text  by remember {
            mutableStateOf("Default String")
        }

        Image(
            modifier = Modifier.size(200.dp).align(Alignment.TopEnd),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
            contentDescription = null
        )
//
        TextField(
            modifier = Modifier.width(200.dp).align(Alignment.CenterStart),
            value = text,
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Green),
            onValueChange = {typedValue ->
                text = typedValue
            })

        Button(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(containerColor = Color.Red, contentColor = Color.White)
        ) {
            Text(text = "Button")
        }

    }
}


@Preview(showBackground = false, showSystemUi = true)
@Composable
fun TextViewPreview() {
//    ColumnExample()
    //RowExample()
    BoxExample()
}