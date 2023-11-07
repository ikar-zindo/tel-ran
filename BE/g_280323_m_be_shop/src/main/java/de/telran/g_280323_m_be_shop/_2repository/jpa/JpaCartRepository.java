package de.telran.g_280323_m_be_shop._2repository.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.jpa.JpaCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCartRepository extends JpaRepository<JpaCart, Integer> {
}
