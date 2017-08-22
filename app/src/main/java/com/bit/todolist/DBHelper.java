package com.bit.todolist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by suin on 2017-08-21.
 */

// db insert를 시도할때 자동으로 호출되는 클래스
public class DBHelper extends SQLiteOpenHelper {
    /*최초 버전일때 1*/
    private static final int DB_VERSION =1;


    public DBHelper(Context context) {
        super(context, DBContract.ToDoTable.DB_NAME, null, DB_VERSION);
    }


    //최초 db insert가 시도될 때 한번만 호출되는 메서드
    @Override
    public void onCreate(SQLiteDatabase db) {

        //새로 테이블을 생성하는 코드
        db.execSQL(DBContract.ToDoTable.CREATE_TABLE);
    }



    @Override /*업데이트 있을 시 여기에 메시지뜸*/
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
