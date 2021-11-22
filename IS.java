package bonus;
public class IS implements Department
{
 @Override
    public Staff get_Staff (String Staff_position_name)
    {
        if(Staff_position_name.equalsIgnoreCase("Teaching assistant"))
            return new Teaching_assistant();
        else if(Staff_position_name.equalsIgnoreCase("Doctor"))
            return new Doctor();  
        else    
            return null;    
    }    
}
