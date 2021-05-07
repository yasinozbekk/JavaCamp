package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICostumerService {

	public void Save(Customer customer) {
		System.out.println("Veri tabanưna kaydedildi : " + customer.FirstName);
	}

}
