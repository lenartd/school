
public class English extends Subject
{
    public String translate(String word)
    {
        switch(word.toLowerCase())
        {
            case "pes":
                return "dog";
            case "mačka":
                return "cat";
            case "ježko":
                return "hedgehog";
            case "koritnačka":
                return "turtle";
            case "žaba":
                return "frog";
            case "myš":
                return "mouse";
            case "potkan":
                return "rat";
            default:
                return "This word does not exist in this dictionary";
        }
    }
}
