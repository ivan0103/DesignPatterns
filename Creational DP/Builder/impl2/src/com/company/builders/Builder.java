package com.company.builders;

import com.company.cars.CarType;
import com.company.components.TripComputer;
import com.company.components.Engine;
import com.company.components.GPSNavigator;
import com.company.components.Transmission;

/**
 * Abstract Builder
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}