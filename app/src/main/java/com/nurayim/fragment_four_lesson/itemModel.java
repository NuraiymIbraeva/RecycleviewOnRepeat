package com.nurayim.fragment_four_lesson;

public class itemModel {


    //Создали класс который будет отвечать за тот контент  то есть за те view который будет внутри нашего recyclerview
    // здесь надо будет переменыым создать список товаров
    //картинки всегда идут как int потому что мы их закидываем в res  когда будем достовать ини будут идти как int
    // Видим картинку затем смотрим что там есть надпись и еще картинки


    String title, desc;
    int image;

    public itemModel(String title, String desc, int image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }
}
