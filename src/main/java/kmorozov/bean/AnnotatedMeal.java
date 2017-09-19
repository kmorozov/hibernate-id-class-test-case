package kmorozov.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="meal")
@IdClass(MealId.class)
public class AnnotatedMeal {
  @Id
  @Column(name = "eggs_id")
  private Long eggs;

  @Id
  @Column(name = "ham_id")
  private Long ham;

  public Long getEggs() {
    return eggs;
  }

  public void setEggs(Long eggs) {
    this.eggs = eggs;
  }

  public Long getHam() {
    return ham;
  }

  public void setHam(Long ham) {
    this.ham = ham;
  }
}
