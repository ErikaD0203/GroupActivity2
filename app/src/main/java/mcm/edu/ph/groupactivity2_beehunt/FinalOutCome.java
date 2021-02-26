package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalOutCome extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_out_come);

        Button Proceed = findViewById(R.id.btnFinalOutCome);
        Proceed.setOnClickListener(this);

        TextView PathDecision = findViewById(R.id.txtPathOutcome);
        Intent last = getIntent();

        boolean goodbye = last.getBooleanExtra("ByeB***", true);

        if (goodbye == true ) {
            PathDecision.setText("you immediately ran towards the path. " );
        }
        else {
            PathDecision.setText("she smiles back at you");
        }


    }
    @Override
    public void onClick(View v) {
        Intent next = new Intent(FinalOutCome.this, LastPart.class);

        switch (v.getId()) {
            case R.id.btnFinalOutCome:
                startActivity(next);
                break;
        }

    }
}