package com.example.wazitoecommerce.ui.theme.screens.third

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.HOME_URL


@Composable
fun Thirdscreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.plain3),
            contentScale = ContentScale.FillBounds


        )
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Eshop",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Green


        )
        Image(
            painter = painterResource(id = R.drawable.el1),
            contentDescription = "man",
            modifier = Modifier
                .size(350.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(10.dp))


        val mContext = LocalContext.current
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "We show you easy ways to shop and market your products.Just stay at home with us",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        Row {
            Button(
                onClick = {
                          navController.navigate(HOME_URL)
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
            ) {
                Text(text = "Continue")
            }


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ThirdscreenPreview() {
    Thirdscreen(rememberNavController())
}