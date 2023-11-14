package com.laraknife.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.laraknife.cuadrantecompose.ui.theme.Color1
import com.laraknife.cuadrantecompose.ui.theme.Color2
import com.laraknife.cuadrantecompose.ui.theme.Color3
import com.laraknife.cuadrantecompose.ui.theme.Color4
import com.laraknife.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {

    /*
    Hecho por Brayan Josue Hernández Lara (LaraKnife)
    Domingo 19 de Noviembre de 2023
    Número de control: 192T0220
    Materia: Desarrollo de aplicaciones móviles
    Ingeniería en Sistemas Computacionales
    Noveno Semestre
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrantes()
                }
            }
        }
    }
}

@Composable
private fun Cuadrantes() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Cuadrante(
                title = stringResource(R.string.title1),
                description = stringResource(R.string.description1),
                backgroundColor = Color1,
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                title = stringResource(R.string.title2),
                description = stringResource(R.string.description2),
                backgroundColor = Color2,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuadrante(
                title = stringResource(R.string.title3),
                description = stringResource(R.string.description3),
                backgroundColor = Color3,
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                title = stringResource(R.string.title4),
                description = stringResource(R.string.description4),
                backgroundColor = Color4,
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
private fun Cuadrante(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    backgroundColor: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            color = Color.Black
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun CuadrantesPreview() {
    CuadranteComposeTheme {
        Cuadrantes()
    }
}