package com.jordanburke.wastedwoodstextgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChapterOnePageOneActivity extends AppCompatActivity {

    @BindView(R.id.first_path_button)
    protected Button firstPath;
    @BindView(R.id.second_path_button)
    protected Button secondPath;
    @BindView(R.id.story_page_view)
    protected TextView storyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_one_page_one);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.first_path_button)
    protected void firstPathButtonClicked() {
        int position = 0;
        position++;
        storyPage.setText("You run down the path deciding that it would be the most " +
                "reasonable path. The branches make loud crunches as you run overtop " +
                "of them, while avoiding any large tree limbs in the way. The path en" +
                "ds abruptly at the next turn where a large tree has fallen, blocking the path. \n" +
                "Panic begins too consume you as you struggle to find a new exit route. There" +
                " is no way to go get past the blocked path and you are cornered by what was " +
                "chasing you. You turn around to a huge looming figure in the distance, his face " +
                "covered by darkness. There are only two options that you can think of, attack " +
                "before he gets closer or attempt to climb the tree.");
        firstPath.setText("Attack");
        secondPath.setText("Climb");

        if (position == 2) {
            storyPage.setText("You decide to get it before it gets you. You pick up a " +
                    "big branch from off the ground and approach the figure. Upon clo" +
                    "ser examination you see extra limb and other extra body parts that" +
                    " rule out the possibility of it being human, this shocks you and yo" +
                    "u hesitate to go forward, but you gather your senses and begin to engage" +
                    " the creature. The creature gets knocked back by your initial blow and" +
                    " fallback. Would you like to run while you have a chance or keep fighting it?");
        }


    }

    @OnClick(R.id.second_path_button)
    protected void secondPathClicked() {



    }




}
