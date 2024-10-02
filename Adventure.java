import java.util.*;

public class Adventure
{
    Player player;
    String location;
    private Scanner s = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Adventure game = new Adventure();
        game.player = new Player();
        game.location = "Ethodyne";
        game.ethodyne();
    }
    
    public String prompt(String promptString)
    {
        System.out.print(promptString);
        return s.nextLine();
    }
    
    // This is Ethodyne; a fantasy,adventure
    // roleplay game.
    
    // The game name is a combination of 
    // Ethereum and Anodyne. We wanted to show that
    // the kingdom was peaceful, but had a dark underbelly..
    // It was meant to be a kingdom of prosperity and honor,
    // but the royals had different plans.
    
    // The parts of game that you are about to play only
    // include the prologue; before the ¨hero¨ starts his true adventure.
    
    // Setting : 13th Century Middle Ages, in the kingdom of Ethodyne

    
    private void ethodyne() 
    {
        System.out.println("----");
        System.out.println("2021 by Janiya Green & Caleb Keaton");
        System.out.println("----");
        System.out.println("");
        System.out.println("Type HELP to view known commands.");
        System.out.println("");
        System.out.println("You are lying in an open field, North of the palace, under an apple tree, surrounded by grazing, green grass.");
        System.out.println("You’re having a comforting dream.. You see a small girl, giggling, and chasing after you.");
        System.out.println("She opens her mouth and it looks like her lips are sounding out your name but it's inaudible, you can’t hear it until…”..milios...milios...Sir Amilios!”.");
        System.out.println("You wake up looking into the eyes of Gertrude, your family’s servant.");
        System.out.println("”Sir Amilios, the king and queen has requested to see you at the throne at once.”");
        System.out.println("He leaves behind the path, leading into the west side of the palace.");
        System.out.println("You get up, brushing the dust and dirt from your brown, wool, trousers.");
        
        while (true) {
            String action = prompt("What do you want to do? ");
            
            switch (action) {
                
                case "HELP":
                    if (action.equals("HELP")) {
                        System.out.println("_________");
                        System.out.println("");
                        System.out.println("n/north - Go North");
                        System.out.println("s/south - Go South");
                        System.out.println("e/east - Go East");
                        System.out.println("w/west - Go West");
                        System.out.println("run - run in the direction that the story goes");
                        System.out.println("follow Gertrude - follow wherever Gertrude goes");
                        System.out.println("look - Looks around at current location");
                        System.out.println("river - cross or swim through the river");
                        System.out.println("take - pick up something and add it to your inventory.");
                        System.out.println("quit - Exit the game");
                        System.out.println("hi - goodbye");
                        System.out.println("jump - Are you proud of yourself?");
                        System.out.println("yes/no - what?");
                        System.out.println("");
                        System.out.println("_________");
                    }
                    break;
                
                case "help":
                    if (action.equals("help")) {
                        System.out.println("_________");
                        System.out.println("");
                        System.out.println("n/north - Go North");
                        System.out.println("s/south - Go South");
                        System.out.println("e/east - Go East");
                        System.out.println("w/west - Go West");
                        System.out.println("run - run in the direction that the story goes");
                        System.out.println("follow Gertrude - follow wherever Gertrude goes");
                        System.out.println("look - Looks around at current location");
                        System.out.println("river - cross or swim through the river");
                        System.out.println("take - pick up something and add it to your inventory.");
                        System.out.println("quit - Exit the game");
                        System.out.println("hi - goodbye");
                        System.out.println("jump - Are you proud of yourself?");
                        System.out.println("yes/no - what?");
                        System.out.println("");
                        System.out.println("_________");
                    }
                    break;
                    
                case "follow Gertrude":
                    if (action.equals("follow Gertrude")) {
                        System.out.println("");
                        System.out.println("You follow Gertrude.. walking behind him as two guards open the rusted iron gates.");
                        System.out.println("You continue to follow Gertrude to a lavish door, with gold trim, around, what seems to be, the most expensive wood, carved with the pattern of the royal crest of the Denos family...");
                        System.out.println("Gertrude knocks on the door, twice, repeating a similar rhythm back to someone on the other side.");
                        castle();
                        return;
                    }
                    break;
                    
                case "north":
                    if (action.equals("north")) {
                        System.out.println("");
                        System.out.println("You walk to the North and stumble upon a border that stretches wide.. signaling the edge of the kingdom.");
                    }
                    break;
                 
                case "n":
                    if (action.equals("n")) {
                        System.out.println("");
                        System.out.println("You walk to the North and stumble upon a border that stretches wide.. signaling the edge of the kingdom.");
                    }
                    break;
                    
                case "east":
                    if (action.equals("east")) {
                        System.out.println("");
                        System.out.println("You walk to the East, heading up the rolling hills. ");
                        System.out.println("Whilst making your way up the hill, you stumble..");
                        System.out.println("Tripping over a rock, you begin to tumble down the other side of the hill.");
                        System.out.println("Once your fall ends, you find yourself near the river banks...");
                        System.out.println("As you get to your feet, you look to your right, seeing the glorious mountains behind the castle pierce the sky.");
                        System.out.println("You walk forward, looking into the river, beautiful and pleasant, it's the clearest water near the kingdom, kept away from all of the pollution...");
                        System.out.println("You look further across the river to see the Rosared Forest, with its thick evergreen trees...");
                        System.out.println("It stretches far and wide..\nLegend says that it never ends...");
                    }
                    break;
                    
                case "e":
                    if (action.equals("e")) {
                        System.out.println("");
                        System.out.println("You walk to the East, heading up the rolling hills. ");
                        System.out.println("Whilst making your way up the hill, you stumble..");
                        System.out.println("Tripping over a rock, you begin to tumble down the other side of the hill.");
                        System.out.println("Once your fall ends, you find yourself near the river banks...");
                        System.out.println("As you get to your feet, you look to your right, seeing the glorious mountains behind the castle pierce the sky.");
                        System.out.println("You walk forward, looking into the river, beautiful and pleasant, it's the clearest water near the kingdom, kept away from all of the pollution...");
                        System.out.println("You look further across the river to see the Rosared Forest, with its thick evergreen trees...");
                        System.out.println("It stretches far and wide..\nLegend says that it never ends...");
                    }
                    break;
                
                case "river":
                    if (action.equals("river")) {
                        System.out.println("");
                        System.out.println("You step into the river..");
                        System.out.println("Slipping down into the river bank...");
                        System.out.println("While the water violently rushes past you, attempting to pull you under, you steadily make your way to the other side.");
                        System.out.println("When you finally reach land, you step out of the water and shake yourself off.");
                        System.out.println("As you walk forward, you notice something through the trees...");
                        System.out.println("A piercing, green light...");
                        System.out.println("It seems like it's coming towards you...");
                        System.out.println("There is nothing you can do, but to run...");
                        if (action.equals("run")) {
                            System.out.println("You weren't fast enough..");
                            System.out.println(" ");
                            System.out.println("The last thing you saw was the green light, coming from the eyes of a demon-like creature with strength like no other...");
                            System.out.println("This was your end...");
                            System.exit(0);
                        }
                    }
                    break;
                    
                case "run":
                    if (action.equals("run")) {
                        System.out.println("");
                        System.out.println("You weren't fast enough..");
                        System.out.println(" ");
                        System.out.println("The last thing you saw was the green light, coming from the eyes of a demon-like creature with strength like no other...");
                        System.out.println("This was your end...");
                        System.exit(0);
                        }
                    break;
                    
                case "south":
                    if (action.equals("south")) {
                        System.out.println("");
                        System.out.println("You walk South, from the field, onto a dirt path..");
                        System.out.println("Soon, you enter the view of the castle of Ethodyne.");
                        System.out.println("You walk up to the first castle door seeing Broot, one of the royal knights, and his lackey Gravten open the thick, wood door...");
                        System.out.println("You walk through the market, getting oohs and aahs by the maidens and townspeople...");
                        System.out.println("Soon, you spot Gertrude walking in the direction of the palace...");
                        System.out.println("You decide to follow him..");
                        System.out.println(" ");
                        System.out.println("Walking closely behind him as two guards open the rusted iron gates...");
                        System.out.println("You continue to follow him to a lavish door, with gold trim, around, what seems to be, the most expensive wood, carved with the pattern of the royal crest of the Denos family...");
                        System.out.println("Gertrude knocks on the door, twice, repeating a similar rhythm back to someone on the other side.");
                        castle();
                        return;
                    }
                    break;
                
                case "s":
                    if (action.equals("s")) {
                        System.out.println("");
                        System.out.println("You walk South, from the field, onto a dirt path..");
                        System.out.println("Soon, you enter the view of the castle of Ethodyne.");
                        System.out.println("You walk up to the first castle door seeing Broot, one of the royal knights, and his lackey Gravten open the thick, wood door...");
                        System.out.println("You walk through the market, getting oohs and aahs by the maidens and townspeople...");
                        System.out.println("Soon, you spot Gertrude walking in the direction of the palace...");
                        System.out.println("You decide to follow him..");
                        System.out.println(" ");
                        System.out.println("Walking closely behind him as two guards open the rusted iron gates...");
                        System.out.println("You continue to follow him to a lavish door, with gold trim, around, what seems to be, the most expensive wood, carved with the pattern of the royal crest of the Denos family...");
                        System.out.println("Gertrude knocks on the door, twice, repeating a similar rhythm back to someone on the other side.");
                        castle();
                        return;
                    }
                    break;
                    
                case "west":
                    if (action.equals("west")) {
                        System.out.println("");
                        System.out.println("A large field with many acres of grazing, green grass and a giant apple tree.");
                    }
                    break;
                
                case "w":
                    if (action.equals("w")) {
                        System.out.println("");
                        System.out.println("A large field with many acres of grazing, green grass and a giant apple tree.");
                    }
                    break;
                    
                case "look":
                    System.out.println("");
                    System.out.println("You see many things...");
                    System.out.println("A large body of water that flows through the entire kingdom.");
                    System.out.println("A border that stretches wide, signaling the edge of the kingdom.");
                    System.out.println("A castle structure with a palace interior.");
                    System.out.println("A large field with many acres of grazing, green grass and a giant apple tree that lead up, and over, a small hill.");
                    break;
                    
                case "take":
                    action = prompt("Take what? ");
                    System.out.println("It seems the lazy game developers won't let you take that.");
                    break;
                    
                case "hi":
                    if (action.equals("hi")) {
                        System.out.println("Bye :P");
                    }
                    break;
                
                case "jump":
                    if (action.equals("jump")) {
                        System.out.println("Are you proud of yourself?");
                    }
                    break;
                
                case "no":
                    if (action.equals("no")) {
                        System.out.println("No what?");
                    }
                    break;
                
                case "yes":
                    if (action.equals("yes")) {
                        System.out.println("Yes what?");
                    }
                    break;
                
                case "what":
                    if (action.equals("what")) {
                        System.out.println("You annoy me");
                    }
                    break;
                
                case "so":
                    if (action.equals("so")) {
                        System.out.println("Please leave.");
                    }
                    break;
                    
                case " ":
                    if (action.equals(" ")) {
                        System.out.println("I beg your pardon?");
                    }
                    break;
                    
                case "quit":
                    System.out.println("Bye Loser!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("The lazy game developers haven't taught you how to do that yet...");
                    break;
            }
        }
    }
    
    private void castle() {
        
        System.out.println("");
        System.out.println("The palace doors open, revealing an eloquent interior, large walls with velvet drapes, with a candle-stick chandelier, glowing the ceiling of a similar wood to the door of the palace, but only darker.");
        System.out.println("You move to the center of the room, looking up to find two people sitting in the thrones, your “parents”, King Osiris Denos III, and Queen Adeline Denos.");
        System.out.println("");
            
        System.out.println("‘‘Aimilios, we’ve called you to ask a favor...no...an ORDER for you‘‘ The queen says.");
        System.out.println("‘‘You know about the..Sorceress...don’t you?‘‘ The king finally speaks up.");
        System.out.println("You gulp, the rumors about her are nothing short but fairy tales and stories to make their kids stay in their cottage,\nbut you know from growing up that the rumors are true...");
        System.out.println("");
        System.out.println("After being adopted by the King and Queen, there was an event that put the kingdom on edge...");
        System.out.println("A little girl went rampant for some reason...\nher magical power and aura was terrifying, from what the royal knights recall from it");
        System.out.println("They said that if they weren’t there, the whole kingdom would have fallen, and it would be catastrophic...");
        System.out.println("");
        System.out.println("Your nerves high..");
        System.out.println("you whisper a quiet response, just loud enough so that they can hear, ‘‘Yes...your majesty’‘.");
        System.out.println("");
        System.out.println("‘‘Well then…you should know of this wretched curse that she casts over us, the curse that’s putting the lives of everyone at risk..right son?‘‘ The queen speaks.");
        System.out.println("");
        System.out.println("You nod your head to reply.");
        System.out.println("");
        System.out.println("‘‘Do you know the reason why we adopted you from the slums that we called an orphanage?‘‘ She says.");
        System.out.println("‘‘Because one day, we knew that there would be a young,cunning, and brave warrior in you...dear son‘‘");
        System.out.println("");
        System.out.println("‘‘That is why...you’ll be the one to stop this curse‘‘ The king continues on.");
        System.out.println("‘‘That is why you’ll bring the sorceress' head...as it is your destiny to save us all…’’");
        System.out.println("");
        
        while (true) {
            
            String action = prompt("What do you want to do? ");
            
            switch (action) {
                
                case "HELP":
                    if (action.equals("HELP")) {
                        System.out.println("_________");
                        System.out.println("");
                        System.out.println("n/north - Go North");
                        System.out.println("s/south - Go South");
                        System.out.println("e/east - Go East");
                        System.out.println("w/west - Go West");
                        System.out.println("kneel - kneel down to the Royals and accept the mission");
                        System.out.println("look - Looks around at current location");
                        System.out.println("kill it - kill whatever is challenging you atm");
                        System.out.println("take - pick up something and add it to your inventory.");
                        System.out.println("break - take a bathroom break.. irl or in game :)");
                        System.out.println("quit - Exit the game");
                        System.out.println("hi - goodbye");
                        System.out.println("jump - Are you proud of yourself?");
                        System.out.println("yes/no - what?");
                        System.out.println("what - You annoy me");
                        System.out.println("so - please leave");
                        System.out.println("");
                        System.out.println("_________");
                    }
                    break;
                
                case "kneel":
                    System.out.println("You kneel down to the Royals...");
                    System.out.println("They thank you for following your destiny...");
                    System.out.println(" ");
                    System.out.println("''The Higher Power thanks you...'' said the Queen.");
                    System.out.println(" ");
                    System.out.println("You notice your sword on the ground.");
                    System.out.println(" ");
                    break;
                
                case "take":
                    action = prompt("Take what? ");
                    if (action.equals("sword") && !player.has("sword")) {
                        System.out.println("You take the sword. It is sterling silver.");
                        player.take("sword");
                    } else if (action.equals("sword") && player.has("sword")) {
                        System.out.println("You already have it in inventory silly.");
                    } else {
                        System.out.println("It seems the lazy game developer won't let you take that.");
                    }
                    
                    System.out.println("You notice Gertrude waving you to your chambers..");
                    break;
                
                case "follow Gertrude":
                    if (action.equals("follow Gertrude")) {
                        System.out.println("");
                        System.out.println("You follow Gertrude.. walking over to him, soon to enter your chambers...");
                        System.out.println("Before you enter the room, you hear a sound..");
                        System.out.println("A hiss...");
                        System.out.println("");
                        System.out.println("You open the door, and walk towards the closet, unsure where exactly the noise is coming from...");
                        System.out.println("And as you open the door to get your gear, it pops out...");
                        System.out.println("A basilisk.");
                        System.out.println("");
                    }
                    break;
                
                case "north":
                    if (action.equals("north")) {
                        System.out.println(" ");
                        System.out.println("You walk up to your ´´parents´´...");
                        System.out.println("You stare them in the eyes and accept your mission.");
                        System.out.println("With nothing left to say, you make your way to your chambers.");
                        System.out.println("Before you enter the room, you hear a sound..");
                        System.out.println("A hiss...");
                        System.out.println("");
                        System.out.println("You open the door, and walk towards the closet, unsure where exactly the noise is coming from...");
                        System.out.println("And as you open the door to get your gear, it pops out...");
                        System.out.println("A basilisk.");
                        System.out.println(" ");
                    }
                    break;
                    
                case "n":
                    if (action.equals("n")) {
                        System.out.println(" ");
                        System.out.println("You walk up to your ´´parents´´...");
                        System.out.println("You stare them in the eyes and accept your mission.");
                        System.out.println("With nothing left to say, you make your way to your chambers.");
                        System.out.println("Before you enter the room, you hear a sound..");
                        System.out.println("A hiss...");
                        System.out.println("");
                        System.out.println("You open the door, and walk towards the closet, unsure where exactly the noise is coming from...");
                        System.out.println("And as you open the door to get your gear, it pops out...");
                        System.out.println("A basilisk.");
                        System.out.println(" ");
                    }
                    break;
                    
                case "east":
                    if (action.equals("east")) {
                        System.out.println(" ");
                        System.out.println("You head to your East.. walking out of the West side of the castle.");
                        System.out.println("You make your way back to the field and lay down on the grass.");
                        System.out.println("With your back to the grass, you stare up at the Sun..");
                        System.out.println(" ");
                        System.out.println("You close your eyes and contemplate...");
                        System.out.println("´´What to do.. what to do...?´´");
                        tobecontinued();
                    }
                    break;
                
                case "e":
                    if (action.equals("e")) {
                        System.out.println(" ");
                        System.out.println("You head to your East.. walking out of the West side of the castle.");
                        System.out.println("You make your way back to the field and lay down on the grass.");
                        System.out.println("With your back to the grass, you stare up at the Sun..");
                        System.out.println(" ");
                        System.out.println("You close your eyes and contemplate...");
                        System.out.println("´´What to do.. what to do...?´´");
                        tobecontinued();
                    }
                    break;
                case "south":
                    if (action.equals("south")) {
                        System.out.println("");
                        System.out.println("You head to your South, walking out of the front end of the Castle...");
                        System.out.println("You make your way through the village, back to the field...");
                        System.out.println("You decide to lay down on the grass and stare up at the Sun..");
                        System.out.println(" ");
                        System.out.println("You close your eyes and contemplate...");
                        System.out.println("´´What to do.. what to do...?´´");
                    }
                    break;
                
                case "s":
                    if (action.equals("s")) {
                        System.out.println("");
                        System.out.println("You head to your South, walking out of the front end of the Castle...");
                        System.out.println("You make your way through the village, back to the field...");
                        System.out.println("You decide to lay down on the grass and stare up at the Sun..");
                        System.out.println(" ");
                        System.out.println("You close your eyes and contemplate...");
                        System.out.println("´´What to do.. what to do...?´´");
                    }
                    break;
                
                case "west":
                    if (action.equals("west")) {
                        System.out.println("");
                        System.out.println("You head to your west, walking towards your chambers.");
                        System.out.println("Before you enter the room, you hear a sound..");
                        System.out.println("A hiss...");
                        System.out.println("");
                        System.out.println("You open the door, and walk towards the closet, unsure where exactly the noise is coming from...");
                        System.out.println("And as you open the door to get your gear, it pops out...");
                        System.out.println("A basilisk.");
                        System.out.println("");
                    }
                    break;
                
                case "w":
                    if (action.equals("w")) {
                        System.out.println("");
                        System.out.println("You head to your west, walking towards your chambers.");
                        System.out.println("Before you enter the room, you hear a sound..");
                        System.out.println("A hiss...");
                        System.out.println("");
                        System.out.println("You open the door, and walk towards the closet, unsure where exactly the noise is coming from...");
                        System.out.println("And as you open the door to get your gear, it pops out...");
                        System.out.println("A basilisk.");
                        System.out.println("");
                    }
                    break;
                
                case "kill it":
                    action = prompt("Kill what? ");
                    if (action.equals("basilisk") && player.has("sword")) {
                        System.out.println("You take out the sword and swing it with all your might...");
                        System.out.println("It hits the edge of the beast, drawing blood..");
                        System.out.println("It lunges towards you, making you fall backwards, dropping your sword.");
                        System.out.println("As it looms over your body, you reach for your sword..");
                        System.out.println("After a second, your hands finally reach the hilt of the sword.");
                        System.out.println(" ");
                        System.out.println("You swing the sword over and hit the neck of the Basilisk...");
                        System.out.println("chopping its head clean off...");
                        System.out.println("Covered in its blood, you get up and head to your closet.");
                        System.out.println("´´Well, we´re off to a great start...´´ you say.");
                        System.out.println(" ");
                        
                        tobecontinued();
                        return;
                    } else if (!player.has("sword")) {
                        System.out.println("You're dead, you should have gotten the sword.");
                        tobecontinued();
                        return;
                    } else {
                        System.out.println("You didn´t spell it correctly...");
                    }
                    break;
                    
                case "break":
                    System.out.println("The lazy player wants to take a bathroom break, so type ''back'' when you get back..");
                    break;
                   
                case "back":
                    System.out.println("Let´s start back then.");
                    break;
                
                case "look":
                    System.out.println("The lazy game developers haven´t made anything new and cool for you to see...");
                    break;
                    
                case "hi":
                    if (action.equals("hi")) {
                        System.out.println("Bye :P");
                    }
                    break;
                
                case "jump":
                    if (action.equals("jump")) {
                        System.out.println("Are you proud of yourself?");
                    }
                    break;
                
                case "no":
                    if (action.equals("no")) {
                        System.out.println("No what?");
                    }
                    break;
                
                case "yes":
                    if (action.equals("yes")) {
                        System.out.println("Yes what?");
                    }
                    break;
                
                case "what":
                    if (action.equals("what")) {
                        System.out.println("You annoy me");
                    }
                    break;
                
                case "so":
                    if (action.equals("so")) {
                        System.out.println("Please leave.");
                    }
                    break;
                    
                case " ":
                    if (action.equals(" ")) {
                        System.out.println("I beg your pardon?");
                    }
                    break;
                    
                case "quit":
                    System.out.println("Bye Loser!");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("The lazy game developers haven't taught you how to do that yet...");
                    break;
            }
        }
        
    }
    
    private void tobecontinued() {
        System.out.println("_________");
        System.out.println("");
        System.out.println("TO BE CONTINUED");
        System.out.println(" ");
        System.out.println("It seems like there would be more to the story\n if the programmers had time to add it...");
        System.out.println("Mr. Hagler...");
        System.out.println("");
        System.out.println("_________");
        System.exit(0);
    }
}