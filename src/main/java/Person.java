class Person {
    private String name, gender;
    private String[] interest;
    private int age;
    Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.interest = interests;
    }
    String hello() {
        StringBuilder allInterest = new StringBuilder();
        for (int i=0;i<interest.length;i++){
            allInterest.append(interest[i]);
            if (i+2>interest.length)allInterest.append(".");
            if (i+1<interest.length)allInterest.append(", ");
            if (i+2==interest.length)allInterest.append("and ");
        }
        return "Hello, my name is "+ name+" and I am "+age+" years old. My interests are "+ allInterest;
    }
}