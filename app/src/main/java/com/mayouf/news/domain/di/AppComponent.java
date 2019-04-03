package com.mayouf.news.domain.di;

import android.app.Application;

import com.mayouf.news.common.NewsApplication;
import com.mayouf.news.presentation.home.HomeModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, BuildersModule.class,
        NetworkModule.class, RepositoryModule.class, HomeModule.class})
@Singleton
public interface AppComponent {
    void inject(NewsApplication lastFMClient);

    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
