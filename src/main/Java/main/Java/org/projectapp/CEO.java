package main.Java.org.projectapp;

public class CEO {

    private String name;

    private String tel;

    public CEO(String ceoName , String nrTel){
        this.name=ceoName;
        this.tel=nrTel;

        System.out.println("\nCEO informations :\n-name :"+ceoName+"\n-phone number :"+nrTel);

    }
}
