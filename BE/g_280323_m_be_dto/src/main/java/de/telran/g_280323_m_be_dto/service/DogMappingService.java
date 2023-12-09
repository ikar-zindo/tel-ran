package de.telran.g_280323_m_be_dto.service;

import de.telran.g_280323_m_be_dto.domain.dto.DogDTO;
import de.telran.g_280323_m_be_dto.domain.entity.Dog;
import org.springframework.stereotype.Service;

@Service
public class DogMappingService {

   public DogDTO mapToDto(Dog entity) {
      DogDTO dto = new DogDTO();

      dto.setId(entity.getId());
      dto.setAge(entity.getAge());
      dto.setName(entity.getName());

      return dto;
   }

   public Dog mapToEntity(DogDTO dto) {
      Dog dog = new Dog();

      dog.setId(dto.getId());
      dog.setAge(dto.getAge());
      dog.setName(dto.getName());

      return dog;
   }
}
