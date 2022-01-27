package fr.centralesupelec.galtier.block01_part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // the 2 buttons defined in the activity_main.xml file
    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // display the GUI defined in the activity_main.xml file
        setContentView(R.layout.activity_main);

        // retrieve references to the Views defined in the activity_main.xml
        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);
        buttonPink = (Button) findViewById(R.id.button_pinkPanther);

        // attach the current activity as a click listener for both buttons
        buttonBlue.setOnClickListener(this);
        buttonPink.setOnClickListener(this);
    }

    /**
     * called by the onClick method
     * @param v the button which was clicked
     */
    public void toDo(View v) {
        if (v.equals(buttonBlue))
            // buttonBlue was clicked
            // turn the button invisible
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            // buttonPink was clicked
            // display a pop-up message for a short duration
            Toast.makeText(getApplicationContext(),
                    "to do to do to do...",
                    Toast.LENGTH_SHORT).show();
    }

    /**
     * called when one of the buttons is clicked
     * @param v the View which triggered the notification of the listener:
     *          should refer to buttonBlue or buttonPink
     */
    @Override
    public void onClick(View v) {
        toDo(v);
    }
}