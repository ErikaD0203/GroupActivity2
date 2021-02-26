package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatDecision extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_decision);

        Button Proceed = findViewById(R.id.btnChat);
        Proceed.setOnClickListener(this);

        TextView ChatOutcome = findViewById(R.id.txtTalkoutcome);
        TextView you = findViewById(R.id.txtYou);
        Intent chatdecision = getIntent();

        boolean Truth = chatdecision.getBooleanExtra("Truth", true);


        if (Truth == true) {
            ChatOutcome.setText("You tell the truth. ");
            you.setText("Because i was jogging and accidentally hit their hive ");
        } else {
            ChatOutcome.setText("You tell a Lie");
            you.setText("They started attacking me out of nowhere!");
        }
    }

    @Override
    public void onClick(View v) {

        Intent dChat = new Intent(ChatDecision.this, ChatConvo.class);

        switch (v.getId()) {
            case R.id.btnChat:
                startActivity(dChat);
                break;
        }

    }
}