import javax.xml.bind.ValidationException;

public class Exception {

    static	int parseAge(String	age)throws ValidationException {
        int value;
        try	{
            value	=	Integer.parseInt(age);
        }catch	(NumberFormatException	e) {
            throw new ValidationException("should	be	an	int");
        }
        if(value	<	0	||	value	>	150)	{
            throw	new	ValidationException("should	be	between	0	and	150	inclusive");
        }
        return	value;
    }
    public	static	void	main(String[]	args)	{
        try	{
            int age	=	parseAge("-1");
            System.out.println("Age Received:"+ age);
        }	catch	(ValidationException	e)	{
            System.out.println("Invalid	age	argument:	"	+	e.getMessage());
        }
    }
}
