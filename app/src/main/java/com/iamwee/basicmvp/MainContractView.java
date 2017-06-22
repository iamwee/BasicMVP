package com.iamwee.basicmvp;

/**
 * Created by zeon on 6/22/2017 AD.
 */

public interface MainContractView {
    void setPresenter(MainContractPresenter presenter);

    void onShowToast(String message);
}
