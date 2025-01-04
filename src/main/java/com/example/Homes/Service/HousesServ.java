package com.example.Homes.Service;

import com.example.Homes.Model.Houses;
import com.example.Homes.Repository.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousesServ {
    @Autowired
    private HouseRepo houseRepo;

    public List<Houses> insertRecords(List<Houses> list) {
        return houseRepo.saveAll(list);
    }

    public List<Houses> showAll() {
        return houseRepo.findAll();
    }

    public double averageSalePrice(){
        return houseRepo.averageSalePrice();
    }
    public long maxSalaPrice(){
        return houseRepo.maxSalaPrice();
    }
    public long minSalePrice(){
        return houseRepo.minSalePrice();
    }
    public List<Object[]> averageSalePriceByLocation(){
        return houseRepo.averageSalePriceByLocation();
    }
}
