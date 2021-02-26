package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsideTheHouseDecision extends AppCompatActivity implements View.OnClickListener {

    boolean Open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_the_house_decision);

        Button btn1st = findViewById(R.id.btnOpen);
        Button btn2nd = findViewById(R.id.btnStay);

        btn1st.setOnClickListener(this);
        btn2nd.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        Intent insidehouse = new Intent(InsideTheHouseDecision.this, HouseOutcome.class);

        switch (view.getId()) {
            case R.id.btnOpen:
                Open= true;
                insidehouse .putExtra("Opened", Open);
                startActivity(insidehouse);
                break;

            case R.id.btnStay:
                Open = false;
                insidehouse.putExtra("Opened",Open);
                startActivity(insidehouse);
                break;
        }
    }
}