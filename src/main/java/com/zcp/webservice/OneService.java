package com.zcp.webservice;
import javax.jws.WebService;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
/**
 * 使用CXF发布一个服务
 * 必须要添加WebService注解。否则不会对外暴露任何一个方法
 * @author 王健
 */
@WebService
public class OneService {
	
	public String sayHi(){      ///此方法将会对外公布
		return "Good";
	}
	
	public static void main(String[] args) throws Exception {
		JaxWsServerFactoryBean bean  //使用 jaxWs对其进行发布
		  = new JaxWsServerFactoryBean();
		bean.setServiceBean(new OneService());
		bean.setServiceClass(OneService.class);
		bean.setAddress("http://localhost:4444/one");
		bean.create(); //内部使用jetty服务器做为支持
		System.err.println("服务启动成功。。 ");
		//Thread.sleep(1000*60*60);
		//System.exit(0);
	}
}