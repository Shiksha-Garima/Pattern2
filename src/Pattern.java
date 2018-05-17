/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
/*program to draw a pattern
1
12
123
1234
*/
public class Pattern {
    void display()
    {
        for(int i=1;i<=4;i++)
            //This loop is for rows
        {
            //This loop is for column
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern p1=new Pattern();
        p1.display();
        
    }
    
}
