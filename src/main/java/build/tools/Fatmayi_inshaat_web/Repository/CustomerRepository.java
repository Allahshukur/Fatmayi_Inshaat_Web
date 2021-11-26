package build.tools.Fatmayi_inshaat_web.Repository;

import build.tools.Fatmayi_inshaat_web.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
