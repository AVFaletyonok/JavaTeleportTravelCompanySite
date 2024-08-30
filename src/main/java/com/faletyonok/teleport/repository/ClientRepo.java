package com.faletyonok.teleport.repository;

import com.faletyonok.teleport.entity.ClientProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alexander Victorovich Faletyonok
 * @version 1.0
 * <p>
 *     Test web application "Java Teleport Travel Company"
 * </p>
 * https://github.com/AVFaletyonok/JavaTeleportTravelCompanySite
 */
@Repository
public interface ClientRepo extends JpaRepository<ClientProfile, Long> {

}