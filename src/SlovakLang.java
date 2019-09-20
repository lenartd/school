
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

    public char encrypt(char ucchar)
    {
        String firstFour = Integer.toBinaryString(ucchar >> 4);
        String lastFour = "";

        for(int i = 0; i<4; i++)
        {
            lastFour += Integer.toString((ucchar >> i) & 1);
        }

        int num = Integer.parseInt(firstFour+lastFour, 2);

        return (char)num;
    }

    public String encryptWord(String word)
    {
        char[] letters = word.toCharArray();
        String encrypted = "";

        for(int i = 0; i< letters.length; i++)
        {
            encrypted += encrypt(letters[i]);
        }
        return encrypted;
    }

}
