package com.example.demo

import android.graphics.Paint.Align
import android.icu.number.Scale
import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//import androidx.ui.core.Text
//import androidx.ui.core.setContent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.Transparent,

                ) {
                // Greetings(name = "Happy Birthday buddy!", from = "from wahaj")
                //GreetingImage(getString(R.string.happy_birthday_text), getString(R.string.from_text))

                //ComposeArticle()
                //ComposeTaskManager()
                ComposeQuadrants()
            }
        }

    }


    @Composable
    fun ComposeArticle() {

        val banner = painterResource(id = R.drawable.bg_compose_background)

        Column(modifier = Modifier.fillMaxSize()) {
            Image(painter = banner, contentDescription = null)
            Text(
                text = "Jetpack UI Compose",
                modifier = Modifier.padding(16.dp), fontSize = 24.sp
            )

            Text(
                text = "Jetpack Compose is a modern toolkit for building" +
                        " native Android UI. Compose simplifies and accelerates" +
                        " UI development on Android with less code, powerful tools," +
                        " and intuitive Kotlin APIs.",

                modifier = Modifier.padding(horizontal = 16.dp),
                textAlign = Justify
            )

            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",

                modifier = Modifier.padding(16.dp),
                textAlign = Justify
            )

        }

    }

    @Composable
    fun Greetings(name: String, from: String, modifier: Modifier = Modifier) {
//        Surface(color = Color.Transparent,) {

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 16.dp)
        ) {
//                content = {
            Text(
                text = name,
                fontSize = 100.sp,
                lineHeight = 160.sp,
                textAlign = TextAlign.Center,

                )


            Text(
                text = from, fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
//                }
        }


//        }
    }

    @Composable
    fun GreetingImage(name: String, from: String, modifier: Modifier = Modifier) {

        val image = painterResource(id = R.drawable.dummy)
        Box {


            Image(
                painter = image, contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillHeight,
                alpha = 0.5F
            )

            Greetings(name = name, from = from)

        }
    }

    @Composable
    fun ComposeTaskManager() {

        val tickImage = painterResource(id = R.drawable.ic_task_completed)
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(painter = tickImage, contentDescription = null)

            Text(
                text = "All tasks completed", fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
            )


            Text(
                text = "Nice work!", fontSize = 16.sp
            )
        }
    }


    @Composable
    fun ComposeQuadrants() {

        Card() {
            Column(modifier = Modifier.fillMaxSize()) {

                //1 & 2 quads
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(weight = 0.5f, fill = true)) {
                    Column(
                        Modifier
                            .background(color = Color(0xFFEADDFF))
                            .fillMaxSize()
                            .weight(weight = 0.5f, fill = true)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Text Composable", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Displays text and follows the recommended Material Design guidelines."
                        )
                    }

                    Column(
                        Modifier
                            .background(color = Color(0xFFD0BCFF))
                            .fillMaxSize()
                            .weight(weight = 0.5f, fill = true)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Image composable", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Creates a composable that lays out and draws a given Painter class object."
                        )
                    }
                }

                //3 & 4 quads
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(weight = 0.5f, fill = true)) {

                    Column(
                        Modifier
                            .background(color = Color(0xFFB69DF8))
                            .fillMaxSize()
                            .weight(weight = 0.5f, fill = true)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Row composable", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "A layout composable that places its children in a horizontal sequence."
                        )
                    }

                    Column(
                        Modifier
                            .background(color = Color(0xFFF6EDFF))
                            .fillMaxSize()
                            .weight(weight = 0.5f, fill = true)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Column Composable", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "A layout composable that places its children in a vertical sequence."
                        )
                    }
                }

            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        //    Greetings(name = "Happy Birthday wahaj", from = "from wahaj")
        //GreetingImage("Happy Birthday wahaj", "from wahaj")
        //ComposeArticle()
        //ComposeTaskManager()
        ComposeQuadrants()
    }
}

