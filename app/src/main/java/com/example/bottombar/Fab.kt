package com.example.bottombar

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Box
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource

@Composable
fun Fab(){
    FloatingActionButton(
     onClick = { /*TODO*/ },
     backgroundColor = colorResource(id = R.color.primary),
     content = { androidx.compose.material.Icon(Icons.Default.Add,"Add")},
     contentColor = Color.White,
    )
}