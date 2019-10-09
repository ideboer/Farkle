import java.util.*;

public class Farkle
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        Random random = new Random();
        String firstPlayer;
        String secondPlayer;
        
        System.out.println("Player 1, sign in: ");
        final String originalFirstPlayer = scan.nextLine();
        
        System.out.println("Player 2, sign in: ");
        final String originalSecondPlayer = scan.nextLine();

        int firstRoll = random.nextInt(6) + 1;
        int secondRoll = random.nextInt(6) + 1;

        System.out.println(originalFirstPlayer + " rolls a " + firstRoll);
        System.out.println(originalSecondPlayer + " rolls a " + secondRoll);

        while (firstRoll == secondRoll)
        {
            firstRoll = random.nextInt(6) + 1;
            secondRoll = random.nextInt(6) + 1;
        }

        if (firstRoll > secondRoll)
        {
            firstPlayer = originalFirstPlayer;
            secondPlayer = originalSecondPlayer;
        }
        else
        {
            firstPlayer = originalSecondPlayer;
            secondPlayer = originalFirstPlayer;
        }

        System.out.println(firstPlayer + " goes first.");
        System.out.println(dieRolls(numberOfDie));
        
    }

    public static String playerTurn()
    {
        Random random = new Random();
        int numberOfDie = 6;
        String aside = "";

        dieRolls(numberOfDie);

        for (int i = 0; i <= rolls.length(); i++) // hot dice
        {
            if (rolls.substring(i).equals)
        }
        
        if (!rolls.contains("1") || !rolls.contains("5") || !three(rolls) )
        {
            farkle(workingScore)
        }
        else if () // hot dice
        {

        }
        else
        {
            System.out.println("Set aside a die.");
            aside += scan.nextLine();

            boolean askIfSetAsideMore = true;
            boolean setAsideMore = false;
            while (askIfSetAsideMore)
            {
                System.out.println("Set aside more dice? (y or n)");
                String answerToSetAsideMore = scan.nextLine();
                if (answerToSetAsideMore.equals("y"))
                {
                    setAsideMore = true;
                }

                while (setAsideMore)
                {
                    System.out.println("Set aside another die.");
                    aside +=scan.nextLine();
                }
            }
        }
    }

    public static boolean three(rolls)
    {
        Random random = new Random();
        int 1count = 0;
        int 2count = 0;
        int 3count = 0;
        int 4count = 0;
        int 5count = 0;
        int 6count = 0;
        
        for (int i = 0; i < rolls.length(); i++)
        {
            if rolls.substring(i).equals("1")
            {
                1count ++;
            }
            else if rolls.substring(i).equals("2")
            {
                2count ++;
            }
            else if rolls.substring(i).equals("3")
            {
                3count ++;
            }
            else if rolls.substring(i).equals("4")
            {
                4count ++;
            }
            else if rolls.substring(i).equals("5")
            {
                5count ++;
            }
            else if rolls.substring(i).equals("6")
            {
                6count ++;
            }
        }

        if (1count >= 3 || 2count >= 3 || 3count >= 3 || 4count >= 3 || 5count >= 3 || 6count >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String dieRolls(numberOfDie)
    {
        Random random = new Random();
        String rolls = "";

        for (int count = 0 ; count < numberOfDie; count++)
        {
            rolls += Integer.toString( (random.nextInt(6) + 1) ) ;
        }

        return rolls;
    }

    public static void farkle(workingScore)
    {
        System.out.println("Farkle!");
        workingScore = 0;
    }

    public static void countPoints(workingScore, aside)
    {

    }

    public static void pointDieTest()
    {
        int 1count = 0;
        int 2count = 0;
        int 3count = 0;
        int 4count = 0;
        int 5count = 0;
        int 6count = 0;
        
        for (int i = 0; i < rolls.length(); i++ )

            if (rolls.substring(i).equals("1"))
            {
                for (int count = 0; count < rolls.length(); count ++)
                {
                    if (rolls.substring(count).equals("1"))
                    {
                        1count ++;
                    }
                }
            }
            else if (rolls.substring(i).equals("2"))
            {
                for (int count = 0; count < rolls.length(); count ++)
                {
                    if (rolls.substring(count).equals("2"))
                    {
                        2count ++;
                    }
                }
            }
            else if (rolls.substring(i).equals("3"))
            {
                for (int count = 0; count < rolls.length(); count ++)
                {
                    if (rolls.substring(count).equals("3"))
                    {
                        3count ++;
                    }
                }
            }
            else if (rolls.substring(i).equals("4"))
            {
                for (int count = 0; count < rolls.length(); count ++)
                {
                    if (rolls.substring(count).equals("4"))
                    {
                        4count ++;
                    }
                }
            }
            else if (rolls.substring(i).equals("5"))
            {
                for (int count = 0; count < rolls.length(); count ++)
                {
                    if (rolls.substring(count).equals("5"))
                    {
                        5count ++;
                    }
                }
            }
            else if (rolls.substring(i).equals("6"))
            {
                for (int count = 0; count < rolls.length(); count ++)
                {
                    if (rolls.substring(count).equals("6"))
                    {
                        6count ++;
                    }
                }
            }
            
            if (rolls.substring(i).equals("1") || rolls.substring(i).equals("5"))
            {
                pointDieString += "1";
            }
            else if (2count >= 3 || 3count >= 3 || 4count >= 3 || 6count >= 3)
            {
                pointDieString += "1";
            }
            else
            {
                pointDieString += "0";
            }

            for (int count = 0; i < pointDieString.length(); count++)
            {
                if (pointDieString.substring(count).equals("1"))
                {
                    die1 = true
                }
            }
            
    }
}