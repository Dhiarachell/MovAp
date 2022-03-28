package com.rachel.movap.service

import com.rachel.movap.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=9bff319bddfbd273bc1886bcec1d5e11")
    fun getMovieList(): Call<MovieResponse>
}