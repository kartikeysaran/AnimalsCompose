package kartikey.saran.tweetsy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kartikey.saran.tweetsy.models.EntryList
import kartikey.saran.tweetsy.repository.ApiRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val apiRepository: ApiRepository): ViewModel() {
    val category: StateFlow<EntryList>
        get() = apiRepository.data

    init {
        viewModelScope.launch {
            apiRepository.getData()
        }
    }
}