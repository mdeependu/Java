package com.r177219068.q1;

public class Exception {

	public static void main(String[] args) {
		
		Students[] Stu;

        Stu = new Students[10];

        Stu[0] = new Students("Deependu",100);
        Stu[1] = new Students("Gaurav",92);
        Stu[2] = new Students("Shweta",93);
        Stu[3] = new Students("Tony",94);
        Stu[4] = new Students("Sarthak",95);
        Stu[5] = new Students("Jarvis",96);
        Stu[6] = new Students("Loki",97);
        Stu[7] = new Students("Mayank",98);
        Stu[8] = new Students("Aditya",99);
        Stu[9] = new Students("Rudraksh",100);

        try
        {
            Stu[10] = new Students();

            Stu[10].print("Taylor",123);
        }
       
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Size of array out of bounds" + e );
        }
    }
}
