package com.cloudVendor.restAPI.Controller;

import com.cloudVendor.restAPI.Model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
//        return new CloudVendor("C1", "Vendo r1",
//                "Address1", "xxxxxx");

        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "CloudVendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "CloudVendor Details Updated Successfully";
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(){
        this.cloudVendor = null;
        return "CloudVendor Detail Deleted Successfully";
    }
}