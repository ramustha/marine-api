/* 
 * GGASentence.java
 * Copyright (C) 2010 Kimmo Tuukkanen
 * 
 * This file is part of Java Marine API.
 * <http://sourceforge.net/projects/marineapi/>
 * 
 * Java Marine API is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Java Marine API is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java Marine API. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.marineapi.nmea.sentence;

import net.sf.marineapi.nmea.util.GpsFixQuality;
import net.sf.marineapi.nmea.util.Units;

/**
 * Interface for GGA sentence type. Global Positioning System fix data; time,
 * position and other fix related data for a GPS receiver.
 * <p>
 * Example:<br>
 * <code>$GPGGA,120044,6011.552,N,02501.941,E,1,00,2.0,28.0,M,19.6,M,,*79</code>
 * 
 * @author Kimmo Tuukkanen
 * @version $Revision$
 */
public interface GGASentence extends PositionSentence, TimeSentence {

    /**
     * Altitude presented in meters.
     */
    public final static char ALT_UNIT_METERS = 'M';

    /**
     * Altitude presented in feet.
     */
    public final static char ALT_UNIT_FEET = 'f';

    /**
     * Get antenna altitude above mean sea level.
     * 
     * @return Altitude value
     */
    double getAltitude();

    /**
     * Gets the altitude units, meters or feet.
     * 
     * @return Units enum
     */
    Units getAltitudeUnits();

    /**
     * Gets the age of differential GPS data (DGPS).
     * 
     * @return Seconds since last valid RTCM transmission
     */
    double getDgpsAge();

    /**
     * Gets the ID of DGPS station.
     * 
     * @return Station ID (0000-1024)
     */
    String getDgpsStationId();

    /**
     * Get the GPS fix quality.
     * 
     * @return GpsFixQuality enum
     */
    GpsFixQuality getFixQuality();

    /**
     * Get height/separation of geoid above WGS84 ellipsoid, i.e. difference
     * between WGS-84 earth ellipsoid and mean sea level. Negative values are
     * below WGS-84 ellipsoid.
     * 
     * @return Height value
     */
    double getGeoidalHeight();

    /**
     * Get units of height above geoid.
     * 
     * @return Units of geoidal height value
     */
    Units getGeoidalHeightUnits();

    /**
     * Get the horizontal dilution of precision (HDOP), i.e. the relative
     * accuracy of horizontal position.
     * 
     * @return Horizontal dilution
     */
    double getHorizontalDOP();

    /**
     * Get the number of active satellites in use.
     * 
     * @return Number of satellites
     */
    int getSatelliteCount();

    /**
     * Set the antenna altitude.
     * 
     * @param alt Altitude to set
     */
    void setAltitude(double alt);

    /**
     * Sets the unit of altitude.
     * 
     * @param unit Units to set
     */
    void setAltitudeUnits(Units unit);

    /**
     * Sets the age of differential GPS data (DGPS).
     * 
     * @param age Seconds since last valid RTCM transmission to set.
     */
    void setDgpsAge(double age);

    /**
     * Sets the ID of DGPS station.
     * 
     * @param id Station ID to set
     */
    void setDgpsStationId(String id);

    /**
     * Sets the GPS fix quality.
     * 
     * @param quality Fix quality to set
     */
    void setFixQuality(GpsFixQuality quality);

    /**
     * Set height/separation of geoid above WGS84 ellipsoid, i.e. difference
     * between WGS-84 earth ellipsoid and mean sea level. Negative values are
     * below WGS-84 ellipsoid.
     * 
     * @param height Height value to set
     */
    void setGeoidalHeight(double height);

    /**
     * Get unit of height above geoid.
     * 
     * @param unit Unit to set
     */
    void setGeoidalHeightUnits(Units unit);

    /**
     * Set the horizontal dilution of precision (HDOP), i.e. the relative
     * accuracy of horizontal position.
     * 
     * @param hdop Horizontal dilution
     */
    void setHorizontalDOP(double hdop);

}
