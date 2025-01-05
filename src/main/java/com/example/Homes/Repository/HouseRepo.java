package com.example.Homes.Repository;

import com.example.Homes.Model.Houses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public interface HouseRepo extends JpaRepository<Houses, Long> {
    @Query(value = "SELECT avg(sale_price) from Houses", nativeQuery = true)
    double averageSalePrice();

    @Query(value = "SELECT max(sale_price) from Houses", nativeQuery = true)
    long maxSalaPrice();

    @Query(value = "SELECT min(sale_price) from Houses", nativeQuery = true)
    long minSalePrice();

    @Query(value = "select  location, avg(sale_price) as Average_sale_price from Houses group by location", nativeQuery = true)
    List<Map<String, Double>> averageSalePriceByLocation();
}
