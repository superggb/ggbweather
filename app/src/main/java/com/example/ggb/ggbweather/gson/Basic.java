package com.example.ggb.ggbweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GGB on 2017/11/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
