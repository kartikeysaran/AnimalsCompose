package kartikey.saran.tweetsy.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kartikey.saran.tweetsy.models.Entry
import kartikey.saran.tweetsy.viewmodels.MainViewModel

@Composable
fun EntryItem(entryItem: Entry) {
    Box(modifier = Modifier.padding(0.dp, 10.dp)) {
        Card(Modifier.fillMaxWidth(1f)){
            Column(Modifier.padding(10.dp)) {
                Text(text = "API - ${entryItem.API}",)
                Text(text = "Desciption - ${entryItem.Description}")
                Text(text = "Category - ${entryItem.Category}")
            }

        }
    }

}

@Composable
fun EntryListItem() {
    val mainViewModel: MainViewModel = viewModel()
    val entryList = mainViewModel.category.collectAsState()
    LazyVerticalGrid(columns = GridCells.Fixed(1),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.SpaceAround
        ) {
        items(entryList.value.entries){
            EntryItem(it)
        }
    }
}