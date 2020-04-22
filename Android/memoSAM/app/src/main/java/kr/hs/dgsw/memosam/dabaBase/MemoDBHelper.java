package kr.hs.dgsw.memosam.dabaBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;

import kr.hs.dgsw.memosam.domain.MemoBean;

public class MemoDBHelper extends SQLiteOpenHelper {

    private ArrayList<MemoBean> data;

    public MemoDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        data = new ArrayList<>();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table memos(id integer primary key autoincrement";
        sql += ", title text, body text, time integer)";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "drop table memos";
        db.execSQL(sql);
        onCreate(db);
    }

    public MemoBean get(int id){

        String idStr = String.valueOf(id);
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query("memos", null, "id=?", new String[]{idStr}, null, null, "time desc");

        if (cursor.moveToNext()){

            MemoBean memoBean = new MemoBean();
            memoBean.setId(cursor.getInt(cursor.getColumnIndex("id")));
            memoBean.setTitle(cursor.getString(cursor.getColumnIndex("title")));
            memoBean.setBody(cursor.getString(cursor.getColumnIndex("body")));
            memoBean.setTime(cursor.getLong(cursor.getColumnIndex("time")));

            return memoBean;
        }
        else
            return null;
    }

    public ArrayList<MemoBean> get(){

        SQLiteDatabase db = getReadableDatabase();
        data.clear();

        Cursor cursor = db.query("memos", null, null, null, null, null, null); // *이랑 똑같음 커서에 디비 데이타 넣기
        while (cursor.moveToNext()){

            MemoBean memoBean = new MemoBean();
            memoBean.setId(cursor.getInt(cursor.getColumnIndex("id")));
            memoBean.setTitle(cursor.getString(cursor.getColumnIndex("title")));
            memoBean.setBody(cursor.getString(cursor.getColumnIndex("body")));
            memoBean.setTime(cursor.getLong(cursor.getColumnIndex("time")));

            data.add(memoBean);
        }

        return data;
    }

    public long insert(MemoBean memoBean){

        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("title", memoBean.getTitle());
        values.put("body", memoBean.getBody());
        values.put("time", memoBean.getTime());

        return db.insert("memos", null, values);
    }

    public int update(MemoBean memoBean){

        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("title", memoBean.getTitle());
        values.put("body", memoBean.getBody());
        values.put("time", memoBean.getTime());

        String idStr = String.valueOf(memoBean.getId());

        return db.update("memos", values, "id=?", new String[]{idStr});
    }

    public int delete(int id){

        SQLiteDatabase db = getWritableDatabase();
        String idStr = String.valueOf(id);

        return db.delete("memos", "id=?", new String[]{idStr});
    }
}
