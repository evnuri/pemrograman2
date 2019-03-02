package lat1pertemuan11;
import java.io.*;
import java.util.Scanner;

public class WritetoFile {

        public static void main(String[] args){

            int menu;
            int choice;
            String read;
            choice = 0;

            BufferedWriter outs;
            BufferedReader ins;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner input = new Scanner(System.in);


            System.out.println(" 1. Add a Book ");
            System.out.println(" 2. Display All Book ");
            System.out.println(" 3. Exit ");
            System.out.print("Enter Your Choice: ");
            menu = input.nextInt(); //membaca inputan


            while(menu != 3){
                switch(menu){
                    //pilih 1
                    case 1:
                        while(choice != 2){
                            try{
                                System.out.println("");
                                System.out.println("Input The Book's Data");
                                System.out.print("Title: ");
                                String title = br.readLine();
                                System.out.print("Writer: ");
                                String writer = br.readLine();
                                System.out.print("Year: ");
                                String year = br.readLine();
                                try{
                                    outs = new BufferedWriter(new FileWriter("BookStore.txt",true));

                                    outs.write("Book entitle " + title + " written by " + writer + " in " + year + ".");
                                    outs.newLine();

                                    outs.close();
                                }catch(IOException e){
                                    System.out.println("There was a problem found: " + e);
                                }
                            }catch(IOException e){
                                System.out.println("There was a problem: " + e);
                            }
                            System.out.print("Input Another Book? (1. Yes 2. No) :");
                            choice = input.nextInt();
                        } break;
                    //pilih 2
                    case 2:
                        System.out.println("");
                        System.out.println("The List");
                        try{
                            ins = new BufferedReader(new FileReader("BookStore.txt"));

                            while((read = ins.readLine()) != null){
                                System.out.println(read);
                                read+=read+"\n";
                            }

                            ins.close();
                        }catch(IOException e){
                            System.out.println("There was a problem found: " + e);
                        }
                }

                System.out.println("");
                System.out.println(" 1. Add a Book ");
                System.out.println(" 2. Display All Book ");
                System.out.println(" 3. Exit ");
                System.out.print("Enter Your Choice: ");
                menu = input.nextInt();
            }

        }

    }

