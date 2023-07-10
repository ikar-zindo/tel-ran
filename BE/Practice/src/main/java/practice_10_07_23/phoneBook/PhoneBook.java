package practice_10_07_23.phoneBook;

import java.util.*;
import java.util.function.Function;

/**
 * Создать класс телефонного справочника, который хранит номера телефлонов
 * привязаниые к имени
 * У одного контакта может быть нескольео номеров
 * Реализовать хранение контактов
 * метод add для добавления записей
 * метод get для получения набора номеров по имени
 */

public class PhoneBook {

   private final Map<String, Set<String>> entries = new TreeMap<>();
   public void add(String name, String phone) {
//      Set<String> existing = entries.get(name);
//      if (existing == null) {
//         entries.put(name, new HashSet<>(Set.of(phone)));
//      } else {
//         existing.add(phone);
//      }

      Set<String> existing = entries.computeIfAbsent(name, key -> new HashSet<>());
      existing.add(phone);
//      entries.computeIfAbsent(name, new Function<String, Set<String>>() {
//         @Override
//         public Set<String> apply(String s) {
//            return new HashSet<>();
//         }
//      });
   }

   public Set<String> get(String name) {
      return entries.getOrDefault(name, Collections.emptySet());
   }
}
