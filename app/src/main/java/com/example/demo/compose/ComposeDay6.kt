package com.example.demo.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.AssistChip
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.R


@Composable
fun LazyRowExample() {

    val list = listOf("Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika")
    LazyRow (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
                contentDescription = null
            )
        }

        items(list) {stringObject ->
           Box (
               modifier = Modifier
                   .width(100.dp)
                   .height(50.dp)
                   .clip(RoundedCornerShape(15.dp))
                   .background(color = Color.Green),
               contentAlignment = Alignment.Center
           ){
               Text(
                   text = stringObject,
                   color = Color.Red,
                   fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                   )
           }
        }
    }
}

@Composable
fun LazyColumnComposable() {

    val list = listOf("Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika")

    LazyColumn (
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.spacedBy(90.dp)
    ){
        item {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                painter = painterResource(id = R.drawable.qle6lc1g_kabosu_the_shiba_inu_dog_625x300_29_december_22),
                contentDescription = null
            )
        }

        items(list) {stringObject ->
            Box (
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.Green),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringObject,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}


@Composable
fun LazyHorizontalGridExample() {
    val list = listOf("Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika","Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika", "Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika","Vaibhav", "VIrender","Vinayak",)

    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
        items(list) {stringObject ->
            Box (
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.Green),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringObject,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}


@Composable
fun LazyVerticalGridExample() {
    val list = listOf("Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika","Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika", "Vaibhav", "VIrender","Vinayak","Vivek", "Vedika", "Vanshika","Vaibhav", "VIrender","Vinayak",)

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        verticalArrangement = Arrangement.spacedBy(60.dp)
    ) {
        items(list) {stringObject ->
            Box (
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.Green),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringObject,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    Scaffold (
        topBar = {
            TopAppBar(title = { Text(text = "Main Screen")}, colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Yellow))
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = null)
            }
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Icon(modifier = Modifier.size(40.dp),imageVector = Icons.Filled.AccountBox, contentDescription = null, tint = Color.Magenta)
                    Icon(modifier = Modifier.size(40.dp),imageVector = Icons.Filled.Build, contentDescription = null, tint = Color.Magenta)
                    Icon(modifier = Modifier.size(40.dp),imageVector = Icons.Filled.Delete, contentDescription = null, tint = Color.Magenta)
                    Icon(modifier = Modifier.size(40.dp),imageVector = Icons.Filled.Home, contentDescription = null, tint = Color.Magenta)
                    Icon(modifier = Modifier.size(40.dp),imageVector = Icons.Filled.Phone, contentDescription = null, tint = Color.Magenta)
                }
            }
        }

    ) {scaffoldDefaulPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(scaffoldDefaulPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Spacer(modifier = Modifier.height(90.dp))
            Text(text = "I m inside scaffold body")
            Spacer(modifier = Modifier.height(40.dp))

            SurfaceExample()


        }

    }
}

@Composable
fun SurfaceExample() {
    Surface (
        border = BorderStroke(width = 2.dp, color = Color.Yellow),
        shadowElevation = 100.dp,
        //tonalElevation = 100.dp,
        modifier = Modifier
            .height(50.dp)
            .width(60.dp)
    ) {
        Box (
            contentAlignment = Alignment.Center
        ){
            Text(text = "Vaibhav", color = Color.Black)

        }
    }
}



@Preview(showSystemUi = false, showBackground = true)
@Composable
fun LazyLayoutsExamplesPreview() {
    //LazyRowExample()
   // LazyColumnComposable()
    //LazyHorizontalGridExample()
    //LazyVerticalGridExample()
   // ScaffoldExample()
    SurfaceExample()
}
