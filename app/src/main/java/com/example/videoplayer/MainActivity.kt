package com.example.videoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.videoplayer.ui.theme.VideoPlayer
import com.example.videoplayer.ui.theme.VideoPlayerTheme
import com.example.videoplayer.ui.theme.YouTubePlayer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VideoPlayerTheme {
                val videoUri = Uri.parse(
                    "android.resource://com.example.videoplayer/raw/undersea"
                )
                Column {
                    Text(
                        modifier = Modifier
                            .padding(top = 90.dp, bottom = 20.dp)
                            .align(alignment = Alignment.CenterHorizontally),
                        text = "YOUTUBE PLAYER",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    YouTubePlayer(
                        youtubeVideoId = "AZS5cgybKcI",
                        lifecycleOwner = LocalLifecycleOwner.current
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        modifier = Modifier
                            .padding(top = 90.dp, bottom = 20.dp)
                            .align(alignment = Alignment.CenterHorizontally),
                        text = "MP3 PLAYER",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    VideoPlayer(videoUri = videoUri)
                }
            }
        }
    }
}

