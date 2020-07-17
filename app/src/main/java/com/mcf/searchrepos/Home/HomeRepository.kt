package com.mcf.searchrepos.Home
import ApiRequest.ApiRequest
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeRepository(val apiService: ApiRequest){
    fun searchRepos(language: String): io.reactivex.Observable<RepoModel> {
        return apiService.search(query = "language:$language")
    }
}


object HomeRepositoryProvider {
    fun provideSearchRepos(): HomeRepository {
        return HomeRepository(ApiRequest.Factory.create())
    }
}