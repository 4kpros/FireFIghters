package com.example.firefighters.tools;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class PermissionsManager {

    private static PermissionsManager instance;

    public static PermissionsManager getInstance() {
        if (instance == null)
            instance = new PermissionsManager();
        return instance;
    }

    public boolean isLocationPermissions(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(activity,
                        Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean isCallPermissions(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean isBluetoothPermissions(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.BLUETOOTH) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean isMessagePermissions(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean isAudioRecordingPermissions(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(activity,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(activity,
                        Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }

    public boolean isCameraPermissions(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(activity,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(activity,
                        Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }

    public void requestLocationPermission(Activity activity) {
        ActivityCompat.requestPermissions(
                activity,
                new String[]{
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                },
                ConstantsValues.LOCATION_PERMISSION_CODE
        );
    }

    public void requestCallPermission(Activity activity) {
        ActivityCompat.requestPermissions(
                activity,
                new String[]{
                        Manifest.permission.CALL_PHONE
                },
                ConstantsValues.CALL_PERMISSION_CODE
        );
    }

    public void requestMessagePermission(Activity activity) {
        ActivityCompat.requestPermissions(
                activity,
                new String[]{
                        Manifest.permission.SEND_SMS
                },
                ConstantsValues.SMS_PERMISSION_CODE
        );
    }

    public void requestBluetoothPermission(Activity activity) {
        ActivityCompat.requestPermissions(
                activity,
                new String[]{
                        Manifest.permission.BLUETOOTH
                },
                ConstantsValues.BLUETOOTH_PERMISSION_CODE
        );
    }

    public void requestAudioRecordPermission(Activity activity) {
        ActivityCompat.requestPermissions(
                activity,
                new String[]{
                        Manifest.permission.RECORD_AUDIO,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                },
                ConstantsValues.AUDIO_RECORD_PERMISSION_CODE
        );
    }

    public void requestCameraPermission(Activity activity) {
        ActivityCompat.requestPermissions(
                activity,
                new String[]{
                        Manifest.permission.CAMERA,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                },
                ConstantsValues.CAMERA_PERMISSION_CODE
        );
    }
}
