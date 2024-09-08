class name{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        name obj = new name();
        obj.setName("Arjun");
        System.out.println(obj.getName());
    }

}
