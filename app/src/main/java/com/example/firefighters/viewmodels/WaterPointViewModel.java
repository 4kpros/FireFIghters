package com.example.firefighters.viewmodels;

import com.example.firefighters.models.WaterPointModel;
import com.example.firefighters.repositories.WaterPointRepository;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class WaterPointViewModel extends ViewModel {
    private WaterPointRepository repository;

    public void init() {
        if (repository != null)
            return;
        repository = WaterPointRepository.getInstance();
    }
    public LiveData<QuerySnapshot> getAllWaterPointsQuery() {
        return repository.getAllWaterPointsQuery();
    }
    public LiveData<QuerySnapshot> getWaterPointsQuery(DocumentSnapshot lastDocument, int limitCount) {
        return repository.getWaterPointsQuery(lastDocument, limitCount);
    }
    public LiveData<QuerySnapshot> getWaterPointsQuerySnapshot() {
        return repository.getWaterPointsQuerySnapshot();
    }
    public LiveData<WaterPointModel> getWaterPointModel(int id) {
        return repository.getWaterPointModel(id);
    }

    public LiveData<Integer> saveWaterPoint(WaterPointModel waterPointModel ) {
        return repository.saveWaterPoint(waterPointModel);
    }
    public LiveData<Integer> deleteWaterPoint(WaterPointModel waterPointModel ) {
        return repository.deleteWaterPoint(waterPointModel);
    }
    public LiveData<Integer> updateWaterPoint(WaterPointModel waterPointModel ) {
        return repository.updateWaterPoint(waterPointModel);
    }

}
