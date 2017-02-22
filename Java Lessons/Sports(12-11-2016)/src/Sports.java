/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class Sports {
    String mascot;
    String city;
    double win = 0;
    double losses = 0;
    double winPct = 0;
    
    public Sports(String cCity,String mMascot){
        this.mascot = mMascot;
        this.city = cCity;
        
    }
    public  String getMascot(){
        return mascot;
    }
    public String getCity(){
        return city;
        
    }
    public double getWin()
    {
        return win;
        
    }
    public double getLosses()
    {
        return losses;
    }
    public void setMascot(String mMascot)
    {
        this.mascot = mMascot;
    }
    public void setCity(String cCity)
    {
        this.city = cCity;
    }
    public void setWins(double wWins)
    {
        this.win = wWins;
    }
    public void setLosses(double lLosses)
    {
        this.losses = lLosses;
    }
    public double computeWins()
    {
        winPct = (win)/(win+losses);
        return winPct;
    }
    public String toString()
    {
        return(this.city + "\t \t" + this.mascot + "\t\t"+ win + "\t\t" + losses + "\t\t" + winPct);
    }
    public static void main(String[] args)
    {
        
        Sports sport = new Sports("Atlanta", "Falcons");
        Sports sport2 = new Sports("New orleans", "Saints");
        System.out.println("City" + "\t \t" + "Mascot" + "\t\t"+ "Win" + "\t\t" + "Losses" + "\t\t" + "Win Percentage");
        sport.setWins(4);
        sport.setLosses(12);
        sport.computeWins();
        sport2.setWins(13);
        sport2.setLosses(3);
        sport2.computeWins();
        System.out.println(sport);
        System.out.println(sport2);
        
    }
}
