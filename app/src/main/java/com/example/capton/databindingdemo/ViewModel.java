package com.example.capton.databindingdemo;

import android.databinding.BaseObservable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAPTON on 2017/9/24.
 */

public class ViewModel extends BaseObservable {

    private MainActivity activity;
    private DataBindingRecyclerViewAdapter adapter;
    private List<Person> personList=new ArrayList<>();

    public ViewModel(final MainActivity activity){
        this.activity=activity;

        for (int i = 0; i < 10; i++) {
            Person p=new Person();
            p.name.set("热巴我老婆<^_^>  "+i);
            p.url.set("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=150686889" +
                    "3&di=ce03509d972bd0d535a1fdcc20c9d202&imgtype=jpg&er=1&src=http%3A%2F%2Fn.sinaimg.cn%2Fent%2Ftransform%2F20170818%2FIAPS-fykcppx9377606.jpg");
             personList.add(p);
        }

         adapter = new DataBindingRecyclerViewAdapter
                (activity,R.layout.item_person,BR.person,personList);
        activity.bindingView.recyclerview.setLayoutManager(new LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false));
        activity.bindingView.recyclerview.setAdapter(adapter);
        adapter.setOnItemCkickListener(new DataBindingRecyclerViewAdapter.ItemClickListener() {
            @Override
            public void itemClick(View view, int position) {
                Toast.makeText(activity,position+"",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void remove(){
        if(personList.size()!=0)
            personList.remove(0);
        adapter.notifyDataSetChanged();
    }
    public void add(){
        Person p=new Person();
        p.name.set("热巴我老婆<^_^>  我是新来的");
        p.url.set("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=150686889" +
                "3&di=ce03509d972bd0d535a1fdcc20c9d202&imgtype=jpg&er=1&src=http%3A%2F%2Fn.sinaimg.cn%2Fent%2Ftransform%2F20170818%2FIAPS-fykcppx9377606.jpg");
        personList.add(0,p);
        adapter.notifyDataSetChanged();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
