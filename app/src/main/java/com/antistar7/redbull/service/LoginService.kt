package com.antistar7.redbull.service

import com.antistar7.redbull.data.model.ResultInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LoginService {
    @GET("/goldmine-api/login/{id}/{password}")
    fun login(
        @Path("id") id: String,
        @Path("password") password: String
    ): Call<ResultInfo>
}