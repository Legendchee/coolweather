package bnuz.edu.cn.ljqweather.gson;

import com.google.gson.Gson;

import java.util.List;

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
