package com.example.rohanmalik.abpkkatodo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import java.util.Date;

/**
 * Created by Rohan Malik on 16-07-2017.
 */
@Entity(foreignKeys = @ForeignKey(entity = Category_Todo.class,
                                parentColumns = "id",
                                childColumns = "category_id"))
@TypeConverters(DateConverter.class)
public class Lists {
    @PrimaryKey(autoGenerate = true)
            Integer listId;
    String Title;
     Date date;
    @ColumnInfo(name = "category_id")
    String categoryId;

    public Lists() {
    }

    public Lists(String title,Date date) {
        Title = title;
     this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    //    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
}
