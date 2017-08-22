package fr.wcs.poo;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by bkrettly on 21/08/17.
 */

public class Boat extends Vehicle {

    private String hours;

    Boat(String brand, String model, String hours) {
        super(brand, model);
        setHours(hours);
    }

    private void setHours(String hours) {
        this.hours = hours;
    }

    public String getDescription(Context context) {
        return super.getDescription(context)
                + context.getResources().getString(R.string.hours) + " : " + hours;
    }

    public Drawable getVehicleIcon(Context context) {
        return context.getResources().getDrawable(R.drawable.ic_directions_boat_black_24dp);
    }
}
