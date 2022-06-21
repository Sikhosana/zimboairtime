package com.upheaval.zimboairtime.Repository;

import com.upheaval.zimboairtime.Model.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends MongoRepository<Vendor, String> {
}
