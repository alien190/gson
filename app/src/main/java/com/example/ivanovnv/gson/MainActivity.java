package com.example.ivanovnv.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human father = new Human();
        father.setAge(38);
        father.setName("Петр Петров");

        Human kid=new Human();
        kid.setAge(4);
        kid.setName("Вася Петров");
        kid.setKids(null);

        List<Human> kids= new ArrayList<>();
        kids.add(kid);
        father.setKids(kids);

        //String json = new Gson().toJson(father);
        Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
        String json = gson.toJson(father);
        json="";

    }
}
