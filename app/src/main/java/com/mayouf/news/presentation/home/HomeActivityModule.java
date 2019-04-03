package com.mayouf.news.presentation.home;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HomeActivityModule {
    @HomeScope
    @Binds
    abstract HomeActivity provideHomeActivity(HomeActivity homeActivity);
}
