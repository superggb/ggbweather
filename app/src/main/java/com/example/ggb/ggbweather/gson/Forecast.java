package com.example.ggb.ggbweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GGB on 2017/11/7.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
