package Observer;

public class NewChannel implements Observer{
    private String name;

    public NewChannel(String name){
        this.name=name;
    }

    @Override
    public void update(String headline){
        System.out.println(name + "received new headline " + headline);
    }

}
