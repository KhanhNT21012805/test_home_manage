package com.nnh.dal.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnh.model.entity.BookingEntity;

public interface BookingRepository extends JpaRepository<BookingEntity, Long> {

}
