package main.Java.org.projectapp;

public class CEO {

    private String name;

    private String tel;

    public CEO(String ceoName , String nrTel){
        this.name=ceoName;
        this.tel=nrTel;

        System.out.println("\n"+ceoName+" is the CEO of the company.\nThe CEO's phone number :"+nrTel);

    }
}
