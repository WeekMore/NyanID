package moe.takanashihoshino.nyaniduserserver.SqlUtils.Repository;

import moe.takanashihoshino.nyaniduserserver.SqlUtils.Yggdrasil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface YggdrasilRepository extends JpaRepository<Yggdrasil, String>, Serializable {
}
