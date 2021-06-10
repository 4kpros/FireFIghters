package com.example.firefighters.viewmodels;

import android.app.Activity;

import com.example.firefighters.models.FireTruckModel;
import com.example.firefighters.models.FireTruckModel;
import com.example.firefighters.repositories.FireTruckRepository;
import com.example.firefighters.repositories.FireTruckRepository;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FireTruckViewModel extends ViewModel {

    private MutableLiveData<QuerySnapshot> queryMutableLiveData;
    private MutableLiveData<QuerySnapshot> querySnapshotMutableLiveData;
    private MutableLiveData<Boolean> isLoadingQueryMutableLiveData;
    private MutableLiveData<Boolean> isLoadingReadMutableLiveData;
    private MutableLiveData<Boolean> isLoadingWriteMutableLiveData;

    private FireTruckRepository repository;

    public void init() {
        if (repository != null)
            return;
        repository = FireTruckRepository.getInstance();

        queryMutableLiveData = repository.bindQuery();
        querySnapshotMutableLiveData = repository.bindQuerySnapshot();
        isLoadingQueryMutableLiveData = repository.bindIsLoadingQuery();
        isLoadingReadMutableLiveData = repository.bindIsLoadingRead();
        isLoadingWriteMutableLiveData = repository.bindIsLoadingWrite();
    }

    public MutableLiveData<QuerySnapshot> getFireTrucksQuery(Activity activity) {
        return queryMutableLiveData;
    }
    public MutableLiveData<QuerySnapshot> getFireTrucksQuerySnapshot(Activity activity) {
        return querySnapshotMutableLiveData;
    }

    public void loadFireTrucksQuery(Activity activity) {
        repository.loadFireTrucksQuery(activity);
    }
    public void loadFireTrucksQuerySnapshot(Activity activity) {
        repository.loadFireTrucksQuerySnapshot(activity);
    }
    public void saveFireTruckPoint(FireTruckModel fireTruckModel, Activity activity) {
        repository.saveFireTruckPoint(fireTruckModel, activity);
    }
    public void deleteFireTruckPoint(FireTruckModel fireTruckModel, Activity activity) {
        repository.deleteFireTruckPoint(fireTruckModel, activity);
    }
}
