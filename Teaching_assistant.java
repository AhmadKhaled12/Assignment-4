package bonus;
public class Teaching_assistant implements Staff
{
    
    @Override
    public double get_salary()
    {
        return 5000.0;
    }
    
    @Override
    public int get_years_of_work()
    {
        return 5;
    }
    
    @Override
    public void details()
    {
        System.out.println("Position: Teaching assistent");
        System.out.println("Salary: " + get_salary());
        System.out.println("Years of work: " + get_years_of_work());
    }
}
