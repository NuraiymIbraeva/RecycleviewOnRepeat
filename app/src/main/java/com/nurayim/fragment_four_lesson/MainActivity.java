package com.nurayim.fragment_four_lesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList<itemModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        // здесь нашу переменную привязываем по айди к главной вктивити мейн
        adapter = new MainAdapter();
        //нашему главному адаптеру  присваиваем наш созданный главный адаптер

        recyclerView.setAdapter(adapter);
        // и нашему recyclerview говорим задай нашему адаптеру нашу переменную
        // и здесь нашему RecyclerView.LayoutManager  manager присваиваем new LinearLayoutManager
        // Здесь мы указываем HORIZONTAL  или VERTICAL

        RecyclerView.LayoutManager  manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0,new itemModel("Shoes","Leather",R.drawable.masha));
        list.add(1,new itemModel("Shoes","Summer",R.drawable.masha));
        list.add(2,new itemModel("Winter","Leather",R.drawable.masha));
        list.add(3,new itemModel("Shoes","Fall",R.drawable.masha));


        adapter.addText(list);












    }
}