package com.example.habib.savemoney;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;

public class ActivityUtama extends AppCompatActivity {
    private static final String TAG = "ActivityUtama";
    int reqcode = 01;

    ImageButton setting, gantiKeuangan;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        setting = findViewById(R.id.setting);
        setting.setOnClickListener(onClickListener);
        gantiKeuangan = findViewById(R.id.gantiKeuangan);
        gantiKeuangan.setOnClickListener(onClickListener);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(onClickListener);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, new FragmentData(), TAG);
        ft.commit();

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case (R.id.setting):
                    Intent intent = new Intent(ActivityUtama.this, ActivitySetting.class);
                    startActivityForResult(intent, reqcode);
                    break;
                case (R.id.gantiKeuangan):
                    Intent intent1 = new Intent(ActivityUtama.this, ActivityGanti.class);
                    startActivityForResult(intent1, reqcode);
                    break;
                case (R.id.fab):
                    Intent i = new Intent(ActivityUtama.this, ActivityTambah.class);
                    startActivity(i);
            }
        }
    };
}
