package br.com.ifms.restauranteV1.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Venda {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDate data;
  private LocalTime time;
  private double totalVenda;

  @ManyToOne
  private Mesa mesa;
  @OneToOne
  private Cliente cliente;
  @OneToMany
  private List<ItemsVendas> itensVenda;


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
   * @return LocalDate return the data
   */
  public LocalDate getData() {
      return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(LocalDate data) {
      this.data = data;
  }

  /**
   * @return double return the totalVenda
   */
  public double getTotalVenda() {
      return totalVenda;
  }

  /**
   * @param totalVenda the totalVenda to set
   */
  public void setTotalVenda(double totalVenda) {
      this.totalVenda = totalVenda;
  }

  /**
   * @return MesaModel return the mesa
   */
  public Mesa getMesa() {
      return mesa;
  }

  /**
   * @param mesa the mesa to set
   */
  public void setMesa(Mesa mesa) {
      this.mesa = mesa;
  }

  /**
   * @return ClienteModel return the cliente
   */
  public Cliente getCliente() {
      return cliente;
  }

  /**
   * @param cliente the cliente to set
   */
  public void setCliente(Cliente cliente) {
      this.cliente = cliente;
  }

  /**
   * @return ArrayList<ProdutosModel> return the itensVenda
   */
  public List<ItemsVendas> getItensVenda() {
      return itensVenda;
  }

  /**
   * @param itensVenda the itensVenda to set
   */
  public void setItensVenda(List<ItemsVendas> itensVenda) {
      this.itensVenda = itensVenda;
  }


    /**
     * @return LocalTime return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

}
