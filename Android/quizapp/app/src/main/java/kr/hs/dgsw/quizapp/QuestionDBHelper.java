package kr.hs.dgsw.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;

import kr.hs.dgsw.quizapp.model.QuestionBean;

public class QuestionDBHelper extends SQLiteOpenHelper {

    private String table = "question";
    private ArrayList<QuestionBean> questionBeans;

    public QuestionDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        questionBeans = new ArrayList<>();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table questions(id integer primary key autoincrement, question text, score integer, answer integer, choice1 text, choice2 text, choice3 text, choice4 text);
        StringBuilder builder = new StringBuilder();
        builder.append("create table ");
        builder.append(table);
        builder.append("(id integer primary key autoincrement, type integer");
        builder.append("question text, score text, answer integer,");
        builder.append("choice1 text, choice2 text, choice3 text, choice4 text");
        String sql = builder.toString();

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table question");
        onCreate(db);
    }

    public long insert(QuestionBean questionBean){

        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id", questionBean.getId());
        values.put("type",questionBean.getType());
        values.put("question", questionBean.getQuestion());
        values.put("score", questionBean.getScore());
        values.put("answer", questionBean.getAnswer());

        for(int i = 0 ; i < questionBean.getChoices().length ; i++){
            int index = i+1;
            values.put("choice"+index, questionBean.getChoices()[i]);
        }
        return database.insert(table, null, values);
    }

    public QuestionBean select(int id){

        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.query(table, null, "id=?", new String[]{String.valueOf(id)}, null, null, null);

        if(cursor.moveToNext()){

            QuestionBean returnBean = new QuestionBean();
            returnBean.setId(cursor.getColumnIndex("id"));
            returnBean.setType(cursor.getInt(cursor.getColumnIndex("type")));
            returnBean.setQuestion(cursor.getString(cursor.getColumnIndex("question")));
            returnBean.setAnswer(cursor.getInt(cursor.getColumnIndex("answer")));
            returnBean.setScore(cursor.getInt(cursor.getColumnIndex("score")));

            String[] choices = new String[4];

            for (int i = 1 ; i <= 4 ; i++)
                choices[i-1] = cursor.getString(cursor.getColumnIndex("choice"+i));

            returnBean.setChoices(choices);
            return returnBean;
        }
        else
            return null;
    }

    public ArrayList<QuestionBean> select(){

        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.query(table, null, null, null, null, null, null);
        questionBeans.clear();

        while (cursor.moveToNext()){

            QuestionBean returnBean = new QuestionBean();
            returnBean.setId(cursor.getColumnIndex("id"));
            returnBean.setType(cursor.getInt(cursor.getColumnIndex("type")));
            returnBean.setQuestion(cursor.getString(cursor.getColumnIndex("question")));
            returnBean.setAnswer(cursor.getInt(cursor.getColumnIndex("answer")));
            returnBean.setScore(cursor.getInt(cursor.getColumnIndex("score")));

            String[] choices = new String[4];

            for (int i = 1 ; i < 5 ; i++)
                choices[i-1] = cursor.getString(cursor.getColumnIndex("choice"+i));

            returnBean.setChoices(choices);
            questionBeans.add(returnBean);
        }
       return questionBeans;
    }

    public int update(QuestionBean bean){

        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        QuestionBean returnBean = new QuestionBean();

        values.put("id", bean.getId());
        values.put("type", bean.getType());
        values.put("question", bean.getQuestion());
        values.put("score", bean.getScore());
        values.put("answer", bean.getAnswer());

        for(int i = 0 ; i < bean.getChoices().length ; i++){
            int index = i+1;
            values.put("choice"+index, bean.getChoices()[i]);
        }
        return database.update(table, values, "id=?", new String[]{String.valueOf(bean.getId())});
    }

    public int delete(int id){

        SQLiteDatabase database = getWritableDatabase();
        return database.delete(table, "id=?", new String[]{String.valueOf(id)});
    }
}
