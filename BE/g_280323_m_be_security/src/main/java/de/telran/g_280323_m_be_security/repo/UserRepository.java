package de.telran.g_280323_m_be_security.repo;

import de.telran.g_280323_m_be_security.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

   UserDetails findByUsername(String name);
}
