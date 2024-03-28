package com.example.shoppingapp


import retrofit2.http.GET
import retrofit2.Call

interface ApiInterface {
    @GET("products")

    fun GetProductData() : Call<MyData>
}