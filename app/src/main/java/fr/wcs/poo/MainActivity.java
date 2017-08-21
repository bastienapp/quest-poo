package fr.wcs.poo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.vehicle_type);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vehicule_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                LinearLayout form = (LinearLayout) findViewById(R.id.vehicle_form);
                form.setVisibility(i > 0 ? View.VISIBLE : View.GONE);

                EditText type = (EditText) findViewById(R.id.type);
                EditText kilometers = (EditText) findViewById(R.id.kilometers);
                EditText hours = (EditText) findViewById(R.id.hours);
                switch (i) {
                    case 1:
                        // car
                        type.setVisibility(View.GONE);
                        kilometers.setVisibility(View.VISIBLE);
                        hours.setVisibility(View.GONE);
                        break;

                    case 2:
                        // boat
                        type.setVisibility(View.VISIBLE);
                        kilometers.setVisibility(View.GONE);
                        hours.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
