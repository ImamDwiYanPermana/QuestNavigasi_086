package com.example.questnavigasi.ui.viewmodel

import com.example.questnavigasi.model.DataMahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel {
    //Request
    private val _uiState = MutableStateFlow(DataMahasiswa())
    val uiState: StateFlow<DataMahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa(listDM: List<String>){
        _uiState.update { dataMhs ->
            dataMhs.copy(
                nama = listDM[0],
                nim = listDM[1],
                gender = listDM[2],
                email = listDM[3],
                alamat = listDM[4],
                nohp = listDM[5],
            )
        }
    }
}