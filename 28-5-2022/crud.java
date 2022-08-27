import javax.print.event.PrintEvent;

class Bank{
    void bank(){
        System.out.println("Bank Account Open by class");
    }
}
class Save extends Bank{
    void save(){
        System.out.println("Bank Account Save Open by  class");
    }
}
interface Current{
    void current();
}

interface Employee{
    void employee();
}

class Emp extends Save implements Current,Employee {
    public void current(){
        System.out.println("Bank Current Account Open by interface");
    }
    void emp(){
        System.out.println("Bank EMP Account Open by interface");
    }
    public void employee(){
        System.out.println("Bank employees Account Open by class");
    }
}

public class crud{
public static void main(String[] args){
    
    Save s1 = new Save();
    Emp e1 = new Emp();
    s1.bank();
    e1.bank();
    s1.save();
    e1.save();
    e1.current();
    e1.emp();
    e1.employee();

    }
}