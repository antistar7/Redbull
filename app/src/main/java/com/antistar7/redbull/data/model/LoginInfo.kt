package com.antistar7.redbull.data.model

import com.google.gson.annotations.SerializedName

data class LoginInfo(
    @SerializedName("id") val id: String,
    @SerializedName("htsId") val htsId: String,
    @SerializedName("appKey") val appKey: String,
    @SerializedName("appSecret") val appSecret: String,
    @SerializedName("token") val token: Boolean,
    @SerializedName("expiredDate") val expiredDate: Boolean,
    @SerializedName("isExpired") val isExpired: String?,
    @SerializedName("exitFlag") val exitFlag: String?,
)
