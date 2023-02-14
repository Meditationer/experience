package springT;

/**
 * @创建时间：2023/2/5
 * @描述
 */
public class Hello {
    private String name;
    public Hello(){
        System.out.println("创建对象");
    }
    public void setName(String name){
        System.out.println("调用");
        this.name = name;
    }
    public void sayHell0(){
        System.out.println("say hello,"+name);
    }
}
