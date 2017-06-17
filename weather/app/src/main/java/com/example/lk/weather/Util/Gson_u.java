package com.example.lk.weather.Util;

import org.json.JSONArray;
import org.json.JSONObject;

import com.example.lk.weather.gson.Weather;



public class Gson_u {
    public Gson_u()
    {

    }
    public static Weather parseWeatherResponse(String response)
    {
        try{
            JSONObject jsonObject =new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new com.google.gson.Gson().fromJson(weatherContent,Weather.class);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
