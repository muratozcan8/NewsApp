package com.muratozcan.newsapp.ui

import androidx.lifecycle.ViewModel
import com.muratozcan.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}