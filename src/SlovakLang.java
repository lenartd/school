/* Name: Dániel Lénárt */
public class SlovakLang extends Subject
{
    public String formatText(String text)
    {
        char[] formatted = text.toCharArray();
        String done;
        formatted[0] = Character.toUpperCase(formatted[0]);

        for(int i = 1; i < formatted.length; i++)
        {
            formatted[i] = Character.toLowerCase(formatted[i]);
        }

        if (formatted[formatted.length-1] != '?' || formatted[formatted.length-1] != '.' || formatted[formatted.length-1] != '!')
        {
            done = String.valueOf(formatted) + ".";
            return done;
        }

        done = new String(formatted);
        return done;
    }
}
