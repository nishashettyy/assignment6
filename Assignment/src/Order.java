import java.util.Date;
import java.util.List;

public class Order {
	private long totalamount;
	private String orderDate;
	private OrderStatus orderStatus;
	private Address address;
	private List<OrderLine> orderLines;
	public long getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(long totalamount) {
		this.totalamount = totalamount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}


}
	


