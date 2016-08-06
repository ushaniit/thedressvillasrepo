package thedressvilla.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name="Product")
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@NotEmpty
	private String name;
	@NotEmpty(message="brand cannot blank")
	private String brand;
	@NotEmpty(message="desc cannot blank")
	private String desc;
	@NotEmpty(message="cartegory cannot blank")
	private String cartegory;
	@Range(min = 500,message="price should be more than equal to 500")
	private int price;
	@Transient
	private MultipartFile img;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCartegory() {
		return cartegory;
	}
	public void setCartegory(String cartegory) {
		this.cartegory = cartegory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MultipartFile getImg()
	{
		return img;
	}
	public void setImg()
	{
		this.img=img;
	}
	
	@Override
	public String toString()
	{
		return "pid="+pid+",name="+name+",brand="+brand+",cartegory="+cartegory+",desc="+desc+",price="+price;
	}
	public Product() {

	}
	
	
	
}
