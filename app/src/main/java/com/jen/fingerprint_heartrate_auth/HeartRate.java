package com.jen.fingerprint_heartrate_auth;

import java.sql.Timestamp;

public class HeartRate {
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private int heartRate = HeartRateActivity.HEART_RATE_BPM;

    public HeartRate() {
    }

    public HeartRate(Timestamp timestamp, int heartRate) {
        this.timestamp = timestamp;
        this.heartRate = heartRate;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public int getHeartRate() {
        return heartRate;
    }
}
