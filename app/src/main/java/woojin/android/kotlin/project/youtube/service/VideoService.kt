package woojin.android.kotlin.project.youtube.service

import retrofit2.Call
import retrofit2.http.GET
import woojin.android.kotlin.project.youtube.dto.VideoDTO

interface VideoService {
    @GET("/v3/a106100b-217f-4a17-9e33-ca41733470e5")
    fun listVideos(): Call<VideoDTO>
}