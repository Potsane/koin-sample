package com.example.pmohale.koinsample.entity

import com.google.gson.annotations.SerializedName

class Movie constructor(

    var tittle: String,
    @SerializedName("poster_path")
    var poster: String,
    @SerializedName("overview")
    var description: String,
    @SerializedName("backdrop_path")
    var backdrop: String
)