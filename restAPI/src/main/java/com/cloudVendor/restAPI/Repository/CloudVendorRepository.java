package com.cloudVendor.restAPI.Repository;

import com.cloudVendor.restAPI.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
