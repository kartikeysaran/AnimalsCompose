package kartikey.saran.tweetsy.api

import kartikey.saran.tweetsy.models.EntryList
import retrofit2.Response
import retrofit2.http.GET

interface ApiEndPoints {

    @GET("/entries")
    suspend fun getData(): Response<EntryList>

}