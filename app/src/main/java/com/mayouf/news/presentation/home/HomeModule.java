package com.mayouf.news.presentation.home;



import com.mayouf.news.data.service.DataSource;
import com.mayouf.news.domain.di.Repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

    @Singleton
    @Provides
    public HomePresenter provideHomePresenter(@Repository DataSource repository) {
        return new HomePresenter(repository);
    }
}

