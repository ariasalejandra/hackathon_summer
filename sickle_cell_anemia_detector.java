import java.util.*;
public class sickle_cell_anemia_detector{
    public static void main(String args[]){
        Scanner scanLine = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        int inputCode = 0;
        int y = 1;
        Boolean df1 = false, df2 = false, df3 = false, df4 = false, df5 = false, df6 = false, rf1 = false, rf2 = false, rf3 = false, rf4 = false, rf5 = false, rf6 = false;
        Boolean sickleCellAnemia = false;
        anemiaInfo def[] = new anemiaInfo[y];
        for(int x = 0; x < y; y++){
            System.out.println("What would you like to do?");
            System.out.println("1. Add User");
            System.out.println("2. Add default User");
            System.out.println("3. Find mutation/sickle cell anemia");
            System.out.println("4. End program");
            inputCode = scanNum.nextInt();
            if (inputCode == 1){
                System.out.println("What is the name?");
                String n1 = scanLine.nextLine();
                System.out.println("What is the first DNA Sequence?(Make sure all letters are capital");
                String f1 = scanLine.nextLine();
                System.out.println("What is the second DNA Sequence?");
                String f2 = scanLine.nextLine();
                System.out.println("What is the third DNA Sequence?");
                String f3 = scanLine.nextLine();
                System.out.println("What is the fourth DNA Sequence?");
                String f4 = scanLine.nextLine();
                System.out.println("What is the fifth DNA Sequence?");
                String f5 = scanLine.nextLine();
                System.out.println("What is the sixth DNA sequence?");
                String f6 = scanLine.nextLine();
                System.out.println("What is the first RNA Sequence?");
                String r1 = scanLine.nextLine();
                System.out.println("What is the second RNA Sequence?");
                String r2 = scanLine.nextLine();
                System.out.println("What is the third RNA Sequence?");
                String r3 = scanLine.nextLine();
                System.out.println("What is the fourth RNA Sequence?");
                String r4 = scanLine.nextLine();
                System.out.println("What is the fifth RNA Sequence?");
                String r5 = scanLine.nextLine();
                System.out.println("What is the sixth RNA Sequence?");
                String r6 = scanLine.nextLine();
                def[x] = new anemiaInfo(n1, f1, f2, f3, f4, f5, f6, r1, r2, r3, r4, r5,r6); 
            }
            else if (inputCode == 2){
                def[x] = new anemiaInfo();
            } else if(inputCode == 3){
                for (int z = 0; z < def.length; z++){
                    if(def[x] != null){
                        //first dna
                    if(def[x].getfirstDNA().substring(0,1).equals("T") || def[x].getfirstDNA().substring(0,1).equals("C") || def[x].getfirstDNA().substring(0,1).equals("A") || def[x].getfirstDNA().substring(0,1).equals("G")){
                        if(def[x].getfirstDNA().substring(1,2).equals("T") || def[x].getfirstDNA().substring(1,2).equals("C") || def[x].getfirstDNA().substring(1,2).equals("A") || def[x].getfirstDNA().substring(1,2).equals("G")){
                            if(def[x].getfirstDNA().substring(2).equals("T") || def[x].getfirstDNA().substring(2).equals("C") || def[x].getfirstDNA().substring(2).equals("A") || def[x].getfirstDNA().substring(2).equals("G")){
                                System.out.println("First sequence of DNA has passed!");
                                df1 = true;
                            } else {
                                System.out.println("First sequence of DNA did not pass");
                            }
                        }
                    } 
                    //second dna     
                    if(def[x].getsecondDNA().substring(0,1).equals("T") || def[x].getsecondDNA().substring(0,1).equals("C") || def[x].getsecondDNA().substring(0,1).equals("A") || def[x].getsecondDNA().substring(0,1).equals("G")){
                        if(def[x].getsecondDNA().substring(1,2).equals("T") || def[x].getsecondDNA().substring(1,2).equals("C") || def[x].getsecondDNA().substring(1,2).equals("A") || def[x].getsecondDNA().substring(1,2).equals("G")){
                            if(def[x].getsecondDNA().substring(2).equals("T") || def[x].getsecondDNA().substring(2).equals("C") || def[x].getsecondDNA().substring(2).equals("A") || def[x].getsecondDNA().substring(2).equals("G")){
                                System.out.println("Second sequence of DNA has passed!");
                                df2 = true;
                            } else {
                                 System.out.println("Second sequence of DNA did not pass");
                            }
                        }
                    }
                    //third dna
                    if(def[x].getthirdDNA().substring(0,1).equals("T") || def[x].getthirdDNA().substring(0,1).equals("C") || def[x].getthirdDNA().substring(0,1).equals("A") || def[x].getthirdDNA().substring(0,1).equals("G")){
                        if(def[x].getthirdDNA().substring(1,2).equals("T") || def[x].getthirdDNA().substring(1,2).equals("C") || def[x].getthirdDNA().substring(1,2).equals("A") || def[x].getthirdDNA().substring(1,2).equals("G")){
                            if(def[x].getthirdDNA().substring(2).equals("T") || def[x].getthirdDNA().substring(2).equals("C") || def[x].getthirdDNA().substring(2).equals("A") || def[x].getthirdDNA().substring(2).equals("G")){
                                System.out.println("Third sequence of DNA has passed!");
                                df3 = true;
                            } else {
                                System.out.println("Third sequence of DNA did not pass");
                            }
                        }
                    }
                    //fourth dna
                    if(def[x].getforthDNA().substring(0,1).equals("T") || def[x].getforthDNA().substring(0,1).equals("C") || def[x].getforthDNA().substring(0,1).equals("A") || def[x].getforthDNA().substring(0,1).equals("G")){
                        if(def[x].getforthDNA().substring(1,2).equals("T") || def[x].getforthDNA().substring(1,2).equals("C") || def[x].getforthDNA().substring(1,2).equals("A") || def[x].getforthDNA().substring(1,2).equals("G")){
                            if(def[x].getforthDNA().substring(2).equals("T") || def[x].getforthDNA().substring(2).equals("C") || def[x].getforthDNA().substring(2).equals("A") || def[x].getforthDNA().substring(2).equals("G")){
                                System.out.println("Fourth sequence of DNA has passed!");
                                df4 = true;
                            } else {
                                System.out.println("Fourth sequence of DNA did not pass");
                            }
                        }
                    }
                    //fifth dna
                    if(def[x].getfifthDNA().substring(0,1).equals("T") || def[x].getfifthDNA().substring(0,1).equals("C") || def[x].getfifthDNA().substring(0,1).equals("A") || def[x].getfifthDNA().substring(0,1).equals("G")){
                        if(def[x].getfifthDNA().substring(1,2).equals("T") || def[x].getfifthDNA().substring(1,2).equals("C") || def[x].getfifthDNA().substring(1,2).equals("A") || def[x].getfifthDNA().substring(1,2).equals("G")){
                            if(def[x].getfifthDNA().substring(2).equals("T") || def[x].getfifthDNA().substring(2).equals("C") || def[x].getfifthDNA().substring(2).equals("A") || def[x].getfifthDNA().substring(2).equals("G")){
                                System.out.println("Fifth sequence of DNA has passed!");
                                df5 = true;
                            } else {
                                System.out.println("Fifth sequence of DNA did not pass");
                            }
                        }
                    }
                    //6th dna
                    if(def[x].getsixthDNA().substring(0,1).equals("T") || def[x].getsixthDNA().substring(0,1).equals("C") || def[x].getsixthDNA().substring(0,1).equals("A") || def[x].getsixthDNA().substring(0,1).equals("G")){
                        if(def[x].getsixthDNA().substring(1,2).equals("T")){
                            sickleCellAnemia = true;
                            if(def[x].getsixthDNA().substring(2).equals("T") || def[x].getsixthDNA().substring(2).equals("C") || def[x].getsixthDNA().substring(2).equals("A") || def[x].getsixthDNA().substring(2).equals("G")){
                                System.out.println("Sixth sequence of DNA has passed!");
                                df6 = true;
                            } else {
                                System.out.println("Sixth sequence of DNA did not pass");
                            }
                        }
                    }
                    //first rna
                    if(def[x].getfirstRNA().substring(0,1).equals("U") || def[x].getfirstRNA().substring(0,1).equals("C") || def[x].getfirstRNA().substring(0,1).equals("A") || def[x].getfirstRNA().substring(0,1).equals("G")){
                        if(def[x].getfirstRNA().substring(1,2).equals("U") || def[x].getfirstRNA().substring(1,2).equals("C") || def[x].getfirstRNA().substring(1,2).equals("A") || def[x].getfirstRNA().substring(1,2).equals("G")){
                            if(def[x].getfirstRNA().substring(2).equals("U") || def[x].getfirstRNA().substring(2).equals("C") || def[x].getfirstRNA().substring(2).equals("A") || def[x].getfirstRNA().substring(2).equals("G")){
                                System.out.println("First sequence of RNA has passed!");
                                rf1 = true;
                            } else {
                                System.out.println("First sequence of RNA did not pass");
                            }
                        }
                    }
                    //second rna
                    if(def[x].getsecondRNA().substring(0,1).equals("U") || def[x].getsecondRNA().substring(0,1).equals("C") || def[x].getsecondRNA().substring(0,1).equals("A") || def[x].getsecondRNA().substring(0,1).equals("G")){
                        if(def[x].getsecondRNA().substring(1,2).equals("U") || def[x].getsecondRNA().substring(1,2).equals("C") || def[x].getsecondRNA().substring(1,2).equals("A") || def[x].getsecondRNA().substring(1,2).equals("G")){
                            if(def[x].getsecondRNA().substring(2).equals("U") || def[x].getsecondRNA().substring(2).equals("C") || def[x].getsecondRNA().substring(2).equals("A") || def[x].getsecondRNA().substring(2).equals("G")){
                                System.out.println("Second sequence of RNA has passed!");
                                rf2 = true;
                            } else {
                                System.out.println("Second second of RNA did not pass");
                            }
                        }
                    }
                    //third rna
                    if(def[x].getthirdRNA().substring(0,1).equals("U") || def[x].getthirdRNA().substring(0,1).equals("C") || def[x].getthirdRNA().substring(0,1).equals("A") || def[x].getthirdRNA().substring(0,1).equals("G")){
                        if(def[x].getthirdRNA().substring(1,2).equals("U") || def[x].getthirdRNA().substring(1,2).equals("C") || def[x].getthirdRNA().substring(1,2).equals("A") || def[x].getthirdRNA().substring(1,2).equals("G")){
                            if(def[x].getthirdRNA().substring(2).equals("U") || def[x].getthirdRNA().substring(2).equals("C") || def[x].getthirdRNA().substring(2).equals("A") || def[x].getthirdRNA().substring(2).equals("G")){
                                System.out.println("Third sequence of RNA has passed!");
                                rf3 = true;
                            } else {
                                System.out.println("Third sequence of RNA did not pass");
                            }
                        }
                    }
                    //forth rna
                    if(def[x].getforthRNA().substring(0,1).equals("U") || def[x].getforthRNA().substring(0,1).equals("C") || def[x].getforthRNA().substring(0,1).equals("A") || def[x].getforthRNA().substring(0,1).equals("G")){
                        if(def[x].getforthRNA().substring(1,2).equals("U") || def[x].getforthRNA().substring(1,2).equals("C") || def[x].getforthRNA().substring(1,2).equals("A") || def[x].getforthRNA().substring(1,2).equals("G")){
                            if(def[x].getforthRNA().substring(2).equals("U") || def[x].getforthRNA().substring(2).equals("C") || def[x].getforthRNA().substring(2).equals("A") || def[x].getforthRNA().substring(2).equals("G")){
                                System.out.println("Forth sequence of RNA has passed!");
                                rf4 = true;
                            } else {
                                System.out.println("Forth sequence of RNA did not pass");
                            }
                        }
                    }
                    //fifth rna
                    if(def[x].getfifthRNA().substring(0,1).equals("U") || def[x].getfifthRNA().substring(0,1).equals("C") || def[x].getfifthRNA().substring(0,1).equals("A") || def[x].getfifthRNA().substring(0,1).equals("G")){
                        if(def[x].getfifthRNA().substring(1,2).equals("U") || def[x].getfifthRNA().substring(1,2).equals("C") || def[x].getfifthRNA().substring(1,2).equals("A") || def[x].getfifthRNA().substring(1,2).equals("G")){
                            if(def[x].getfifthRNA().substring(2).equals("U") || def[x].getfifthRNA().substring(2).equals("C") || def[x].getfifthRNA().substring(2).equals("A") || def[x].getfifthRNA().substring(2).equals("G")){
                                System.out.println("Fifth sequence of RNA has passed!");
                                rf5 = true;
                            } else {
                                System.out.println("Fifth sequence of RNA did not pass");
                            }
                        }
                    }
                    if(def[x].getsixthRNA().substring(0,1).equals("U") || def[x].getsixthRNA().substring(0,1).equals("C") || def[x].getsixthRNA().substring(0,1).equals("A") || def[x].getsixthRNA().substring(0,1).equals("G")){
                        if(def[x].getsixthRNA().substring(1,2).equals("A")){
                            sickleCellAnemia = true;
                            if(def[x].getsixthRNA().substring(2).equals("U") || def[x].getsixthRNA().substring(2).equals("C") || def[x].getsixthRNA().substring(2).equals("A") || def[x].getsixthRNA().substring(2).equals("G")){
                                System.out.println("Sixth sequence of RNA has passed!");
                                rf6 = true;
                            } else {
                                System.out.println("Sixth sequence of RNA did not pass");
                            }
                        }
                    }
                    //sixth rna
                    if(sickleCellAnemia == true){
                        System.out.println("Based on the findings, "+ def[x].getName()+", does have any genetic mutations/sickle cell anemia");
                    } else if (df1 == true && df2 == true && df3 == true && df4 == true && df5 == true && df6 == true && rf1 == true && rf2 == true && rf3 == true && rf4 == true && rf5 == true && rf6 == true){
                        System.out.println("Based on the findings, "+def[x].getName()+", does not have a genetic mutation/sickle cell anemia");
                    }

                }
               
              }  
            } else if(inputCode == 4){
                y = 0;
            }
        }
    }
}
    
