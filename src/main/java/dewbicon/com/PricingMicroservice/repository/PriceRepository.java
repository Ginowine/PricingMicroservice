package dewbicon.com.PricingMicroservice.repository;

import dewbicon.com.PricingMicroservice.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
