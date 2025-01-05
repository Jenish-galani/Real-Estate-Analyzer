package com.example.Homes.Controller;

import com.example.Homes.Model.Houses;
import com.example.Homes.Service.HousesServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Houses")
public class HousesController {
    @Autowired
    private HousesServ houseServ;

    @PostMapping
    public List<Houses> insertRecords(@RequestBody List<Houses> list) {
        return houseServ.insertRecords(list);
    }

    @GetMapping
    public List<Houses> showAll() {
        return houseServ.showAll();
    }

    @GetMapping("/get-average")
    public double getavg(){
        System.out.print("Average sale price of the houses overall : ");
        return houseServ.averageSalePrice();
    }
    @GetMapping("/max-saleprice")
    public long maxSalaPrice(){
        System.out.print("Max sale price : ");
        return houseServ.maxSalaPrice();
    }
    @GetMapping("/min-saleprice")
    public long minSalePrice(){
        System.out.print("Min sale price : ");
        return houseServ.minSalePrice();
    }
    @GetMapping("/get-average-location")
    public List<Map<String,Double>> averageSalePriceByLocation(){
        System.out.print("Average sale price of the house per location");
        return houseServ.averageSalePriceByLocation();
    }
}
