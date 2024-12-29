import java.util.Scanner;
public class Movement{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
	String playerInput = "e";
	int xpos;
	int playerxpos = 5;
	int temp = 0;

	System.out.print("Type a or d to move left or right. Type q to quit the program.");
	Thread.sleep(5000);
	System.out.print("\033[H\033[2J");
        System.out.flush();
	System.out.print("|   O   |");

	while (!(playerInput.equals("q"))){
	    playerInput = scanner.nextLine();
	    System.out.print("\033[H\033[2J");
            System.out.flush();
	    if (playerInput.equals("a") && !(playerxpos == 1)){
                playerxpos--;
	    }
	    else if (playerInput.equals("d") && !(playerxpos == 9)){
                playerxpos++;
	    }
            xpos = 0;
	    for (int i = 0; i <= 9; i++){
                xpos++;
		if (xpos == 1 || xpos == 9){
                    System.out.print("|");
		    }
		else if (xpos == playerxpos){
		    System.out.print("O");
		    }
		else{
                    System.out.print(" ");
		    }
		}
	    }
	}
    }
