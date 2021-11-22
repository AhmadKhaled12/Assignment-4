package bonus;
public class Doctor implements Staff
{
    @Override
    public double get_salary()
    {
        return 10000.0;
    }
    
    @Override
    public int get_years_of_work()
    {
        return 10;
    }
    @Override
    public void details()
    {
        System.out.println("position: Doctor");
        System.out.println("Salary: " + get_salary());
        System.out.println("Years of work: " + get_years_of_work());
    }
}
