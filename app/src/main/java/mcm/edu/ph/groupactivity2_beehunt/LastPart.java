package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastPart extends AppCompatActivity implements View.OnClickListener {

    int LastPage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_part);

        Button btnNext = findViewById(R.id.txtEnd);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {

        TextView lastpart = findViewById(R.id.txtEnd);
        Intent Last = new Intent(LastPart.this, MainActivity.class);

        switch (view.getId()) {
            case R.id.btnInsideHouse:
                if (LastPage  == 1) {
                    lastpart.setText("You look back at her.");
                    LastPage ++;
                }
                else if (LastPage == 2) {
                    lastpart.setText(" Thats when the bees starts to swarm her.");
                    LastPage ++;
                }
                else if (LastPage  == 3) {
                    lastpart.setText("And she vanishes");
                    LastPage ++;
                }

                else if (LastPage  == 4 ) {
                    startActivity(Last);
                }
                break;
        }
    }
}