package br.com.ifms.restauranteV1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mesa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int num;
  private boolean status;


  /**
   * @return Long return the id
   */
  public Long getId() {
      return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
      this.id = id;
  }

  /**
   * @return int return the num
   */
  public int getNum() {
      return num;
  }

  /**
   * @param num the num to set
   */
  public void setNum(int num) {
      this.num = num;
  }

  /**
   * @return boolean return the status
   */
  public boolean isStatus() {
      return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(boolean status) {
      this.status = status;
  }

}
