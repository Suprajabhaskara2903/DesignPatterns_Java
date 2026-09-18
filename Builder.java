public class MyClass {
    
    String name;
    int age;
    int rollNo;
    
    private MyClass(Builder b){
        this.name = b.name;
        this.age = b.age;
        this.rollNo = b.rollNo;
    }
    
    static class Builder{
        String name;
        int age;
        int rollNo;
        
        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Builder age(int age){
            this.age = age;
            return this;
        }
        
        public Builder rollNo(int rollNo){
            this.rollNo = rollNo;
            return this;
        }
        
        public MyClass build(){
            return new MyClass(this);
        }
        
    }
    
    
  public static void main(String args[]) {
      MyClass student = new MyClass.Builder().name("Supraja").rollNo(59).age(24).build();
      System.out.println(student.name);
      System.out.println(student.age);
      System.out.println(student.rollNo);
    
  }
}


// User user = new User.Builder().name("Supraja") .build();
// User.Builder build = new User.Builder(); //create new builder object
//User.Builder build2 = build.name("Supraja"); //return current object of builder
//User user = build2.build();

