package com.example.demo.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.R

@Composable
fun DiceRoller(
    readValueDiceNum: Int,
    changeValue: () -> Unit
) {

//    var diceNum by remember {
//        mutableStateOf((1..6).random())
//    }

    //var ran = mutableStateOf(1)

    var count = 0



    Column (
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = ImageVector.vectorResource(
                id = when(readValueDiceNum) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

            ), contentDescription = null)

        Text(text = "Dice Roller composable : $readValueDiceNum",color = Color.Blue, fontSize = 20.sp)


        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                changeValue()

        }) {
            Text(text = "ROLL", fontSize = 30.sp, )
        }

    }

}


@Composable
fun PrintDiceNum(
    valueDiceNum: Int
) {
    Text(text = "Dice Number from PrintDice Num: $valueDiceNum",color = Color.Blue, fontSize = 20.sp)
}


@Composable
fun CallingComposable() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var diceNum by remember {
            mutableStateOf(6)
        }

        DiceRoller(
            readValueDiceNum = diceNum,
            changeValue = {
                diceNum = (1..6).random()
            }
        )

        Spacer(modifier = Modifier.height(30.dp))

        PrintDiceNum(valueDiceNum = diceNum)

    }
}


@Preview(showSystemUi = true)
@Composable
fun DiceRollerPreview() {
    //DiceRoller()

    CallingComposable()
}