package kartikey.saran.tweetsy.repository

import android.content.Context
import com.google.gson.Gson
import kartikey.saran.tweetsy.api.ApiEndPoints
import kartikey.saran.tweetsy.models.EntryList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiEndPoints: ApiEndPoints) {

    private val _data = MutableStateFlow<EntryList>(EntryList(0, emptyList()))
    val data : StateFlow<EntryList>
        get() = _data
    suspend fun getData()  {
        val response = apiEndPoints.getData()
        if(response.isSuccessful && response.body() != null){
            _data.emit(response.body()!!)
        }
    }

}