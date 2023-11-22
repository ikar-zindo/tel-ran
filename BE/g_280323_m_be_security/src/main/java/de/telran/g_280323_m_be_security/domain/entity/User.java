package de.telran.g_280323_m_be_security.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements UserDetails {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private long id;

   @Column(name = "username")
   private String username;

   @Column(name = "password")
   private String password;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(
           name = "user_role",
           joinColumns = @JoinColumn(name = "user_id"),
           inverseJoinColumns = @JoinColumn(name = "role_id")
   )
   private Set<Role> roles;

   public User() {
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   @Override
   public String getUsername() {
      return username;
   }

   @Override
   @JsonIgnore
   public boolean isAccountNonExpired() {
      return true;
   }

   @Override
   @JsonIgnore
   public boolean isAccountNonLocked() {
      return true;
   }

   @Override
   @JsonIgnore
   public boolean isCredentialsNonExpired() {
      return true;
   }

   @Override
   @JsonIgnore
   public boolean isEnabled() {
      return true;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   @Override
   @JsonIgnore
   public Collection<? extends GrantedAuthority> getAuthorities() {
      return roles;
   }


   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Set<Role> getRoles() {
      return roles;
   }

   public void setRoles(Set<Role> roles) {
      this.roles = roles;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(roles, user.roles);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, username, password, roles);
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + " {" +
              "id=" + id +
              ", username='" + username + '\'' +
              ", password='" + password + '\'' +
              ", roles=" + roles +
              '}';
   }
}
