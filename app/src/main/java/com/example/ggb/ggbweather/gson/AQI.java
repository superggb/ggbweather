package com.example.ggb.ggbweather.gson;

/**
 * Created by GGB on 2017/11/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
