package de.telran.g_280323_m_be_security.repo;

import de.telran.g_280323_m_be_security.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
