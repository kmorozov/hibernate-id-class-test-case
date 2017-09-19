package kmorozov.bean;

import java.io.Serializable;

public class MealId implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long eggs;

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((eggs == null) ? 0 : eggs.hashCode());
    result = prime * result + ((ham == null) ? 0 : ham.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MealId other = (MealId) obj;
    if (eggs == null) {
      if (other.eggs != null) return false;
    } else if (!eggs.equals(other.eggs)) return false;
    if (ham == null) {
      if (other.ham != null) return false;
    } else if (!ham.equals(other.ham)) return false;
    return true;
  }
}
