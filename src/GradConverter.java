public class GradConverter {

    public static double toFarenheit(double amount)
    {
        return amount * 5 / 9 + 32;
    }


    public static double toCelsius(double amount)
    {
        return (amount - 32) * 5 / 9;
    }

}