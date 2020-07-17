package com.mcf.searchrepos.Home

data class RepoModel(
    var items:List<Repo>
)

data class Repo (
    var name:String,
    var description:String,
    var stargazers_count:String
)

data class Owner (
    var avatar_url:String,
    var login:String
)

//data class RepoModel(
//    @SerializedName("items")
//    var items:List<Repo>
//)
//
//data class Repo (
//    @SerializedName("name")
//    var name:String,
//    @SerializedName("owner")
//    var owner:List<Owner>,
//    @SerializedName("description")
//    var description:String,
//    @SerializedName("stargazers_count")
//    var starsCount:String
//)
//
//data class Owner (
//    @SerializedName("avatar_url")
//    var picture:String,
//    @SerializedName("login")
//    var username:String
//)