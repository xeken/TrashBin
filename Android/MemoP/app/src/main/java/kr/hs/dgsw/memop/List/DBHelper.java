package kr.hs.dgsw.memop.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;

import kr.hs.dgsw.memop.Domain.Memo;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {

        super(context, name, factory, version);
    }

    public ArrayList<Memo> getAll(){

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("memo", null, null, null, null,null, null, null);
        ArrayList<Memo> memos = new ArrayList<>();

        while (cursor.moveToNext()){

            Memo memo = new Memo();
            memo.setMemoId(cursor.getInt(cursor.getColumnIndex("memoId")));
            memo.setMemoTitle(cursor.getString(cursor.getColumnIndex("title")));
            memo.setMemoContent(cursor.getString(cursor.getColumnIndex("content")));
            memo.setDate(cursor.getLong(cursor.getColumnIndex("date")));
            memos.add(memo);
        }
        return memos;
    }

    public Memo get(int memoId){

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("memo", null, "memoId == " + memoId, null, null,null, null, null);

        if (cursor.moveToNext()){

            Memo memo = new Memo();
            memo.setMemoId(cursor.getInt(cursor.getColumnIndex("memoId")));
            memo.setMemoTitle(cursor.getString(cursor.getColumnIndex("title")));
            memo.setMemoContent(cursor.getString(cursor.getColumnIndex("content")));
            memo.setDate(cursor.getLong(cursor.getColumnIndex("date")));
            return memo;
        }
        return null;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table memo (memoId integer primary key autoincrement, title text, content text, date long)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "drop table memo";
        db.execSQL(sql);
        onCreate(db);
    }

    public long insert(Memo memo){

        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("title", memo.getMemoTitle());
        values.put("content", memo.getMemoContent());
        values.put("date", memo.getDate());
        return db.insert("memo", null, values);
    }

    public long update(Memo memo){

        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("title", memo.getMemoTitle());
        values.put("content", memo.getMemoContent());
        values.put("date", memo.getDate());
        String memoId = String.valueOf(memo.getMemoId());
        return db.update("memo",  values, "memoId=?", new String[]{memoId});
    }

    public long delete(Memo memo){

        SQLiteDatabase db = getWritableDatabase();
        String memoId = String.valueOf(memo.getMemoId());
        return db.delete("memo", "memoId=?", new String[]{memoId});
    }

    public long delete(){

        SQLiteDatabase db =getWritableDatabase();
        return db.delete("memo", null, null);
    }
}
