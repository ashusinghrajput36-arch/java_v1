package inheritance;

public class  motorcycle extends vehicle {
    public  String handlebars;
    public String suspensiontype;

    motorcycle( String name, String model, int tyres, String handlebars, String suspensiontype){
        super(name, model, tyres);
        this.handlebars=handlebars;
        this.suspensiontype=suspensiontype;
    }
    public void whilee(){
        System.out.println("the whilee stunt!!"+name);
    }
}
