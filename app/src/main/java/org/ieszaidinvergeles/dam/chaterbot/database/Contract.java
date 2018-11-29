package org.ieszaidinvergeles.dam.chaterbot.database;

import android.provider.BaseColumns;

public class Contract {

    private Contract(){}

    public static abstract class BookTable implements BaseColumns{
        public static final String TABLE="conversations";
        public static final String MESSAGE="message";
        public static final String AUTHOR="author";
    }

    public static final String SQL_CREATE_BOOKS=
            "create table "+BookTable.TABLE+" ("+
                    BookTable._ID + " integer primary key autoincrement,"+
                    BookTable.MESSAGE+" text,"+
                    BookTable.AUTHOR+" text)";

    public static final String SQL_DROP_BOOKS = "drop table if exists "+BookTable.TABLE;



}
