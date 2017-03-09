public class Invoice{

	private String descrip;
	private String num;
	private double price;
	private int quant;

	public Invoice(String descrip, String num, double price, int quant){
		this.descrip = descrip;
		this.num = num;
		this.price = price;
		this.quant = quant;
	}

	public double getInvoiceAmount(){
		double x = this.quant * price;
		return x;
	}

	public String getDescrip(){
		return this.descrip;
	}

	public void setDescrip(String descrip){
		this.descrip = descrip;
	}

	public String getNum(){
		return this.num;
	}

	public void setNum(String num){
		this.num = num;
	}

	public double getPrice(){
		return this.price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public int getQuant(){
		return this.quant;
	}

	public void setQuant(int quant){
		this.quant = quant;
	}

}