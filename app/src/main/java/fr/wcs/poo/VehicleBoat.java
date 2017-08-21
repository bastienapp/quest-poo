package fr.wcs.poo;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by bkrettly on 21/08/17.
 */

public class VehicleBoat extends Vehicle {

    private String category;
    private String hours;

    VehicleBoat(String brand, String model, String fuel, String power, String year, String category, String hours) {
        super(brand, model, fuel, power, year);
        setCategory(category);
        setHours(hours);
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private void setHours(String hours) {
        this.hours = hours;
    }

    public String getDescription(Context context) {
        String lineSep = System.getProperty("line.separator");
        return super.getDescription(context)
                + context.getResources().getString(R.string.category) + " : " + category + lineSep
                + context.getResources().getString(R.string.hours) + " : " + hours;
    }

    public Drawable getVehicleIcon(Context context) {
        return context.getResources().getDrawable(R.drawable.ic_directions_boat_black_24dp);
    }
}
