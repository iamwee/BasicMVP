package com.iamwee.basicmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContractView {

    private MainContractPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        presenter.showToast("hello, world");

        presenter.add(1, 2);

        presenter.getDataAsync();
    }

    @Override
    public void setPresenter(MainContractPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onShowToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
