package com.nurayim.fragment_four_lesson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

// Наш Адаптер отвечтает за  то что именно эти данные отобразились за их позиции где они будет стоять з
// за то что как они будут стоять за сортировку возможно
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    // Создали Array list в itemModel создали Array list назвали его data

  // к нам list данных к намм приходит ( список группы, список товаров ) да получается
    ArrayList<itemModel> data = new ArrayList<>();

    @NonNull
    @Override
    // за то чтобы прорисовать вот это все  отвечает onCreateViewHolder
    // за создание нового эмлемента отвечает onCreateViewHolder
    // parent он привязывается к активити его перентом является активити
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Вызвали специальный метод LayoutInflater
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new MainViewHolder(view);
    }

    //Потом создали специальный метод addText чтобы когда мы обновляли данные чтоб автоматически данные обновлял
    // постоянно при добавлении данных будет работать notifyDataSetChanged
    // то есть обнови дату(то есть наш Array list)  когда будут какие то изменения
    public void addText(ArrayList<itemModel> list) {
        data = list;
        notifyDataSetChanged();


    }


    //Он отвечает за то чтобы получает данные из даты и по позициям передовал во View Holder
    // чтобы он его заполнил он служит для того чтобы двать эти данные и подстраивать и создовать специальные элементы
    // при прокрутке автоматически создоваться
    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));

    }

    // getItemCount будет просчитывать размер наешего листа
    @Override
    public int getItemCount() {
        return data.size();
    };


}
