import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Proj3Driver
{
	public static void main(String args[]) throws IOException
	{
		Proj3 app;
		app = new Proj3();
		app.appMain();
                app.Read();
                app.Process();
                app.rptOut();
	}   
}	

class Proj3
{

	BufferedReader stdin;	
	String actNr, eomDate;
	int trnNr, crCount, minDeTranNr; 
	float totDe, pnalty, trnsAmt;  
        double totCred, rBal, begBal, totDeb, dbCount, avgCrAmt, odPnlty, totOD;
        double minDeAmt = 9999.00;
        
        int [] transNum = new int [33];
        String [] transType = new String [33];
        double [] transAmt = new double [33];
        double [] overPenalty = new double [33];
        double [] runBal = new double [33];
        int numTrans =0;

	public void appMain() throws IOException
	{
		System.out.print("\n****************************************************");
		System.out.print("\n* Project #3 Java code                             *");
		System.out.print("\n*                                                  *");
		System.out.print("\n*  By: Owen Herman                                 *");
		System.out.print("\n****************************************************");

      
        }
	public void Read()
        {
                Scanner keyboard = new Scanner(System.in);
		System.out.print("\nPlease enter the account number: ");
		actNr = keyboard.next();
		System.out.print("\nPlease enter the beginning balance for the account:  ");
		begBal = keyboard.nextFloat();
		System.out.print("\nPlease enter the month end date for this cycle: ");
		eomDate = keyboard.next();
		System.out.print("\nPlease enter the overdraft penalty amount:  ");
		odPnlty = keyboard.nextFloat();
                System.out.println("\nHow many transactions exist?: ");
                numTrans = keyboard.nextInt();
         
                for (int i=1; i<numTrans+1; i++){
                    System.out.print("\nPlease enter the Trans Number: ");
                    transNum[i] = keyboard.nextInt();
                    System.out.print("\nPlease enter the Trans Type: ");
                    transType[i] = keyboard.next();
                    System.out.print("\nPlease Enter the Trans Amount: ");
                    transAmt[i] = keyboard.nextDouble();
                }
        }
        
	
	void Process()
	{
            
            rBal = begBal;
            runBal[0] = begBal;
            
            for (int k = 1; k<numTrans+1; k++)
            {
                if (transType[k].equals("C"))
                {
                    totCred = totCred + transAmt[k];
                    crCount = crCount + 1;
                    runBal[k] = runBal[k-1] + transAmt[k];
      
                }
                else if(transType[k].equals("D"))
                {
                    totDeb = totDeb + transAmt[k];
                    runBal[k] = runBal[k-1] - transAmt[k];
                    if (runBal[k] <0){
                         overPenalty[k] = odPnlty;
                         totOD += overPenalty[k];
                         runBal[k] -= overPenalty[k];
                    }
                    else{
                        overPenalty[k] = 0;
                    }
                       
                    if (transAmt[k] < minDeAmt)
			{
				minDeAmt = transAmt[k];
				minDeTranNr = transNum[k];
			}
                }
                
            }
            avgCrAmt = totCred/crCount;
            
	}
		
	
		
	void rptOut()
	{
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.print("\nCustomer Transaction: ");
	    System.out.print("\n==================================\n");
            System.out.println("Trans #: " + "\t" + "Trans Type" + "\t" + "Trans Amt: " + "\t" + "Running Bal" + "\t" + "OD Penalty Amt");
            for (int m =1; m<numTrans+1; m++)
            {
                System.out.println(transNum[m] + "\t\t" + transType[m] +"\t\t" + transAmt[m] + "\t\t" + df.format(runBal[m]) + "\t\t" + overPenalty[m]);
            }
                
		System.out.print("\n*********************************************************");
		System.out.print("\n*******MASCU Monthly Transaction Report Summary**********");
		System.out.print("\nCustomer Account Number:                " + actNr );
		System.out.print("\nCustomer Beginning of Month Balance:    " + begBal );
		System.out.print("\nMonthly Transaction Report Ending on:   " + eomDate);
		System.out.println("\nOverdraft Penalty Amount:               " + odPnlty);
		
		System.out.print("\nCustomer End Balance:                   " + runBal[numTrans+1] );
		System.out.print("\nTotal Credits $ Amount:                 " + totCred );
		System.out.print("\nTotal Debits $ Amount:                  " + totDeb);
		System.out.print("\nTotal Overdraft Amount:                 " + totOD);
		System.out.print("\nAverage Credit Amount:                  " + df.format(avgCrAmt));
		System.out.print("\nLow Debit $ Amount:                      " + minDeAmt);
		System.out.print("\nLow Debit Trans #:                       " + minDeTranNr);
		System.out.print("\n*********************************************************");
	} 
} // end of class Proj3


