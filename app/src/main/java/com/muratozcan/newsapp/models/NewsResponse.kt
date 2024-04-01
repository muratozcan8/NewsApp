package com.muratozcan.newsapp.models

import com.muratozcan.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)