package com.example.demo.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ChipColors
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
import com.example.demo.ui.theme.Beige2
import com.example.demo.ui.theme.BlueViolet1
import com.example.demo.ui.theme.ButtonBlue
import com.example.demo.ui.theme.LightGreen1
import com.example.demo.ui.theme.LightGreen2
import com.example.demo.ui.theme.LightRed
import com.example.demo.ui.theme.OrangeYellow2

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
                color = Color.White
                )
            Text(
                text = "We wish you a good day!",
                color = Color.White

                )

        }

        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_search),
            contentDescription = null,
            tint = Color.White
            )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Section2() {
//    Row (
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 10.dp),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ){
//        AssistChip(
//            colors = AssistChipDefaults.assistChipColors(containerColor = ButtonBlue),
//            modifier = Modifier.height(50.dp),
//            onClick = { /*TODO*/ },
//            label = {
//                Text(
//                text = "Sound Sleep",
//                color = Color.White
//                ) },
//            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue)
//        )
//
//        AssistChip(
//            colors = AssistChipDefaults.assistChipColors(containerColor = ButtonBlue),
//
//            modifier = Modifier.height(50.dp),
//            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue),
//
//            onClick = { /*TODO*/ },
//            label = {
//                Text(
//                text = "Insomnia",
//                color = Color.White
//                )
//            }
//        )
//
//        AssistChip(
//            modifier = Modifier.height(50.dp),
//            colors = AssistChipDefaults.assistChipColors(containerColor = ButtonBlue),
//            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue),
//            onClick = { /*TODO*/ },
//            label = {
//                Text(
//                    text = "Depression",
//                    color = Color.White
//
//                    ) }
//        )
//    }

    LazyRow (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ){
        val list  = listOf<String>("Sound Sleep", "Insomnia", "Depression", "College life")

        items(list) {item ->
            AssistChip(
            colors = AssistChipDefaults.assistChipColors(containerColor = ButtonBlue),

            modifier = Modifier.height(50.dp),
            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue),

            onClick = { /*TODO*/ },
            label = {
                Text(
                text = item,
                color = Color.White
                )
            }
      )

        }

    }



    /*
    Similarly we can use LazyColumn

    LazyColumn {

    }
     */
}

@Composable
fun Section3() {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
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
                color = Color.White
            )
            Text(
                text = "Meditation 3-10 min",
                color = Color.White
                )

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
                .size(45.dp)
                .clip(shape = CircleShape)
                .background(color = ButtonBlue),
            contentAlignment = Alignment.Center
        ){
            Icon(
                modifier = Modifier.size(25.dp),
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
    backGroundColor: Color,
    modifier: Modifier = Modifier
) {
    Box (
        modifier = modifier
            .size(175.dp)
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
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .clip(shape = RoundedCornerShape(10.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonBlue),
            onClick = { /*TODO*/ }) {
            Text(
                text = "Start",
                fontSize = 10.sp,
            )
        }
    }
}

@Composable
fun Section5() {
    Column (
        modifier = Modifier.fillMaxSize(),
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.SpaceBetween
        ){
            Section5Child(
                text = "Sleep \nMeditation",
                iconId = R.drawable.ic_music,
                backGroundColor = BlueViolet1,
               // modifier = Modifier.weight(0.5f)
            )

           // Spacer(modifier = Modifier.width(10.dp))

            Section5Child(
                text = "Tips for\nsleeping",
                iconId = R.drawable.ic_videocam,
                backGroundColor = LightGreen1,
               // modifier = Modifier.weight(0.5f)

            )

        }
        
        
        Spacer(modifier = Modifier.height(20.dp))
        
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Section5Child(
                text = "Night Island",
                iconId = R.drawable.ic_moon,
                backGroundColor = OrangeYellow2,
                // modifier = Modifier.weight(0.5f)
            )

            // Spacer(modifier = Modifier.width(10.dp))

            Section5Child(
                text = "Calming\nSounds",
                iconId = R.drawable.ic_headphone,
                backGroundColor = Beige2,
                // modifier = Modifier.weight(0.5f)

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

    //Section5Child(text = "Sleep \nMeditation", iconId = R.drawable.ic_music, backGroundColor = BlueViolet1)
   // Section5Child(text = "Tips for\nSleeping", iconId = R.drawable.ic_videocam, backGroundColor = LightGreen2)
    Section3()
}