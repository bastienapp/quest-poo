package fr.wcs.poo;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by bkrettly on 21/08/17.
 */

class Vehicle {

    private String brand;
    private String model;

    Vehicle(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public String getDescription(Context context) {
        String lineSep = System.getProperty("line.separator");
        return context.getResources().getString(R.string.brand) + " : " + brand + lineSep
                + context.getResources().getString(R.string.model) + " : " + model + lineSep;
    }

    public Drawable getVehicleIcon(Context context) {
        return null;
    }
}
