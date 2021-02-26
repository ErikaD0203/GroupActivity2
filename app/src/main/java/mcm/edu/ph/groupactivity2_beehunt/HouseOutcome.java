package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HouseOutcome extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_outcome);

        Button housebutton = findViewById(R.id.btnHouse);
        housebutton.setOnClickListener(this);

        TextView PathDecision = findViewById(R.id.txtPathOutcome);
        Intent outcome= getIntent();

        boolean houseoutcome = outcome.getBooleanExtra("HouseOutcome", true);

        if (houseoutcome == true) {
            PathDecision.setText("The Bees noticed your panicking and aggressively fly towards you. " );
        } else {
            PathDecision.setText("As you remained calm, you quietly and immediately ran away, but the bees still notices you.");
        }

    }

    @Override
    public void onClick (View view) {

        Intent OutcomeHouse = new Intent(HouseOutcome.this, HouseStoryAfter.class);
        switch (view.getId()) {
            case R.id.btnHouse:
                startActivity(OutcomeHouse);
                break;
        }

    }
}