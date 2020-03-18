package factrory;

import java.math.BigDecimal;

/**
 * 比如财务账单计算类
 * @author Administrator
 *
 */
public abstract class AccountHandle {
	
	protected ThreadLocal<String> arrays = new ThreadLocal<String>();
	
	/**
	 * 账单区间单价计算（abstract,不同项目些微的差别，包括四舍五入机制，小数位保留）
	 */
	public void handlePrice() {
		System.out.println("处理通用逻辑");
		handlePrice(new BigDecimal(0));
	}
	public abstract void  handlePrice(BigDecimal price);
	
	/**
	 * 账单最终处理（abstract,比如取整）
	 */
	public void finalHandle() {
		System.out.println("账单最终处理");
		finalHandle(arrays.get());
	}
	protected abstract void finalHandle(String array);
	
}
