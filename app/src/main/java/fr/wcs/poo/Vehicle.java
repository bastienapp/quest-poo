package fr.wcs.poo;

import android.content.Context;
import android.graphics.drawable.Drawable;

import static android.util.Base64.CRLF;

/**
 * Created by bkrettly on 21/08/17.
 */

class Vehicle {

    private String brand;
    private String model;
    private String fuel;
    private String power;
    private String year;

    Vehicle(String brand, String model, String fuel, String power, String year) {
        setBrand(brand);
        setModel(model);
        setFuel(fuel);
        setPower(power);
        setYear(year);
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setFuel(String fuel) {
        this.fuel = fuel;
    }

    private void setPower(String power) {
        this.power = power;
    }

    private void setYear(String year) {
        this.year = year;
    }

    public String getDescription(Context context) {
        String lineSep = System.getProperty("line.separator");
        return context.getResources().getString(R.string.brand) + " : " + brand + lineSep
                + context.getResources().getString(R.string.model) + " : " + model + lineSep
                + context.getResources().getString(R.string.fuel) + " : " + fuel + lineSep
                + context.getResources().getString(R.string.power) + " : " + power + lineSep
                + context.getResources().getString(R.string.year) + " : " + year + lineSep;
    }

    public Drawable getVehicleIcon(Context context) {
        return null;
    }
}
