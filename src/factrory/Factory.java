package factrory;

public class Factory {

	public static AccountHandle getAccountHandler(租户id){
		AccountHandle handle = null;
		/**
		 * 查询当前租户id
		 */
		switch (1) {
		case 1:
			/**
			 * 单例模式（使用Spring Bean 配置生成）
			 */
			handle =  new OneProjectHandler();
			break;
		default:
			handle =  new DefaultHandlker();
			break;
		}
		return handle;
	}
}
