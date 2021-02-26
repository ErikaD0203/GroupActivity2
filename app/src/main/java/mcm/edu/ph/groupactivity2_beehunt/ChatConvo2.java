package mcm.edu.ph.groupactivity2_beehunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatConvo2 extends AppCompatActivity implements View.OnClickListener {

    int ChatConvoPage2 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_convo2);

        Button btnconvo2 = findViewById(R.id.btnConvo2);
        btnconvo2.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {

        TextView viewConvo2 = findViewById(R.id.txtViewConvo2);
        TextView Answer = findViewById(R.id.txtAnswerConvo2);
        Intent Convo2 = new Intent(ChatConvo2.this,PathOutOfTheHouse.class);

        switch (view.getId()) {
            case R.id.btnConvo2:
                if (ChatConvoPage2 == 1) {
                    Answer.setText("Knowing that this is a jungle, you shouldn't be here");
                    viewConvo2.setText("The Girl:");
                }
                    else if (ChatConvoPage2== 2) {
                    Answer.setText("The girl looks at the door and sees that it is about to break.");
                    ChatConvoPage2++;
                    }
                    else if (ChatConvoPage2 == 3) {
                    Answer.setText("The door is gonna break any moment, Lets go!");
                    viewConvo2.setText("The Girl:");
                    ChatConvoPage2++;
                    }
                    else if (ChatConvoPage2 == 4) {
                    Answer.setText("You follow her and both of you got out of the house through the back door");
                    ChatConvoPage2++;
                }
                    else if (ChatConvoPage2 == 4) {
                    Answer.setText("And she leads you to a Path");
                    ChatConvoPage2++;
                }
                else if (ChatConvoPage2 == 3) {
                    Answer.setText("Just follow this path and it will lead you out of here");
                    viewConvo2.setText("The Girl:");
                    ChatConvoPage2++;
                }

                else if (ChatConvoPage2 == 5) {
                    startActivity(Convo2);
                }
                break;
        }

    }
}