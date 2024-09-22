import java.util.Scanner;

public class App {
    

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
                doMadlib2();
            }
            else {
                errorMessage();
            }
        } while(restart() == true); 
        endMessage();   
    }
    

    public String getUserName (){
        Scanner getName = new Scanner(System.in);
        System.out.println ("Enter your name below:");
        return getName.nextLine();
    }

    public void printGreeting(String userName){
        System.out.println("Hello " + userName + ", welcome to Madlibs!");
    }

    public void errorMessage(){
        System.out.println ("This madlib does not exist :(");
    }

    public int chooseMadlib(){
        Scanner getChoice = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter 1 or 2 to choose a Madlib:");
        return getChoice.nextInt();    
    }

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

    public void printInstructions() {
        System.out.println();
        System.out.println("Instructions:");
        System.out.println("The program will prompt your for a word");
        System.out.println("For example, the program might ask you to \"Enter a noun: \"");
        System.out.println("All you have to do is answer as prompted!");
        System.out.println();
    }

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
