package com.example.creditcard.desingcard.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.creditcard.desingcard.livedata.CreditCardViewModel
import com.example.creditcard.desingcard.views.form.CardNumberInput
import com.example.creditcard.desingcard.views.form.ExpirationDateInput
import com.example.creditcard.desingcard.views.form.HolderNameInput

@Composable
fun FormCard(creditCardViewModel: CreditCardViewModel) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color= Color.White)
            .padding(horizontal = 24.dp)
    ){
        Column {

            CardNumberInput(creditCardViewModel)

            Spacer(modifier = Modifier.height(8.dp))

            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                HolderNameInput(creditCardViewModel)

                ExpirationDateInput(creditCardViewModel)
            }
        }
    }
}