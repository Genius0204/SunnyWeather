package com.sunnyweather.android.logic.model

/**
 * 封装DailyResponse和RealtimeResponse对象
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)
