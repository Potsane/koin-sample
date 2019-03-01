package com.example.pmohale.koinsample.view.list

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.pmohale.koinsample.entity.Movie

class MovieListViewModel() : ViewModel() {

    fun getTopMovies(): LiveData<List<Movie>>? {
        return null
    }
}