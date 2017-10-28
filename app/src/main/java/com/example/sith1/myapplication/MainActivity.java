package com.example.sith1.myapplication;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Model> mList;
    private ListView listView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);

        mContext=MainActivity.this;

        mList=new ArrayList<>();

        Model m=new Model();
        m.setName("Akshay");
        m.setAge(20);
        m.setSelected(false);

        Model m1=new Model();
        m1.setName("Aniket");
        m1.setAge(20);
        m1.setSelected(false);

        Model m2=new Model();
        m2.setName("Pooja");
        m2.setAge(20);
        m2.setSelected(false);

        Model m3=new Model();
        m3.setName("Atul");
        m3.setAge(20);
        m3.setSelected(false);

        Model m4=new Model();
        m4.setName("Sunil");
        m4.setAge(20);
        m4.setSelected(false);

        Model m5=new Model();
        m5.setName("Aditya");
        m5.setAge(20);
        m5.setSelected(false);

        Model m6=new Model();
        m6.setName("Lopesh");
        m6.setAge(20);
        m6.setSelected(false);

        Model m7=new Model();
        m7.setName("Dora");
        m7.setAge(20);
        m7.setSelected(false);

        Model m8=new Model();
        m8.setName("Kiran");
        m8.setAge(20);
        m8.setSelected(false);

        Model m9=new Model();
        m9.setName("drtyt");
        m9.setAge(20);
        m9.setSelected(false);

        Model m10=new Model();
        m10.setName("adewf");
        m10.setAge(20);
        m10.setSelected(false);

        Model m11=new Model();
        m11.setName("gghth");
        m11.setAge(20);
        m11.setSelected(false);

        Model m12=new Model();
        m12.setName("ds");
        m12.setAge(20);
        m12.setSelected(false);

        Model m13=new Model();
        m13.setName("wee");
        m13.setAge(20);
        m13.setSelected(false);

        Model m14=new Model();
        m14.setName("rfg");
        m14.setAge(20);
        m14.setSelected(false);

        Model m15=new Model();
        m15.setName("sad");
        m15.setAge(20);
        m15.setSelected(false);

        Model m16=new Model();
        m16.setName("gh");
        m16.setAge(20);
        m16.setSelected(false);


        Model m17=new Model();
        m17.setName("fg");
        m17.setAge(20);
        m17.setSelected(false);

        Model m18=new Model();
        m18.setName("asd");
        m18.setAge(20);
        m18.setSelected(false);

        Model m19=new Model();
        m19.setName("dfg");
        m19.setAge(20);
        m19.setSelected(false);

        Model m20=new Model();
        m20.setName("dfgd");
        m20.setAge(20);
        m20.setSelected(false);


        mList.add(m);
        mList.add(m1);
        mList.add(m2);
        mList.add(m3);
        mList.add(m4);
        mList.add(m5);
        mList.add(m6);
        mList.add(m7);
        mList.add(m8);
        mList.add(m9);
        mList.add(m10);
        mList.add(m11);
        mList.add(m12);
        mList.add(m13);
        mList.add(m14);
        mList.add(m15);
        mList.add(m16);
        mList.add(m17);
        mList.add(m18);
        mList.add(m19);
        mList.add(m20);



        listView.setAdapter(new Adapter(mContext,mList));


    }
}
