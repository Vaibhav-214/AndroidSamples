package com.example.demo.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.R
import com.example.demo.ui.theme.BlueViolet1
import com.example.demo.ui.theme.ButtonBlue
import com.example.demo.ui.theme.LightGreen2
import com.example.demo.ui.theme.LightRed

@Composable
fun Section1() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column {

            Text(
                text = "Good Evening, Vaibhav",
                fontSize = 20.sp,
                )
            Text(text = "We wish you a good day!")

        }

        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_search), contentDescription = null)
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Section2() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        AssistChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Sound Sleep") }
        )

        AssistChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Insomnia") }
        )

        AssistChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Depression") }
        )
    }
}

@Composable
fun Section3() {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(15.dp))
            .background(color = LightRed)
            .padding(10.dp),

        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column {

            Text(
                text = "Daily Thought",
                fontSize = 20.sp,
            )
            Text(text = "Meditation 3-10 min")

        }

//        IconButton(
//            modifier = Modifier.size(40.dp).clip(shape = CircleShape).background(color = ButtonBlue),
//            onClick = { /*TODO*/ }) {
//            Icon(
//                imageVector = ImageVector.vectorResource(id = R.drawable.ic_play),
//                contentDescription = null,
//                tint = Color.White
//            )
//        }

        Box (
            modifier = Modifier
                .size(40.dp)
                .clip(shape = CircleShape)
                .background(color = ButtonBlue),
            contentAlignment = Alignment.Center
        ){
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_play),
                contentDescription = null,
                tint = Color.White
            )
        }
    }

}

@Composable
fun Section4() {
    Text(text = "Featured", fontSize = 20.sp, color = Color.White)
}

@Composable
fun Section5Child(
    text: String,
    iconId: Int,
    backGroundColor: Color
) {
    Box (
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color = backGroundColor)
            .padding(20.dp)


    ){
        Text(
            text = text, fontSize = 20.sp,
            modifier = Modifier.align(Alignment.TopStart)
            )

        Icon(
            modifier = Modifier
                .size(40.dp)
                .align(Alignment.BottomStart),
            imageVector = ImageVector.vectorResource(id = iconId),
            contentDescription = null,
            tint = Color.White
        )

        Button(
            modifier = Modifier.align(Alignment.BottomEnd).clip(shape = RoundedCornerShape(10.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonBlue),
            onClick = { /*TODO*/ }) {
            Text(
                text = "Start",
                fontSize = 10.sp,
            )
        }
    }
}



@Preview(showBackground = false)
@Composable
fun Section1Preview() {
    //Section1()

    //Section2()

    //Section3()

    //Section4()

    Section5Child(text = "Sleep \nMeditation", iconId = R.drawable.ic_music, backGroundColor = BlueViolet1)
   // Section5Child(text = "Tips for\nSleeping", iconId = R.drawable.ic_videocam, backGroundColor = LightGreen2)

}