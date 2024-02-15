/*Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
*/
import java.util.Scanner;

class Total
{
   public double Sum(float ph,float ch,float ma,float bi,float en,float co)
   {
      double dtotal=0.0d;

      dtotal=ph + ch + ma + bi + en + co;

      return dtotal;

   }

   public double Avg(float ph,float ch,float ma,float bi,float en,float co)
   {
      
      double average=0.0d;

      double dtotal=0.0d;

      dtotal=ph + ch + ma + bi + en + co;

      average=dtotal/6.0;

      return average;
   }
}

class Program2
{
   public static void main(String args[])
   {
      Scanner sobj = new Scanner(System.in);
      float eng=0.0f, phy=0.0f, chem=0.0f, math=0.0f, comp=0.0f,bio =0.0f;
         
      System.out.println("Enter marks of five subjects:");

      /* Input marks of all six subjects */
      System.out.print("Enter marks of physics subjects: ");
      phy=sobj.nextFloat();

      System.out.print("Enter marks of chemistry subjects: ");
      chem=sobj.nextFloat();

      System.out.print("Enter marks of maths subjects: ");
      math=sobj.nextFloat();

      System.out.print("Enter marks of Biology subjects: ");
      bio=sobj.nextFloat();

      System.out.print("Enter marks of English subjects: ");
      eng=sobj.nextFloat();
    
      System.out.print("Enter marks of computers subjects: ");
      comp=sobj.nextFloat();

      Total tobj=new Total();

      System.out.println("**************************************************************************************************");
      double TotalRet=tobj.Sum(phy,chem,math,bio,eng,comp);
      System.out.println("Total marks are: "+TotalRet);

      System.out.println("**************************************************************************************************");
      double Average=tobj.Avg(phy,chem,math,bio,eng,comp);
      System.out.println("Average marks are: "+Average);

      System.out.println("**************************************************************************************************");
      if(Average >90)
      {
         System.out.println("Outstanding performance...");
      }
      else if(Average >=80.0d)
      {
         System.out.println("Grade A");
      }
      else if(Average >=70.0d)
      {
         System.out.println("Grade B");
      }
      else if(Average >=60.0d)
      {
         System.out.println("Grade C");
      }
      else if(Average >=50.0d)
      {
         System.out.println("Grade D");
      }
      else
      {
         System.out.println("Poor performance");
      }
      System.out.println("**************************************************************************************************");
      sobj.close();
   }
}