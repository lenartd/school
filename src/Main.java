public class Main
{
    public static void main(String[] args)
    {
        SlovakLang slov = new SlovakLang();
        System.out.println(slov.formatText("woRD tO convErt"));

        English eng = new English();
        System.out.println(eng.translate("potkan"));

        Math math = new Math();
        System.out.println(math.reverse(456));
        System.out.println(math.reverse(650));

    }
}
