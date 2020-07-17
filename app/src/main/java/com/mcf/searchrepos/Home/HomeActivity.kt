package com.mcf.searchrepos.Home

import ApiRequest.ApiRequest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mcf.searchrepos.R
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers

class HomeActivity : AppCompatActivity(), HomeActivityProtocol {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cell)

        val service = ApiRequest.Factory.create()

        service.search("kotlin")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe ({ result ->
                for (item in result.items){
                    print("Repo name: ")
                    print(item.name)
                }
            }, {
                    error -> error.printStackTrace()
                    print("ERRO")
            })
    }

    override fun showData() {

    }

    fun printRepoModel(repoModel: RepoModel){

    }
}
