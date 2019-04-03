package com.mayouf.news.data.service;

import com.mayouf.news.data.model.News;

import io.reactivex.Observable;

public interface DataSource {
    Observable<News> getTopHeadlines(String topSources,
                                     String topQuery,
                                     String topLanguage,
                                     String topCountry,
                                     String topCategory);

    Observable<News> getEverything(String newsQuery,
                                   String newsSources,
                                   String newsDomain);
}
