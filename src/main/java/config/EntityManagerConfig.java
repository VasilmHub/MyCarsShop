package config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerConfig {
    @Produces
    public EntityManager entityManager() {
        return Persistence.createEntityManagerFactory("black_friday")
                .createEntityManager();
    }
}

