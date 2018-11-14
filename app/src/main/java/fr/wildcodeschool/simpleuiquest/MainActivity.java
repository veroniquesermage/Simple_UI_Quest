package fr.wildcodeschool.simpleuiquest;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText fnTxt = findViewById(R.id.editText2);

        final EditText lnTxt = findViewById(R.id.editText3);

        final TextView welcomeTxt = findViewById(R.id.textView);

        final Button button = findViewById(R.id.button);

        final CheckBox isWilder = findViewById(R.id.checkBox);

        isWilder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isWilder.isChecked()) {

                    fnTxt.setEnabled(true);
                    lnTxt.setEnabled(true);

                    button.setOnClickListener(new View.OnClickListener() {

                        public void onClick(View v) {
                            Context context = getApplicationContext();

                            String lText = lnTxt.getText().toString();
                            String fText = fnTxt.getText().toString();


                            if (lText.matches("") || fText.matches("")) {
                                CharSequence textError = "Please fill your firstname and lastname";
                                int duration = Toast.LENGTH_SHORT;

                                Toast toast = Toast.makeText(context, textError, duration);
                                toast.show();

                                toast.setGravity(Gravity.BOTTOM | Gravity.BOTTOM, 0, 0);
                            } else {
                                CharSequence text = "Congratulation " + fnTxt.getText() + " " + lnTxt.getText();

                                int duration = Toast.LENGTH_SHORT;

                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();

                                toast.setGravity(Gravity.BOTTOM | Gravity.BOTTOM, 0, 0);
                            }

                        }
                    });
                } else {
                    fnTxt.setEnabled(false);
                    lnTxt.setEnabled(false);

                }
            }
        });
    }
}