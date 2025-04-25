class Students {
    int age;
    String name;
    int rollno;
}
class EnhancedForLoop {
    public static void main(String args[]){
        int nums[] = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int n : nums){
            System.out.println(n);
        }

        Students st1 = new Students();
        st1.age = 23;
        st1.name = "al";
        st1.rollno = 2332;

        Students st2 = new Students();
        st2.age = 24;
        st2.name = "sal";
        st2.rollno = 223332;

        Students st3 = new Students();
        st3.age = 25;
        st3.name = "dal";
        st3.rollno = 2331232;

        Students st[] = new Students[3];
        st[0] = st1;
        st[1] = st2;
        st[2] = st3; 

        for (Students s : st) {
            System.out.println(s.age + " " +  s.name + " " + s.rollno);
        }

    }
}