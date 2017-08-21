package fr.wcs.poo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Intent intent = getIntent();
        int type = intent.getIntExtra("type", 0);
        String brand = intent.getStringExtra("brand");
        String model = intent.getStringExtra("model");
        String fuel = intent.getStringExtra("fuel");
        String power = intent.getStringExtra("power");
        String year = intent.getStringExtra("year");
        String category = intent.getStringExtra("category");
        String kilometers = intent.getStringExtra("kilometers");
        String hours = intent.getStringExtra("hours");

        Vehicle vehicle = null;
        switch (type) {
            case 1:
                vehicle = new VehicleCar(brand, model, fuel, power, year, kilometers);
                break;

            case 2:
                vehicle = new VehicleBoat(brand, model, fuel, power, year, category, hours);
        }

        if (vehicle != null) {
            ImageView icon = (ImageView) findViewById(R.id.vehicle_icon);
            icon.setImageDrawable(vehicle.getVehicleIcon(VehicleActivity.this));

            TextView description = (TextView) findViewById(R.id.vehicle_description);
            description.setText(vehicle.getDescription(VehicleActivity.this));
        }
    }
}
