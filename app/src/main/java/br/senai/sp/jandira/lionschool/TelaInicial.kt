package br.senai.sp.jandira.lionschool

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaInicial() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Caixa aonde está guardado o Text e a Image
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(R.drawable.lion),
                    contentDescription = "",
                    modifier = Modifier.size(170.dp)
                )
                Text(
                    text = stringResource(R.string.app_name),
                    color = colorResource(R.color.escola_blue),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 15.dp).width(130.dp)
                )
            }//Column para o encontre seu Curso
            Column(
                modifier = Modifier.padding(top = 100.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(7.dp),
            ) {
                Text(
                    text = stringResource(R.string.find_your_course),
                    color = colorResource(R.color.escola_blue),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .background(color = colorResource(R.color.escola_amarelo))
                        .height(6.dp)
                        .width(60.dp)
                )
                Text(
                    text = stringResource(R.string.get),
                    color = Color.Gray,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 25.dp)
                )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                    .padding(top = 140.dp)
                .padding(top = 140.dp),
            onClick = {},
            shape = RoundedCornerShape(17.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.escola_amarelo)
            ),
        ) {
            Text(
                text = stringResource(R.string.started),
                color = colorResource(R.color.escola_blue),
                fontSize = 19.sp
            )
        }
            Row(
                modifier = Modifier.padding(top = 110.dp),
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ){
//                Image(
////                    painter = painterResource(R.drawable.),
//                    contentDescription = "Youtube",
//                    modifier = Modifier.size(40.dp)
//                )
//                Image(
////                    painter = painterResource(R.drawable.),
//                    contentDescription = "Twitter",
//                    modifier = Modifier.size(40.dp)
//                )
//                Image(
////                    painter = painterResource(R.drawable.),
//                    contentDescription = "Instagram",
//                    modifier = Modifier.size(40.dp)
//                )
//                Image(
//                    painter = painterResource(R.drawable.),
//                    contentDescription = "Facebook",
//                    modifier = Modifier.size(40.dp)
//                )

            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview () {
    TelaInicial()
}
