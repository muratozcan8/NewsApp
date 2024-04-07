package com.muratozcan.newsapp.models

import com.muratozcan.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)