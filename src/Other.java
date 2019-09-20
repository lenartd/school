import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Other
{
    public boolean isEur(String amount)
    {
        amount = amount.toLowerCase();

        Pattern p = Pattern.compile("^([1-9]\\d?|0)([.|,]\\d{2})?(\\s?(eur)?|\\s?€?)$");
        Matcher m = p.matcher(amount);
        boolean b = m.matches();
        return b;
    }
}
