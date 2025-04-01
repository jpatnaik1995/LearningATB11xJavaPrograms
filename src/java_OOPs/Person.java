package java_OOPs;

public class Person {
    String name;
    int age;
    double height;
    double weight;
    String occupation;
    long acNum;
    boolean isActive;
    String ifscNum;
    String dob;

    // 1.Without Parameters and Without Return Type
// 2.Without Parameters but With Return Type
// 3.With Parameters and Without Return Type
// 4. With Parameters and With Return Type
    public void greet(){
        System.out.println("Hi !!!!");
    }
    public String getPersonBankDetails(){
        name="Jaya";
        age=29;
        height=5.3;
        weight=52.8;
        occupation="SDET";
        acNum=747859349;
        ifscNum="SSSD6889433";


        System.out.println(name+" "+age+ " " +height+" "+weight+" "+occupation+" "+acNum+" "+ifscNum);
        return name+" "+age+ " " +height+" "+weight+" "+occupation+" "+acNum+" "+ifscNum;
    }
    public boolean hasBankAccount(boolean bankAccountStatus){
    bankAccountStatus=true;
        System.out.println("Account status is :"+bankAccountStatus);
    return bankAccountStatus;
    }
    public void setPersonBankDetails(String name,String dob,double height){
        System.out.println("Person name is  :"+ name);
        System.out.println("DOB is   :"+ dob);
        System.out.println("Height is :"+ height);
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.greet();
        p.getPersonBankDetails();
        p.hasBankAccount(true);
        p.setPersonBankDetails("Jaya","10th May",5.3);

    }
}
