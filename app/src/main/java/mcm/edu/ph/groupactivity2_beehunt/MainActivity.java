package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNext = findViewById(R.id.btnProceed);
        btnNext.setOnClickListener(this);
        }

    @Override
    public void onClick (View v) {

        TextView prologueStory = findViewById(R.id.txtStory);
        Intent next = new Intent(this, Story.class);

        switch (v.getId()) {
            case R.id.btnProceed:
                startActivity(next);
                break;
        }
    }
}