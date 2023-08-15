package com.example.moviediscoveryapplication.repository

import com.example.moviediscoveryapplication.model.MostPopularMoviesResponse

interface TheMovieDbRepository {
    suspend fun getPopularMovies(): MostPopularMoviesResponse
}