package com.decorontario.xyz.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
    @GetMapping
    public List<Customer> getCustomer() {
        return List.of(new Customer( 1L,"Nahian Tafsir",
                "nahiantafsir@gmail.com",
                "44 Nazrul Avenue, Comilla, Bangladesh",
                "Male",
                LocalDate.of(1996, Month.MAY, 31)
        ));
    }
}
