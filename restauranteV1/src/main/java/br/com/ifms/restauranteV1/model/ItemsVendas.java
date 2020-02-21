package br.com.ifms.restauranteV1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemsVendas {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int qtd;

  @ManyToOne
  private Produto produtos;


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
   * @return int return the qtd
   */
  public int getQtd() {
      return qtd;
  }

  /**
   * @param qtd the qtd to set
   */
  public void setQtd(int qtd) {
      this.qtd = qtd;
  }

  /**
   * @return ProdutosModel return the produtos
   */
  public Produto getProdutos() {
      return produtos;
  }

  /**
   * @param produtos the produtos to set
   */
  public void setProdutos(Produto produtos) {
      this.produtos = produtos;
  }

}
