public class Person {
    private int age;    

    public Person(int initialAge) {
          if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else {
            this.age = initialAge;
        }
    }

    public void amIOld() {

        String str = "";
        if(age<13){
            str = str + "You are young.";
        }
        else if(age>=13  && age<18){
            str = str + "You are a teenager.";
        } 
        else if(age>=18){
            str = str + "You are old.";
        }
        System.out.println(str);
    }

    public void yearPasses() {

        ++age;
    }