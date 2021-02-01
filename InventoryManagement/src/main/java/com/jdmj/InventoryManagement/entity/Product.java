/*
 * package com.jdmj.InventoryManagement.entity;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.JoinTable; import javax.persistence.ManyToMany; import
 * javax.persistence.OneToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "product") public class Product {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name="id") private int id;
 * 
 * @Column(name="name") private String name;
 * 
 * @Column(name="category") private String category;
 * 
 * @Column(name="quantity") private int quantity;
 * 
 * @OneToOne()
 * 
 * @JoinColumn(name="product_info_id") private ProductInfo productInfo;
 * 
 * @ManyToMany
 * 
 * @JoinTable( name="supplier_product",
 * joinColumns=@JoinColumn(name="product_id"), inverseJoinColumns
 * = @JoinColumn(name="supplier_id") ) private List<Supplier> suppliers;
 * 
 * public Product() {
 * 
 * }
 * 
 * public Product(String name, String category, int quantity, ProductInfo
 * productInfo) { this.name = name; this.category = category; this.quantity =
 * quantity; this.productInfo = productInfo; }
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getCategory() { return category; }
 * 
 * public void setCategory(String category) { this.category = category; }
 * 
 * public int getQuantity() { return quantity; }
 * 
 * public void setQuantity(int quantity) { this.quantity = quantity; }
 * 
 * public ProductInfo getProductInfo() { return productInfo; }
 * 
 * public void setProductInfo(ProductInfo productInfo) { this.productInfo =
 * productInfo; }
 * 
 * public List<Supplier> getSuppliers() { return suppliers; }
 * 
 * public void setSuppliers(List<Supplier> suppliers) { this.suppliers =
 * suppliers; }
 * 
 * }
 */