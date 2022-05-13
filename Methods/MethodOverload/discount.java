public class discount {
    
    static double discount(double... d)
    {
        double finalD,finalPrice;
        double sum=0;
        for(int i=0;i<d.length;i++)
        {
            sum+=d[i];
        }
        if(sum>500)
        {
            System.out.println("Congratulation You Have Aligible for 10% discount.");
            System.out.print("Total Sum : "+sum);
            System.out.println("");
            finalD=sum*10/100;
            finalPrice=sum-finalD;
            return finalPrice;
        }
        else if(sum>200 && sum<500)
        {
            System.out.println("Congratulation You Have Aligible for 5% discount.");
            System.out.print("Total Sum : "+sum);
            System.out.println("");
            finalD=sum*5/100;
            finalPrice=sum-finalD;
            return finalPrice;
        }
        else if(sum>50 && sum<200)
        {
            System.out.println("Congratulation You Have Aligible for 2% discount.");
            System.out.print("Total Sum : "+sum);
            System.out.println("");
            finalD=sum*2/100;
            finalPrice=sum-finalD;
            return finalPrice;
        }
        else 
        {
            System.out.println("Congratulation You Have Aligible for 0% discount.");
            System.out.print("Total Sum : "+sum);
            System.out.println("");
            finalD=sum*1/100;
            finalPrice=sum-finalD;
            return finalPrice;
        }
    }

    public static void main(String args[])
    {
        double shop=discount(2000,500,1000,200);
        System.out.println("You Have After discount of Total Amount : "+shop);
    }

}
