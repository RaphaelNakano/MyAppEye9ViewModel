package com.example.myappeye9viewmodel.ui.telaHome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaDois(
    telaDoisViewModel: TelaDoisViewModel = viewModel()
){

    val telaDoisUIState = telaDoisViewModel.tela2UIState.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painterResource(id = telaDoisUIState.value.idImagem),
            contentDescription = null
        )

        Text(
            text = stringResource(telaDoisUIState.value.idTitulo)
        )

        OutlinedTextField(
            value = telaDoisViewModel.campoDeTexto,
            onValueChange = {telaDoisViewModel.updateCampoDeTexto(it)}
        )

        OutlinedButton(
            onClick = {
                telaDoisViewModel.tocarInformacoesTela()
            }
        ) {
            Text(text = stringResource(telaDoisUIState.value.idBotao))
        }
    }
}