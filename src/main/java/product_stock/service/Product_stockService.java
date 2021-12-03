package product_stock.service;


import product_stock.dao.Product_stockDao;
import product_stock.domain.Product_stock;

/**
 * logic functions such as register, login
 * @author Vineeth Myneedi
 *
 */
public class Product_stockService {
	private Product_stockDao product_stockDao = new Product_stockDao();
	
	/**
	 * register a Supplier
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Product_stock form) throws Product_stockException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Supplier
		Product_stock product_stock = product_stockDao.findByproduct_id(form.getProduct_id());
		if(product_stock.getProduct_id() !=null && product_stock.getProduct_id().equals(form.getProduct_id())) throw new Product_stockException("This user name has been registered!");
		product_stockDao.createProduct_stock(form);
	}
}