package com.fionera.base.mvp;

/**
 * BaseView
 * Created by fionera on 17-2-8 in MVPPractice.
 */

public interface BaseView<P extends BasePresenter> {
    void setPresenter(P presenter);

    void onAttach();

    void onDetach();
}
