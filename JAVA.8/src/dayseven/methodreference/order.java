package dayseven.methodreference;

public class order {
	private String currency;
	private Double amount;
	public order(String currency, Double amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "order [currency=" + currency + ", amount=" + amount + "]";
	}
	
}
