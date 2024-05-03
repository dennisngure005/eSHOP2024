@file:Suppress("UNUSED_VARIABLE", "UNUSED_ANONYMOUS_PARAMETER")

package com.example.wazitoecommerce.ui.theme.screens.cart

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wazitoecommerce.R
import androidx.compose.foundation.layout.Column as Column1


@SuppressLint("AutoboxingStateCreation")
@OptIn(ExperimentalComposeUiApi::class)
@Preview(showBackground = true)
@Composable
fun CartScreen() {
    var itemDrag by remember { mutableStateOf(0f) }


    Column1(modifier = Modifier.fillMaxSize()) {
        val (topBar, product, checkout) = createRefs()

        Row(
            modifier = Modifier
                .padding(top = 15.dp, start = 15.dp, end = 15.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(0.5f)) {

            }
            Box(modifier = Modifier.weight(0.7f)) {
                Column1(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Your Cart",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "4 items",
                        textAlign = TextAlign.Center,
                        color = Color.Red,
                    )

                }
            }

        }

        Column1(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .pointerInput(Unit) {
                        detectVerticalDragGestures { change, dragAmount ->
                            itemDrag = dragAmount
                        }
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ps4consolewhite),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Column1() {
                    Text(
                        text = "Wireless Controller for PS4™",
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,

                        )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row() {
                        Text(
                            text = "$79.99",
                            color = Color.Red,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "  x1", color = Color.Transparent )
                    }
                }
            }







            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .pointerInput(Unit) {
                        detectVerticalDragGestures { change, dragAmount ->
                            itemDrag = dragAmount
                        }
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Column1() {
                    Text(
                        text = "An affordable iphone",
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,

                        )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row() {
                        Text(
                            text = "$100.25",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "  x1", color = Color.Black)
                    }
                }
            }



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .pointerInput(Unit) {
                        detectVerticalDragGestures { change, dragAmount ->
                            itemDrag = dragAmount
                        }
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imagepopularproduct2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Column1() {
                    Text(
                        text = "Wireless radio",
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,

                        )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row() {
                        Text(
                            text = "$49.99",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "  x1", color = Color.Black)
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .pointerInput(Unit) {
                        detectVerticalDragGestures { change, dragAmount ->
                            itemDrag = dragAmount
                        }
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.watch),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                        .padding(10.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Column1() {
                    Text(
                        text = "Hybrid watch wired",
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,

                        )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row() {
                        Text(
                            text = "$36.55",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "  x1", color = Color.Black)
                    }
                }
            }


        }




        Column1(
            modifier = Modifier
                .wrapContentHeight()
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp)
                )
                .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.reciept),
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp)
                        .padding(10.dp)
                        .clip(RoundedCornerShape(15.dp))
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text("Add vouture Code")
                    Icon(
                        painter = painterResource(id = R.drawable.arrowright),
                        contentDescription = null,
                    )
                }
            }
            //btn
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column1() {
                    Text(text = "Total")
                    Text(
                        text = "$266.78",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,

                    )

                }
                Box(
                    modifier = Modifier
                        .width(150.dp)
                ) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Check Out")

                    }
                }





            }


        }

    }
}