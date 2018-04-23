package com.jordanburke.wastedwoodstextgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.nio.channels.InterruptedByTimeoutException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChapterSelectionActivity extends AppCompatActivity {

    @BindView(R.id.chapter_one_button)
    protected Button chapterOneButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_selection);
        ButterKnife.bind(this);
        Bundle name = getIntent().getExtras();
    }

    @OnClick(R.id.chapter_one_button)
    protected void chapterOneButtonPressed() {
        Intent chapterOneBegin = new Intent(this, ChapterOnePageOneActivity.class);
        startActivity(chapterOneBegin);

    }
}
