package bonus;
public class Search
{
    public Department get_department(String Department_name)
    {
        if(Department_name.equalsIgnoreCase("CS"))
            return new CS();
        else if (Department_name.equalsIgnoreCase("IS"))
            return new IS();
        else if (Department_name.equalsIgnoreCase("IT"))
            return new IT();
        else
            return null;
    }
    
}
