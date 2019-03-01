package com.example.pmohale.koinsample.repository

import com.example.pmohale.koinsample.entity.Movie
import io.reactivex.Single

interface MovieRepository {

    fun getTopMovies(): Single<List<Movie>>
    fun getMovieDetails(movieId: String): Single<List<Movie>>
}