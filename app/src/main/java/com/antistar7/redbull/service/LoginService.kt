package com.antistar7.redbull.service

import com.antistar7.redbull.data.model.ResultInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LoginService {
    @GET("/goldmine-api/login?")
    fun login(
        @Query("id") id: String,
        @Query("password") password: String
    ): Call<ResultInfo>
}