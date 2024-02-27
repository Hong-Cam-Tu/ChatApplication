// Source code is decompiled from a .class file using FernFlower decompiler.
package chatApplication.infrastructure.data;

import chatApplication.domains.User;
import chatApplication.infrastructure.repositories.InMemoryRepository;
import chatApplication.usecases.adapters.DataStorage;
import chatApplication.usecases.adapters.Repository;

public class InMemoryDataStorage implements DataStorage {
   private Repository<User> _users = new InMemoryRepository();
   private static InMemoryDataStorage storage;

   private InMemoryDataStorage() {
   }

   public static InMemoryDataStorage getInstance() {
      if (storage == null) {
         storage = new InMemoryDataStorage();
      }

      return storage;
   }

   public Repository<User> getUsers() {
      return this._users;
   }

   public void cleanAll() {
      this._users.deleteAll();
   }
}
