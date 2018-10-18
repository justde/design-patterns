package generally.pizza;

/**
 * @author: justd
 * @Date: 18-10-19 00:39
 * @Description:
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();
    public void bake()
    {
        System.out.println(name+" baking;");
    }
    public void cut()
    {
        System.out.println(name+" cutting;");
    }
    public void box()
    {
        System.out.println(name+" boxing;");
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
