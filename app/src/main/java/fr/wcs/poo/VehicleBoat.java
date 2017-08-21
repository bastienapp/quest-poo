package fr.wcs.poo;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by bkrettly on 21/08/17.
 */

public class VehicleBoat extends Vehicle {

    private String type;
    private String hours;

    VehicleBoat(String brand, String model, String fuel, String power, String year, String type, String hours) {
        super(brand, model, fuel, power, year);
        setType(type);
        setHours(hours);
    }

    private void setType(String type) {
        this.type = type;
    }

    private void setHours(String hours) {
        this.hours = hours;
    }

    public Drawable getVehicleIcon(Context context) {
        return context.getResources().getDrawable(R.drawable.ic_directions_boat_black_24dp);
    }
}
