package com.example.capton.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.capton.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   public ActivityMainBinding bindingView;
    private ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindingView= DataBindingUtil.setContentView(this,R.layout.activity_main);

        bindingView.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel=new ViewModel(MainActivity.this);
                bindingView.setViewModel(viewModel);
            }
        });
        bindingView.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewModel!=null)
                    viewModel.add();
            }
        });
        bindingView.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewModel!=null)
                    viewModel.remove();
            }
        });

    }
}
