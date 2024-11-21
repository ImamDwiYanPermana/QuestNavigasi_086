package com.example.questnavigasi.ui.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.questnavigasi.model.DataMahasiswa

@Composable
fun DetailMahasiswaView(

    modifier: Modifier = Modifier,
    uiStateMahasiswa: DataMahasiswa,
    onClickButton: () -> Boolean
)
{
    val listDataMhs = listOf(
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("NIM", uiStateMahasiswa.nim),
        Pair("Gender", uiStateMahasiswa.gender),
        Pair("Email", uiStateMahasiswa.email),
        Pair("Alamat", uiStateMahasiswa.alamat),
        Pair("No HP", uiStateMahasiswa.nohp),
    )

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Tampilan Data",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)

        Spacer(Modifier.padding(16.dp))

        listDataMhs.forEach{ items ->
            CardSection(
                judulParam = items.first,
                isiParam = items.second
            )
        }

        Spacer(Modifier.padding(16.dp))

        Button(onClick = {onClickButton()}) {
            Text(text = "Kembali")
        }
    }
}

