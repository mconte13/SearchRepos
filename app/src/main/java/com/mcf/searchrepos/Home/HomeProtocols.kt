package com.mcf.searchrepos.Home

import retrofit2.Call
import retrofit2.http.GET

interface HomeActivityProtocol {
    fun showData()
}

interface HomePresenterProtocol {
    @GET("repositories?q=language:kotlin&sort=stars")
    fun getRepos(): Call<RepoModel>
}