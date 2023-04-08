package Encp;

public class Studentdata {

    // Initiate private variable

    public String name;
    public char grade;
    private float per;


// getter and setter method


    public void setPer(float per){
      this.per = per; // when you want to give local variable to class variable
  }


    public float getPer() {
        return per;
    }
}
