package com.mayouf.news.data.service;

import com.mayouf.news.data.model.News;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsService {

    @GET("top-headlines")
    Observable<News> getTopHeadlines(@Query("sources") String topSources,
                                     @Query("q") String topQuery,
                                     @Query("language") String topLanguage,
                                     @Query("country") String topCountry,
                                     @Query("category") String topCategory);

    @GET("everything")
    Observable<News> getAllNews(@Query("q") String newsQuery,
                                @Query("sources") String newsSources,
                                @Query("domain") String newsDomain);
}
