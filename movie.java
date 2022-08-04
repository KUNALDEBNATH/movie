import java.util.*;
public class movietic
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i ,j,k=1,c,ci,ti,pa,no,t=0,ch,l=0;
        String nm;
        System.out.println("WELCOME TO OUR MOVIE RESERVATION CENTER");
        System.out.println("ENTER YOUR NAME");
        nm=sc.nextLine();
        while(l==0)
        {
            int ca=0;
            System.out.println("ENTER HOW MANY TICKETS DO YOU WANT");
            no=sc.nextInt();
            int se[]=new int[no];
            System.out.println("CHOOSE ANY OF THE TRENDING MOVIE AN PRESS THE CORESPONDING NUMBER TO ACCEPT IT");
            System.out.println("HOUSEFULL 4 (1)");
            System.out.println("MALIFICENT-THE MISTRESS OF EVIL (2)");
            System.out.println("THE SKY IS PINK (3)");
            ci=sc.nextInt();
            System.out.println("CHOOSE THE SHOW TIMINGS");
            System.out.println("9:30 AM (1)");
            System.out.println("2:30 PM (2)");
            System.out.println("7:30 PM (3)");
            ti=sc.nextInt();
            System.out.println("SEAT-1 to 40=(120rs) AND 41 to 100=(200rs) ");
            for(i=1;i<=10;i++)
            {
                for(j=1;j<=10;j++)
                {
                    System.out.print(""+"["+k+"]"+""); 
                    k++;
                }
                System.out.println();
            }
            k=1;
            for(i=0;i<no;i++)
            {
                System.out.println("CHOOSE YOUR SEAT BY ENTERING SEAT NUMBER");
                se[i]= sc.nextInt();
            }
            if(ci==1&&ti==1)
            {
                System.out.println("Name:"+nm);
                System.out.println("HOUSEFULL 4 movie on 9:30 AM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");

                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==1&&ti==2)
            {
                System.out.println("Name:"+nm);
                System.out.println("HOUSEFULL 4 movie on 2:30 PM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");   
                }
            }
            if(ci==1&&ti==3)
            {
                System.out.println("Name:"+nm);
                System.out.println("HOUSEFULL 4 movie on 7:30 PM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==2&&ti==1)
            {
                System.out.println("Name:"+nm);
                System.out.println("MALIFICENT-THE MISTRESS OF EVIL movie on 9:30 AM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==2&&ti==2)
            {
                System.out.println("Name:"+nm);
                System.out.println("MALIFICENT-THE MISTRESS OF EVIL movie on 7:30 PM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==2&&ti==3)
            {
                System.out.println("Name:"+nm);
                System.out.println("MALIFICENT-THE MISTRESS OF EVIL movie on 7:30 PM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==3&&ti==1)
            {
                System.out.println("Name:"+nm);
                System.out.println("THE SKY IS PINK  movie on 9:30 AM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==3&&ti==2)
            {
                System.out.println("Name:"+nm);
                System.out.println("THE SKY IS PINK  movie on 2:30 PM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            if(ci==3&&ti==3)
            {
                System.out.println("Name:"+nm);
                System.out.println("THE SKY IS PINK  movie on 9:30 PM ");
                System.out.println("Your seat numbers are:");
                for(i=0;i<no;i++)
                {
                    System.out.println(se[i]);
                    if(se[i]>=1&&se[i]<=41)
                    {
                        ca=ca+120;
                    }
                    else
                    {
                        ca=ca+200;
                    }
                }
                System.out.println("AMOUNT:"+ca);
                System.out.println("ENTER PAYMENT OPTION");
                System.out.println("1 FOR ONLINE PAYMENT");
                System.out.println("2 FOR DESTINATION PAYMENT");
                pa=sc.nextInt();
                if(pa==1)
                {
                    System.out.println("SORRY!!!!! OUR SERVER IS STILL NOT READY FOR THIS TYPE OF PAYMENT SERVICE THATS WHY WE HAVE CHANGED THE PAYMENT OPTION IN DESTINATION PAYMENT (BOOKING IS CONFIRMED)");
                }
                else
                {
                    System.out.println("Your booking is confirmed.Show your booking to the reception");
                }
            }
            t=ca+t;
            System.out.println("DO YOU WANT TO CONTINUE WITH OTHER TICKETS PRESS 1 OR TO EXIT ANY OTHER KEY");
            ch=sc.nextInt();
            if(ch==1)
            {
                continue;
            }
            else
            {
                break;
            }
        }
        System.out.println("Your total amount:"+t+"rs");
    }
}


