package sia.tacocloud.tacos.data;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.tacos.Order;

import java.util.List;

@Table
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);
}
