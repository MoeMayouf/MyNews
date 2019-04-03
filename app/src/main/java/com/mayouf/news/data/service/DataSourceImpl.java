package com.mayouf.news.data.service;

import com.mayouf.news.data.model.News;

import io.reactivex.Observable;

public class DataSourceImpl implements DataSource {

    private final NewsService newsService;

    public DataSourceImpl(NewsService newsService) {
        this.newsService = newsService;
    }

    @Override
    public Observable<News> getTopHeadlines(String topSources, String topQuery, String topLanguage, String topCountry, String topCategory) {
        return newsService.getTopHeadlines(topSources, topQuery, topLanguage, topCountry, topCategory);
    }

    @Override
    public Observable<News> getEverything(String newsQuery, String newsSources, String newsDomain) {
        return newsService.getAllNews(newsQuery, newsSources, newsDomain);
    }
}
