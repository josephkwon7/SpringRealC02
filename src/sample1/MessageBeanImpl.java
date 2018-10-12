package sample1;

public class MessageBeanImpl implements MessageBean {

    private String name;
    private String greeting;
    
    public void sayHello() {
        System.out.println(greeting + name + " !");
    }

    public MessageBeanImpl(String name) {
        super();
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    

}
