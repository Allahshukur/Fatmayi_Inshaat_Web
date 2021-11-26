package build.tools.Fatmayi_inshaat_web.Repository;

import build.tools.Fatmayi_inshaat_web.Entity.ToolsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolsRepository extends JpaRepository<ToolsEntity,Long> {

}
