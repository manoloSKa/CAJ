package model;

public class user {
    private String username;
    private String password;
    private String fullName;
    private int age;
    private String sex;
    private double height;
    private double weight;
    private double bmi;
    private String bmiDate;


    public String getUsername() {return username;}
    public void setUsername(String username) { this.username = username;}
    
    public String getPassword() {return password;}
    public void setPassword(String password) { this.password = password;}
   
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) { this.fullName = fullName;}

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getBmi() { return bmi; }
    public void setBmi(double bmi) { this.bmi = bmi; }

    public String getBmiDate() {return bmiDate;}
    public void setBmiDate(String bmiDate) { this.bmiDate = bmiDate;}
   
    }

