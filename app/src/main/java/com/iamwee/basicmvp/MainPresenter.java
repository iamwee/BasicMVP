package com.iamwee.basicmvp;

/**
 * Created by zeon on 6/22/2017 AD.
 */

public class MainPresenter implements MainContractPresenter {

    private MainContractView view;
    private MainModel model;

    public MainPresenter(MainContractView view){
        model = new MainModel();
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void showToast(String s) {
        String appName = model.getStringResource(R.string.app_name);
        view.onShowToast(appName);
    }

    @Override
    public void add(int a, int b) {
        int result = model.add(a, b);
        view.onShowToast(String.valueOf(result));
    }

    @Override
    public void getDataAsync() {
        model.getData(new MainModel.Callback() {
            @Override
            public void onResponse(String result) {
                view.onShowToast(result);
            }
        });
    }
}
