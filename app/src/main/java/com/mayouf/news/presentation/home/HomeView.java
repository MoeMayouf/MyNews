package com.mayouf.news.presentation.home;


import com.mayouf.news.data.model.Article;
import com.mayouf.news.presentation.base.MvpView;

import java.util.List;

public interface HomeView extends MvpView {
        void displayAlbums(List<Article> articles);
        void displayError(String errorMessage);
        void displayProgressbar();
        void displayToast(String message);
}
