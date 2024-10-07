import java.util.Scanner;

public class App {
    
    /** This is method is what actually calls on and executes 
     * all the other methods outlined in this program.
     * Firstly, it calls on the "getUserName" method and saves
     * the user input into the variable "UserName".
     * It then calls on the "printGreeting" method to print
     * the greeting message using the "userName" variable
     * from earlier. The program then initiates a "do" loop.
     * A "do" loop is used as it executes the code in the loop first
     * and then checks for the loop statement, which is exactly
     * what we need since the used is used to restart the program.
     * The first think done in the loop is to call the "chooseMadlib"
     * variable and saves it to an int. That is followed by an if statement, 
     * depending on the value of the int value created from the "chooseMadlib"
     * method, it either calls on the "doMadlib1" or the "doMadlib2" method.
     * It then calls on the "restart" method to check if the user wants to play again,
     * if true, than the loop repeats, if not then the program prints out the
     * end message and ends.
    */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        do{                                        // loop logic learned from https://www.geeksforgeeks.org/loops-in-java/
            int madlibChoice = chooseMadlib();
            if (madlibChoice == 1){
                printInstructions();
                doMadlib1(); 
            }
            else if (madlibChoice == 2){
                printInstructions();
                doMadlib2();                        // I tried submiting it yesterday but had some issues with the commit part. 
            }                                       // thanks to joão i was able to fix it. sorry for the late submission.
            else {
                errorMessage();
            }
        } while(restart() == true); 
        endMessage();   
    }

    /**This method prompts 
     * the user to enter their name, 
     * waits until they enter their name, 
     * then returns their name to be saved. 
     * */

    public String getUserName (){
        Scanner getName = new Scanner(System.in);
        System.out.println ("Enter your name below:");
        return getName.nextLine();
    }

    /** This method accepts the user's name as an argument, 
     * then print a custom greeting for that user.
     * */

    public void printGreeting(String userName){
        System.out.println("Hello " + userName + ", welcome to Madlibs!");
    }

    /** This method prints an error message if the user
     * inputs a number other than "1" or "2" when choosing a madlib.
     */

    public void errorMessage(){
        System.out.println ("This madlib does not exist :(");
    }

    /** This method prompts the user to choose a madlib
     * and saves the user's input as an integer variable.
     */

    public int chooseMadlib(){
        Scanner getChoice = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter 1 or 2 to choose a Madlib:");
        return getChoice.nextInt();    
    }

    /** This method asks the user if they want to play again.
     * It saves the user's input as a string and uses ".equals" boolean
     * to compare the user's string to a specified object.
     * Depending on the user's input it either restarts the loop, having the user
     * replay the game, or ends the program.
     */

    public boolean restart(){
        Scanner getRestart = new Scanner(System.in);
        System.out.println();          
        
        //  The following code was copied from chat gpt with some minor alterations

        System.out.println("Want to play again? ");         
        System.out.println("Enter \"yes\" or \"no\":");

        String userInput = getRestart.nextLine().trim().toLowerCase();
        
        if (userInput.equals("yes")) {
            return true;
        } else if (userInput.equals("no")) {
            return false;
        } else {
            System.out.println();
            System.out.println("Invalid input, closing madlibs.");
            return false;
        }
    }

    /** This method prints the instructions for the game to the user. */

    public void printInstructions() {
        System.out.println();
        System.out.println("Instructions:");
        System.out.println("The program will prompt your for a word");
        System.out.println("For example, the program might ask you to \"Enter a noun: \"");
        System.out.println("All you have to do is answer as prompted!");
        System.out.println();
    }

    /** This method actually does the madlib (In this case madlib choice #1).
     * It creates a scanner and prompts the user for all the missing words.
     * It saves the users inputs as string variables and 
     * prints the final madlib, using the variables to fill in the blanks 
     * in the strings that make up the story.
     */

    public void doMadlib1(){
        Scanner getMLInfo = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String nameML = getMLInfo.nextLine();

        System.out.print("Enter a place: ");
        String placeML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1ML = getMLInfo.nextLine();

        System.out.print("Enter an adverb: ");
        String adverbML = getMLInfo.nextLine();

        System.out.print("Enter an animal: ");
        String animalML = getMLInfo.nextLine();

        System.out.print("Enter a clothing item: ");
        String clothingItemML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective2ML = getMLInfo.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralNounML = getMLInfo.nextLine();

        System.out.print("Enter a type of music: ");
        String musicML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective3ML = getMLInfo.nextLine();

        System.out.print("Enter a verb: ");
        String verb1ML = getMLInfo.nextLine();

        System.out.print("Enter a verb: ");
        String verb2ML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective4ML = getMLInfo.nextLine();

        System.out.print("Enter a number: ");
        String numberML = getMLInfo.nextLine();

        System.out.println();
        System.out.println("Here is your very own story!");
        System.out.println();

        System.out.println("One day, my best friend " + nameML);
        System.out.println("and I decided to go to the " + placeML + ".");
        System.out.println("It was a/an " + adjective1ML);
        System.out.println("day, and the sun was shining " + adverbML + ".");
        System.out.println("As soon as we walked through the gates, we saw a/an " + animalML);
        System.out.println("wearing a/an " + clothingItemML + "!");
        System.out.println("We couldn't believe our eyes.");
        System.out.println();
        System.out.println("Next, we headed over to the " + adjective2ML);
        System.out.println("exhibit, where we saw a group of " + pluralNounML);
        System.out.println("dancing to " + musicML + ".");
        System.out.println("It was so " + adjective3ML);
        System.out.println("that we started to " + verb1ML);
        System.out.println("along with them.");
        System.out.println();
        System.out.println("As the day came to an end, we decided to " + verb2ML);
        System.out.println("the bus all the way home. It was truly a/an " + adjective4ML);
        System.out.println("day at the " + placeML + ",");
        System.out.println("and we promised to come back again in " + numberML + " weeks!");
    }

    /** This method actually does the madlib (In this case madlib choice #2).
     * It creates a scanner and prompts the user for all the missing words.
     * It saves the users inputs as string variables and 
     * prints the final madlib, using the variables to fill in the blanks 
     * in the strings that make up the story.
     */

    public void doMadlib2(){
        Scanner getMLInfo = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective1ML = getMLInfo.nextLine();

        System.out.print("Enter a noun: ");
        String noun1ML = getMLInfo.nextLine();

        System.out.print("Enter a verb in past tense: ");
        String verbPast1ML = getMLInfo.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb1ML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective2ML = getMLInfo.nextLine();

        System.out.print("Enter a noun: ");
        String noun2ML = getMLInfo.nextLine();

        System.out.print("Enter a noun: ");
        String noun3ML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective3ML = getMLInfo.nextLine();

        System.out.print("Enter a verb: ");
        String verbML = getMLInfo.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb2ML = getMLInfo.nextLine();

        System.out.print("Enter a verb in past tense: ");
        String verbPast2ML = getMLInfo.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective4ML = getMLInfo.nextLine();

        System.out.println();
        System.out.println("Here is your very own story!");
        System.out.println();

        System.out.println("Today I went to the park. I saw a/an " + adjective1ML + " " + noun1ML);
        System.out.println("jumping up and down in its tree. He " + verbPast1ML + " " + adverb1ML);
        System.out.println("through the large tunnel that led to its " + adjective2ML + " " + noun2ML + "."); 
        System.out.println("I got some peanuts and passed them through the cage to a gigantic gray " + noun3ML);
        System.out.println("towering above my head. Feeding that animal made me hungry. I went to get a " + adjective3ML);
        System.out.println("scoop of ice cream. It filled my stomach. Afterwards I had to " + verbML + " " + adverb2ML);
        System.out.println("to catch our bus. When I got home I " + verbPast2ML);
        System.out.println("my mom for a " + adjective4ML);
        System.out.println("day at the park.");
    }
    
    /** This method prints out the end message. */

    public void endMessage(){
        System.out.println();
        System.out.println("Thanks for playing!");
        System.out.println();
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
