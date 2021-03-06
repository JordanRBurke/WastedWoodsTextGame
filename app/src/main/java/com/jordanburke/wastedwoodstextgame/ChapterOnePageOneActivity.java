package com.jordanburke.wastedwoodstextgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    @BindView(R.id.inventory_button)
    protected Button inventoryButton;
    private InventoryFragment inventoryFragment;
    private int positionButton = 0;
    private double randomNumber;
    private boolean swordPickedUp = false;
    private boolean fragmentActive = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_one_page_one);
        ButterKnife.bind(this);
    }

    @Override
    public void onBackPressed() {

        if (fragmentActive) {
            getSupportFragmentManager().beginTransaction().remove(inventoryFragment);
        } else {
            super.onBackPressed();
        }

    }

    @OnClick(R.id.inventory_button)
    protected void inventoryButtonClicked() {
        fragmentActive = true;
        inventoryFragment = InventoryFragment.newInstance();


        getSupportFragmentManager().beginTransaction().replace(R.id.chapter_frame_layout, inventoryFragment).commit();

    }



    @OnClick(R.id.first_path_button)
    protected void firstPathButtonClicked() {
        randomNumber = Math.random()*14+1;

        positionButton++;
        if (positionButton == 1) {

            // Extension out of first path
            storyPage.setText("You run down the path deciding that it would be the most " +
                    "reasonable path. The branches make loud crunches as you run overtop " +
                    "of them, while avoiding any large tree limbs in the way. The path en" +
                    "ds abruptly at the next turn where a large tree has fallen, blocking the path. \n" +
                    "Panic begins too consume you as you struggle to find a new exit route. There" +
                    " is no way to get around the blocked path and you are cornered by what was " +
                    "chasing you. You turn around to a huge looming figure in the distance, his face " +
                    "covered by darkness. There are only two options that you can think of, attack " +
                    "before he gets closer or attempt to climb over the tree.");
            firstPath.setText("Attack");
            secondPath.setText("Climb");
        } else if (positionButton == 2) {
            positionButton++;
            // Extends out of First Path
            // Extends out of Attack Path
            storyPage.setText("You decide to get the figure before it gets you. You pick up a " +
                    "big branch from off the ground and approach the figure. Upon clo" +
                    "ser examination you see extra limbs and other extra body parts that" +
                    " rule out the possibility of it being human, this shocks you and yo" +
                    "u hesitate to go forward, but you gather your senses and begin to engage" +
                    " the creature. The creature gets knocked back by your initial blow and" +
                    " falls back. Would you like to run while you have a chance or keep fighting it?");
            firstPath.setText("Run");
            secondPath.setText("Fight");
            Toast.makeText(this, "You have equipped branch!", Toast.LENGTH_LONG).show();


        } else if (positionButton == 3) {
            

        } else if (randomNumber == 2 || randomNumber == 5 ) {
            storyPage.setText("The creature catches up to you *You are engaged in battle* \n What would you like too do? ");
            firstPath.setText("Attack");
            secondPath.setText("Evade");
        } else if (randomNumber == 3 || randomNumber == 7 & swordPickedUp == false) {
            storyPage.setText("You approach a cave to the side of the path and notice something" +
                    " glowing inside, realizing you have no idea what it could be you prepare for " +
                    "anything, when you get are about 2 feet away from the object you notice it's a " +
                    "sword glowing with a radiant light");
            firstPath.setText("Take");
            secondPath.setText("Leave");
            swordPickedUp = true;

        }


    }

    @OnClick(R.id.second_path_button)
    protected void secondPathClicked() {

        positionButton++;
        if (positionButton == 1) {

            positionButton++;
            storyPage.setText("You run down the path deciding that the cabin would be the best " +
                    "place too avoid the mysterious figure behind him. You run down the path " +
                    "panting praying that the cabin is the safe haven you want it too be. The " +
                    "cabin is blanketed by darkness from the trees canopy which makes it very " +
                    "difficult too navigate too. You approach the door and find that it is locked " +
                    "from the inside, noticing that the foot steps are still approaching you decide" +
                    " you either have to break the door handle or keep going past the cabin. " +
                    "Which one do you choose?");
            firstPath.setText("Break Door");
            secondPath.setText("Pass Cabin");

        } else if (positionButton == 2) {
            positionButton++;
            storyPage.setText("You attempt to climb over the tree branch, this takes some" +
                    " time but you barely manage to escape the arm reach of the entity, when" +
                    " looking back to see if he was still following you see multiple limbs" +
                    " that throw themselves at the tree splitting it in two. You begin too " +
                    "run down the path that was behind the tree, this path is very narrow and" +
                    " you are dodging trees and tree trunks often. You trip on a branch " +
                    "about 2 minutes down the trail. Do you try and hide in the brush or keep" +
                    " running?");
            firstPath.setText("Hide");
            secondPath.setText("Run");

        } else if (positionButton == 3) {

        }


    }


}
