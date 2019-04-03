package com.mayouf.news.domain;

import com.mayouf.news.data.model.News;
import com.mayouf.news.data.service.DataSource;

import io.reactivex.Observable;

public class NewsRepository implements DataSource {

    private final DataSource dataSource;

    public NewsRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Observable<News> getTopHeadlines(String topSources, String topQuery, String topLanguage, String topCountry, String topCategory) {
        return dataSource.getTopHeadlines(topSources, topQuery, topLanguage, topCountry, topCategory);
    }

    @Override
    public Observable<News> getEverything(String newsQuery, String newsSources, String newsDomain) {
        return dataSource.getEverything(newsQuery, newsSources, newsDomain);
    }
}
