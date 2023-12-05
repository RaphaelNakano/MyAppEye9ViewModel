package com.example.myappeye9viewmodel.ui.telaHome

import com.example.myappeye9viewmodel.R

data class TelaHomeUIState(
    var campoDeTexto: String = "",
    var idImagem: Int = R.drawable.logo,
    var idTitulo: Int = R.string.projeto_viewmodel,
    var idBotao: Int = R.string.aperte
)
