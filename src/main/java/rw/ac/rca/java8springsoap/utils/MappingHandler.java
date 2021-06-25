package rw.ac.rca.java8springsoap.utils;

import jaxb.classes.SupplierDetails;
import rw.ac.rca.java8springsoap.models.Supplier;

public class MappingHandler {
    public static SupplierDetails mapToSupplierDetails(Supplier supplier){
        SupplierDetails supplierDetails =  new SupplierDetails();

        supplierDetails.setId(supplier.getId());
        supplierDetails.setEmail(supplier.getEmail());
        supplierDetails.setMobile(supplier.getMobile());
        supplierDetails.setNames(supplier.getNames());

        return supplierDetails;
    }
}
