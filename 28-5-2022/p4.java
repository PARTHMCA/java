public class p4 {

    int id ;
    String name ;
    String City;

    p4(int id , String name,String City ){
        this.id = id;
        this.name = name;
        this.City = City;
    }
    void display()
    {
        System.out.println("=> "+id+" "+name + " " + City);
    }
    public static void main(String[] top){
        p4 m1 = new p4(101, "Parth","Mumbai");
        p4 m2 = new p4(102, "Nick","Jaipur");
        p4 m3 = new p4(103, "Hirani","Indian");
        p4 m4 = new p4(105, "Hirani","Rajkot");
      
        m1.display();
        m2.display();   
        m3.display();  
        m4.display();
    }
}
