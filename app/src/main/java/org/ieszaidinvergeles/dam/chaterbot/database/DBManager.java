package org.ieszaidinvergeles.dam.chaterbot.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    private Helper dbh;
    private SQLiteDatabase db;

    public DBManager(Context c){dbh = new Helper(c);}

    public void open() {db = dbh.getWritableDatabase();}

    public void openRead() {db = dbh.getReadableDatabase();}

    public void close() {dbh.close();}

    public long insert(String mess, String author){
        ContentValues values = new ContentValues();
        values.put(Contract.BookTable.MESSAGE, mess);
        values.put(Contract.BookTable.AUTHOR, author);

        long id = db.insert(Contract.BookTable.TABLE, null, values);

        return id;
    }

    /*
    public int delete(Book book){
        String condition = Contract.BookTable._ID + " = ?";
        String[] args = { book.getId() + ""};
        int count = db.delete(Contract.BookTable.TABLE, condition, args);
        return count;
    }
    */

    public Cursor getCursor(){
        Cursor cursor = db.query(Contract.BookTable.TABLE, null, null, null, null, null, null);
        return cursor;
    }

    public String getRow(Cursor c){

        return c.getString(1);

    }

    //Get específicos.

}
