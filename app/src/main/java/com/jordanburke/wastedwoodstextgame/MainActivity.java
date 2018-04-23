package com.jordanburke.wastedwoodstextgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.character_creation_button)
    protected Button submitButton;
    @BindView(R.id.character_name)
    protected EditText characterName;
    @BindView(R.id.character_hair_color)
    protected EditText characterHairColor;
    @BindView(R.id.character_favorate_song)
    protected EditText characterFavorateSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.character_creation_button)
    protected void submitOnClicked() {

        String finalCharacterName = characterName.getText().toString();
        String finalCharacterHairColor = characterHairColor.getText().toString();
        String finalCharacterFavorateSong = characterFavorateSong.getText().toString();

        Intent characterFinished = new Intent(this, ChapterSelectionActivity.class);
        characterFinished.putExtra("CHARACTER_NAME", finalCharacterName);
        characterFinished.putExtra("CHARACTER_HAIR_COLOR", finalCharacterHairColor);
        characterFinished.putExtra("CHARACTER_FAV_SONG", finalCharacterFavorateSong);
        startActivity(characterFinished);
    }
}
