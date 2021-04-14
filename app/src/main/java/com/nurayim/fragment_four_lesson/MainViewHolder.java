package com.nurayim.fragment_four_lesson;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {


    TextView tv;
    TextView tv1;
    ImageView img;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        tv = itemView.findViewById(R.id.tv_title);
        tv1 = itemView.findViewById(R.id.tv_desc);
        img = itemView.findViewById(R.id.image_shop);


    }

    public void onBind(itemModel data) {
        // Через этот метод (Метод находится в MainAdapter) передаем сюда данные
        tv.setText((data.title));
        tv1.setText(data.desc);
        img.setImageResource(data.image);


    }
}
