package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PathOutOfTheHouse extends AppCompatActivity implements View.OnClickListener {

    char Aight = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_out_of_the_house);

        Button btn1st = findViewById(R.id.btnAightImmaHeadOut);
        Button btn2nd = findViewById(R.id.btnThankYou);

        btn1st.setOnClickListener(this);
        btn2nd.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        Intent OutofSchool = new Intent(PathOutOfTheHouse.this, FinalOutCome.class);

        switch (view.getId()) {
            case R.id.btnAightImmaHeadOut:
                Aight= 'a';
                OutofSchool.putExtra("Truth", Aight);
                startActivity(OutofSchool);
                break;

            case R.id.btnThankYou:
                Aight = 'b';
                OutofSchool.putExtra("Truth", Aight);
                startActivity(OutofSchool);
                break;

        }


    }
}