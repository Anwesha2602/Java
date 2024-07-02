public class Password {
    public static void main(String[] args) {
        int num1 = 190,num2=267,num3=853;
        int unit1 = num1%10;
        int unit2 = num2%10;
        int unit3 = num3%10;

        int tens1 = (num1/10)%10;
        int tens2 = (num2/10)%10;
        int tens3 = (num3/10)%10;

        int hundreds1 = num1/100;
        int hundreds2 = num2/100;
        int hundreds3 = num3/100;

        int min_unit = Math.min(Math.min(unit1,unit2),unit3);
        int min_tens = Math.min(Math.min(tens1,tens2),tens3);
        int min_hundred = Math.min(Math.min(hundreds1,hundreds2),hundreds3);

        int max_unit = Math.max(Math.max(unit1,unit2),unit3);
        int max_tens = Math.max(Math.max(tens1,tens2),tens3);
        int max_hundred = Math.max(Math.max(hundreds1,hundreds2),hundreds3);

        int max_thousand = Math.max(Math.max(max_unit,max_hundred),max_tens);

        System.out.println(max_thousand+""+min_hundred +"" +min_tens+""+min_unit);


        
        
    }
}
