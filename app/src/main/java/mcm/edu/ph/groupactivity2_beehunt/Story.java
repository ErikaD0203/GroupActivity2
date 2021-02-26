package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Story extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        int Story = 1;

        Button btnNext = findViewById(R.id.btnStory);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {

        Intent next = new Intent(this, StoryPathDecision.class);

        switch (v.getId()) {
            case R.id.btnStory:
                startActivity(next);
                break;
        }
    }
}