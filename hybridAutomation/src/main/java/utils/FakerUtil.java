package utils;

import api.models.Customer;
import com.github.javafaker.Faker;


public class FakerUtil {
    private static final Faker faker = new Faker();

    public static Customer buildCustomer() {

        Customer customer = new Customer();

        customer.setFirstName(faker.name().firstName());
        customer.setLastName(faker.name().lastName());
        customer.setAddress(faker.address().streetAddress());
        customer.setCity(faker.address().city());
        customer.setState(faker.address().state());
        customer.setZipCode(faker.address().zipCode());
        customer.setPhone(faker.phoneNumber().cellPhone());
        customer.setSsn("90150");
        customer.setUsername(ConfigReader.get("username"));
        customer.setPassword(ConfigReader.get("password"));
        customer.setRepeatedPassword(ConfigReader.get("password"));

//        String username =
//                customer.getFirstName().toLowerCase()
//                        + System.currentTimeMillis();
//
//        customer.setUsername(username);
//        customer.setPassword("Password123");

        return customer;
    }
}
