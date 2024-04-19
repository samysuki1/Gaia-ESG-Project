package br.com.fiap.gaiaprojeto

import android.os.Bundle
import android.provider.CalendarContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.gaiaprojeto.ui.theme.GaiaProjetoTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaiaProjetoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GaiaProjetoScreen()
                }
            }
        }
    }
}

@Composable
fun GaiaProjetoScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(colorResource(id = R.color.verde_1))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logoemalta),
                    contentDescription = "Imagem do logo Gaia"
                )
            }
            // --- formulário
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
            ) {
                Card(
                    modifier = Modifier
                        .offset(y = (-15).dp)
                        .fillMaxWidth()
                        .height(400.dp),
                    colors = CardDefaults
                        .cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(4.dp),
                    border = BorderStroke(width = 1.dp, Color.Green)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .background(Color.Gray)
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Selecione uma Categoria",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Green
                        )
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                        border = BorderStroke(width = 3.dp, Color.White)
                        ) {
                            Text(text = "Cruelty-Free")
                        }
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                            border = BorderStroke(width = 3.dp, Color.White)) {
                            Text(text = "Vida Saudável")
                        }
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                            border = BorderStroke(width = 3.dp, Color.White)) {
                            Text(text = "Coleta Seletiva")
                        }
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                            border = BorderStroke(width = 3.dp, Color.White)) {
                            Text(text = "Voluntariado")
                        }
                    }
                }
            }
        }

        // -- Card Resultado
        Card(
            modifier = Modifier
                .offset(y = (560).dp, x = (90).dp)
                .height(220.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.maeterra),
                contentDescription = "Imagem Mãe Terra")

        }
    }
}