package fr.fteychene.orm.jpabasics;

import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaApplication.class})
@Rollback(false)
@Transactional
public abstract class AbstractJpaTest {

   @Autowired
   private EntityManagerFactory emf;

   @PersistenceContext
   private EntityManager em;

   public EntityManager em() {
      return em;
   }

   public EntityManagerFactory emf() {
      return emf;
   }

}
