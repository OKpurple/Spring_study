package chapter2.erp;

public interface ErpClient {

	public void connect();

	public void close();

	public void sendPurchaseInfo(ErpOrderData oi);
}
