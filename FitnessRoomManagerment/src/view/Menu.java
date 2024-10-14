package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {

    private String title;
    private ArrayList choices;
    public Scanner sc = new Scanner(System.in);

    public Menu() {
        choices = new ArrayList();
    }

    public Menu(String title, String[] mchon) {
        this.title = title;
        choices = new ArrayList<>();
        for (String m : mchon) {
            choices.add(m);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        for(String ch:choices)
        {
            this.choices.add(ch);
        }
        
    }
//----------------------------------------------------

    public void display() {
        System.out.println(title);
        System.out.println("-------------------");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
        System.out.println("-------------------");
    }
//----------------------------------------------------

    public int getSelected() {
        display();
        while(true)
        {
            System.out.print("Enter your choice: ");
            try{
                int ch=sc.nextInt();sc.nextLine();
                return ch;
            }
            catch(Exception e)
            {
                sc.nextLine();
                System.out.println("Invalid Number!!!");
            }
        }
    }
//----------------------------------------------------

    public abstract int execute(int ch);
//----------------------------------------------------

    public void run() {
        while (true) {
            int ch = getSelected();
            if (ch> 0 && ch <=choices.size()) {
                if(execute(ch)==1)
                    break;
            }
            else {
                System.out.println("Please re-choice your option!!!!");
                continue;
            }
        }
    }
}
