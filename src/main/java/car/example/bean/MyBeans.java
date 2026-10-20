package car.example.bean;

public class MyBeans {
    private String message;



    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString(){
        return "MyBeans{"+"message = '" + this.message + '\'' + '}'  ;
    }
}
