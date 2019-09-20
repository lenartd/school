
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

    //Misunderstood the exercise, does not work as it should
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

    //Pavlik one
    public char cryptingChar(char input)
    {
        byte firstHalf = (byte) (240&input);
        byte secondHalf = (byte) (15&input);
        secondHalf = (byte) (~secondHalf);
        secondHalf = (byte) (secondHalf&15);
        int result = (byte) (firstHalf|secondHalf);

        return (char) result;
    }

    public char encrypt2(char input)
    {
        int result = ((input & 15) << 4) + ((input&240) >> 4);

        return (char) result;
    }


    public char encrypt3(char input)
    {
        byte bin = (byte)input;

        String bin0 = Integer.toBinaryString(bin);
        char[] bin1 = bin0.toCharArray();
        char temp;

        for(int i = 1; i < bin1.length-1; i=i+2)
        {
            temp = bin1[i];
            bin1[i] = bin1[i+1];
            bin1[i+1] = temp;
        }
        System.out.println(bin0);
        System.out.println(new String(bin1));
        return (char)bin;
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
