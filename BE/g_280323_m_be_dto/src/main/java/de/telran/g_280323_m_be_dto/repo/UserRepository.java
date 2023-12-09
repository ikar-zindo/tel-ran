package de.telran.g_280323_m_be_dto.repo;

import de.telran.g_280323_m_be_dto.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
