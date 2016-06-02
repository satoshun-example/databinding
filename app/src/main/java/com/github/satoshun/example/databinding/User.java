package com.github.satoshun.example.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

public class User extends BaseObservable {

    private String name;
    public final ObservableField<String> age;

    User(String name, int age) {
        this.name = name;
        this.age = new ObservableField<>(String.valueOf(age));
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        notifyPropertyChanged(com.github.satoshun.example.databinding.BR.name);
    }
}
