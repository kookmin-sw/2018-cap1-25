package cp.orbit.common.util;

import org.springframework.stereotype.Repository;

@Repository("cp.orbit.common.util.TokenHandle")
public interface TokenHandle {
	public String tokenKey(String memb_id) throws Exception;
}
