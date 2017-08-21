package fr.wcs.poo;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by bkrettly on 21/08/17.
 */

public class VehicleCar extends Vehicle {

    private String kilometers;

    public VehicleCar(String brand, String model, String fuel, String power, String year, String kilometers) {
        super(brand, model, fuel, power, year);
        setKilometers(kilometers);
    }

    private void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public Drawable getVehicleIcon(Context context) {
        return context.getResources().getDrawable(R.drawable.ic_directions_car_black_24dp);
    }
}
