package ru.konder.myapplicationretrofit.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UrlImageModels {
    @SerializedName("file")
    @Expose
    var file: String? = null
}