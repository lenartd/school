
public class Math extends Subject
{
    public int reverse(int num)
    {
        String numStr = Integer.toString(num);

        if(numStr.charAt(numStr.length()-1) == '0' || num < 0)
        {
            return 0;
        }
        else
            {

                StringBuilder stringBuild = new StringBuilder();
                stringBuild.append(numStr);

                stringBuild = stringBuild.reverse();
                return Integer.parseInt(stringBuild.toString());
            }
    }

    public boolean isPrimeNumber(int number)
    {
        if(number >= 2)
        {
            for(int i = 2; i<= number/2; i++)
            {
                if(number%i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
