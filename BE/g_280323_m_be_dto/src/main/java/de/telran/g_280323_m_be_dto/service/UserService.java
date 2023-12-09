package de.telran.g_280323_m_be_dto.service;

import de.telran.g_280323_m_be_dto.domain.dto.UserDto;
import de.telran.g_280323_m_be_dto.domain.entity.User;
import de.telran.g_280323_m_be_dto.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

   private UserRepository repository;

   private UserMappingService mappingService;

   public UserService(UserRepository repository, UserMappingService mappingService) {
      this.repository = repository;
      this.mappingService = mappingService;
   }

   public List<UserDto> getAll() {
      return repository.findAll().stream()
              .map(mappingService::mapToUserDto).toList();
   }

   public UserDto getById(long id) {
      User user = repository.findById(id).orElse(null);

      return user == null ? null : mappingService.mapToUserDto(user);
   }

   public UserDto save(UserDto user) {
      return mappingService.mapToUserDto(repository.save(mappingService.UserDtoToEntity(user)));
   }

   public void delete(long id){
      repository.deleteById(id);
   }
}
