package com.antistar7.redbull.data.model

import com.google.gson.annotations.SerializedName

data class ResultInfo(
    @SerializedName("code") val code: String,
    @SerializedName("msg") val msg: String,
    @SerializedName("body") val body: Object,
    @SerializedName("buyPerStockAmount") val buyPerStockAmount: Integer,
    @SerializedName("bougtStockCout") val bougtStockCout: Integer
)
