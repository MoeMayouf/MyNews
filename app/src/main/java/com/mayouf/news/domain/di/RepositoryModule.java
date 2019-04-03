package com.mayouf.news.domain.di;


import com.mayouf.news.data.service.DataSource;
import com.mayouf.news.domain.NewsRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Repository
    @Singleton
    DataSource provideLastFMRepository(@Remote DataSource dataSource) {
        return new NewsRepository(dataSource);
    }
}
