package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @title $NAME
 * @auther N��
 * @version 2.0
 @creat 2024/10/17 0017 15:30 
 **/  @WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}
