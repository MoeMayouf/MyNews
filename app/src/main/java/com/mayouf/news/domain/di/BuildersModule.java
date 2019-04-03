package com.mayouf.news.domain.di;


import com.mayouf.news.presentation.home.HomeActivity;
import com.mayouf.news.presentation.home.HomeActivityModule;
import com.mayouf.news.presentation.home.HomeScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    @HomeScope
    abstract HomeActivity homeActivity();
}
