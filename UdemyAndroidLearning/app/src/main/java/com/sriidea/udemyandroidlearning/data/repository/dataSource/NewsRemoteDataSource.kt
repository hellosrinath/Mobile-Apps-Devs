package com.sriidea.udemyandroidlearning.data.repository.dataSource

import com.sriidea.udemyandroidlearning.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.Query

interface NewsRemoteDataSource {
    suspend fun getTopHeadLines(country: String, page: Int): Response<APIResponse>
    suspend fun getSearchedNews(
        country: String,
        searchedQuery: String,
        page: Int
    ): Response<APIResponse>
}