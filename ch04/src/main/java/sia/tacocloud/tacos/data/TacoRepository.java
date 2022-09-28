package sia.tacocloud.tacos.data;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.tacos.Taco;

@Table
public interface TacoRepository extends CrudRepository<Taco, Long> {

//    Taco save(Taco design);
}
