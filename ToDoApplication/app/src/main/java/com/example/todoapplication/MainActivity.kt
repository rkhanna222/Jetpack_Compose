package com.example.todoapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val painter = painterResource(id = R.drawable.snow_child)
//            val description = "Child is playing in the snow"
//            val title = "Child is playing in the snow"
//            Box(modifier = Modifier
//                .fillMaxWidth(0.5f)
//                .padding(16.dp)
//            ) {
//                ImageCard(painter = painter, contentDescription = description, title = title)
//            }

//            val navController = rememberNavController()
//
//            NavHost(navController = navController, startDestination = "mainScreen") {
//                composable("mainScreen") { MainScreen(navController) }
//                composable("secondScreen") { SecondScreen(navController) }
//            }

            // Login Button // SnackBar Example
//            val scope = rememberCoroutineScope()
//            val snackbarHostState = remember{SnackbarHostState()}
//            var textFieldState by remember {
//                mutableStateOf("")
//            }
//            Scaffold(
//                modifier = Modifier.fillMaxSize(),
//                snackbarHost = {
//                    SnackbarHost(hostState = snackbarHostState)
//                },
//            ) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 30.dp)
//                ){
//                    TextField(
//                        value = textFieldState,
//                        onValueChange = {
//                            textFieldState = it
//                        },
//                        singleLine = true,
//                        modifier = Modifier.fillMaxWidth())
//
//                    Spacer(modifier = Modifier.height(16.dp))
//
//                    Button(onClick = {
//                        scope.launch { snackbarHostState.showSnackbar("Hello $textFieldState") }
//
//                    }) {
//                        Text("Please greet me!")
//                    }
//
//                }
//
//            }


            //List Example

            val scrollState = rememberScrollState()
            LazyColumn{
                itemsIndexed(
                    listOf("This","is","Jetpack","Compose")
                ){ index, string ->
                    Text(
                        text = string,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                vertical = 24.dp
                            )
                    )
                }

//                items(5000){
//                    Text(
//                        text = "Item $it",
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(
//                                vertical = 24.dp
//                            )
//                    )
//                }
            }
        }
    }

    @Composable
    fun MainScreen(navController: NavController) {
        Button(onClick = { navController.navigate("secondScreen") }) {
            Text("Go to Second Screen")
        }
    }

    @Composable
    fun SecondScreen(navController: NavController) {
        //Text("This is the second screen")
        Button(onClick = { navController.navigate("mainScreen") }) {
            Text("Back")
        }
    }

    @Composable
    fun ImageCard(
        painter: Painter, contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 200f

                            )
                        )
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(title, style = TextStyle(color = Color.White, fontSize = 18.sp))
                }
            }

        }
    }
}
