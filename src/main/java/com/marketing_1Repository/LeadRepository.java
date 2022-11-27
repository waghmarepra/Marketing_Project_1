package com.marketing_1Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing_1.Entity.LeadEntity;

public interface LeadRepository extends JpaRepository<LeadEntity, Long> {

}
