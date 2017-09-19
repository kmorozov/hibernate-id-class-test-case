

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kmorozov.bean.AnnotatedMeal;
import kmorozov.bean.Eggs;
import kmorozov.bean.Ham;
import kmorozov.bean.Meal;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = {"classpath:databaseContext.xml"})
public class hibernateTest {

  @PersistenceContext EntityManager em;

  @Test
  @Rollback(false)
  public void saveMeal() {
    Eggs eggs = new Eggs();
    eggs.setColor("green");

    Ham ham = new Ham();
    ham.setColor("green");

    em.persist(eggs);
    em.persist(ham);

    Meal meal = new Meal();
    meal.setEggs(eggs.getId());
    meal.setHam(ham.getId());
    em.persist(meal);
  }
  
  @Test
  @Rollback(false)
  public void saveAnnotatedMeal() {
    Eggs eggs = new Eggs();
    eggs.setColor("green");

    Ham ham = new Ham();
    ham.setColor("green");

    em.persist(eggs);
    em.persist(ham);

    AnnotatedMeal meal = new AnnotatedMeal();
    meal.setEggs(eggs.getId());
    meal.setHam(ham.getId());
    em.persist(meal);
  }
}
