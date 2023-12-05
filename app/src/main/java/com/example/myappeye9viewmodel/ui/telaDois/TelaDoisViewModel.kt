package com.example.myappeye9viewmodel.ui.telaHome

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myappeye9viewmodel.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TelaDoisViewModel(): ViewModel() {

    private var _tela2UIState = MutableStateFlow(TelaDoisUIState())
    val tela2UIState:StateFlow<TelaDoisUIState> = _tela2UIState.asStateFlow()

    var campoDeTexto by mutableStateOf("")
        private set

    fun updateCampoDeTexto(campoDeTexto:String){
        this.campoDeTexto = campoDeTexto
    }

    fun tocarInformacoesTela() {

        _tela2UIState.update { currentState ->
            currentState.copy(
                idImagem = R.drawable.logo2,
                idBotao = R.string.click,
                idTitulo = R.string.teste_viewmodell
            )
        }
    }


}