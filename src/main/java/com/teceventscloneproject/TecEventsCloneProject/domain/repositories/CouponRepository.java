package com.teceventscloneproject.TecEventsCloneProject.domain.repositories;

import com.teceventscloneproject.TecEventsCloneProject.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
