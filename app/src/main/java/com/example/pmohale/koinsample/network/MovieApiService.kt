package com.example.pmohale.koinsample.network

import com.example.pmohale.koinsample.entity.Movie
import io.reactivex.Single
import retrofit2.http.GET

interface MovieApiService {

    @GET("/movie/popular")
    fun getTopMovies(): Single<List<Movie>>

}