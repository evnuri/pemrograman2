package tugas1dan2pertemuan11;

import java.io.*;
import java.util.Scanner;

public class AddressBook {

        public static void main(String[] args){

            int addressbookchoice;
            int choice;
            String read;
            choice = 0;

            BufferedWriter outs;
            BufferedReader ins;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner input = new Scanner(System.in);

            System.out.println("==============================================");
            System.out.println("                 Address Book                 ");
            System.out.println("==============================================");
            System.out.println("1. Add New Address");
            System.out.println("2. Display All Address");
            System.out.println("==============================================");
            System.out.print("Enter Your Choice: ");
            addressbookchoice = input.nextInt();


            while(addressbookchoice != 2){
                switch(addressbookchoice){

                    case 1:
                        while(choice != 2){
                            try{
                                System.out.println("");
                                System.out.println("Input Data");
                                System.out.print("Name: ");
                                String name = br.readLine();
                                System.out.print("Address: ");
                                String address = br.readLine();
                                System.out.print("Handphone Number: ");
                                String nohp = br.readLine();
                                try{
                                    outs = new BufferedWriter(new FileWriter("AddressBook.dat",true));

                                    outs.write("Name: " + name + " Address: " + address + "Handphone Number: " + nohp + ".");
                                    outs.newLine();

                                    outs.close();
                                }catch(IOException e){
                                    System.out.println("There was a problem found: " + e);
                                }
                            }catch(IOException e){
                                System.out.println("There was a problem: " + e);
                            }
                            System.out.print("Input Another Address? (1. Yes 2. No) :");
                            choice = input.nextInt();
                        } break;

                    case 2:
                        System.out.println("");
                        System.out.println("The List");
                        try{
                            ins = new BufferedReader(new FileReader("AddressBook.dat"));

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
                System.out.println(" 1. Add New Address ");
                System.out.println(" 2. Display All Address ");
                System.out.println(" 3. Exit ");
                System.out.print("Enter Your Choice: ");
                addressbookchoice = input.nextInt();
            }

        }

    }

