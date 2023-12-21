package com.example.todoapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Column(
              modifier = Modifier
                  //.fillMaxSize()
                  //.width(600.dp)
                  //.height(300.dp)
                  .fillMaxWidth()
                  .fillMaxHeight(0.5f)
                  .background(Color.Green)
                  //.requiredWidth(300.dp)
                  //.padding(top = 50.dp)
                  //.padding(start = 40.dp)
                  .border(5.dp, Color.Magenta)
                  .padding(5.dp)
                  .border(5.dp, Color.Black)
                  .padding(5.dp)
                  .border(5.dp, Color.Yellow)
                  .padding(5.dp)

          ) {
              Text("Hello", modifier = Modifier.clickable {


              })
                  //, modifier = Modifier
                  //.offset(0.dp, 20.dp))
              Spacer(modifier = Modifier.height(50.dp))
              Text("World")
          }
        }
    }
}
