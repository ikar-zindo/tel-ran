package de.telran.g_280323_m_be_dto.service;

import de.telran.g_280323_m_be_dto.domain.dto.UserDto;
import de.telran.g_280323_m_be_dto.domain.entity.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserMappingService {

   private DogMappingService dogMappingService;

   public UserMappingService(DogMappingService dogMappingService) {
      this.dogMappingService = dogMappingService;
   }

   public UserDto mapToUserDto(User entity) {
      UserDto dto = new UserDto();

      dto.setId(entity.getId());
      dto.setName(entity.getName());
      dto.setPassword("password is hidden");
      dto.setMoney(new BigDecimal(0));
      dto.setDog(dogMappingService.mapToDto(entity.getDog()));

      return dto;
   }

   public User UserDtoToEntity(UserDto dto) {
      User entity = new User();

      entity.setId(0);
      entity.setName(dto.getName());
      entity.setPassword(String.valueOf(dto.getPassword().hashCode()));
      entity.setMoney(dto.getMoney());
      entity.setDog(dogMappingService.mapToEntity(dto.getDog()));

      return entity;
   }
}
