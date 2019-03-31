package com.example.drivesafe;

import android.os.Bundle;

interface LocationUpdaterListener {
    void onProviderDisabled(String provider);

    void onProviderEnabled(String provider);

    void onStatusChanged(String provider, int status, Bundle extras);
}
