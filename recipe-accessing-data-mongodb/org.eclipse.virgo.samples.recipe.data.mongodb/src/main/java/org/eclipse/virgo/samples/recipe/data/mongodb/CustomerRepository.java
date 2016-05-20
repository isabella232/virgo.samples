package org.eclipse.virgo.samples.recipe.data.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

//tag::type[]
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
//end::type[]
