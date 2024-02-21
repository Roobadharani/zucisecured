package com.zuci.ZuciIStay.repository;

import com.zuci.ZuciIStay.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelBookingRepository extends JpaRepository<Booking,Integer> {
    public Optional<Booking> findByUsername(String username);
}