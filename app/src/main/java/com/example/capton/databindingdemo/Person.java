package com.example.capton.databindingdemo;

import android.databinding.ObservableField;

/**
 * Created by CAPTON on 2017/9/24.
 */

public class Person {
    ObservableField<String>   name=new ObservableField<>();
    ObservableField<String>   url=new ObservableField<>();

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getUrl() {
        return url;
    }

    public void setUrl(ObservableField<String> url) {
        this.url = url;
    }
}
