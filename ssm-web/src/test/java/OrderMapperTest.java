import com.jetora.pojo.Order;
import com.jetora.service.order.OrderService;
import org.aspectj.weaver.ast.Or;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMapperTest {

    private ApplicationContext ac = null;
    private OrderService orderService = null;
    @Before
    public void Before(){
        ac = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        orderService = (OrderService) ac.getBean("orderService");
    }
    @Test
    public void testMybatis(){
        /*
        System.out.println("1.Insert--------------");
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId(51);
            order.setStatus("INSERT_TEST");
            System.out.println(order);
            orderService.insertOrder(order);
        }
        */
        Order order = new Order();
        order.setOrderId(10);
        order.setUserId(51);
        order.setStatus("aaaaa");
        System.out.println(order);
        orderService.insertOrder(order);
    }
}
