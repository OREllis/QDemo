class QDemo{
    public static void main(String args[]){
        Queue bigQ = new Queue(100),
                smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        //put some numbers into bigQ
        for (i=0; i<26; i++)
            bigQ.put((char) ('A' + i));

        //retrieve and display elements from bigQ
        System.out.println("Contents of bigQ");
        for (i =0; i<26; i++){
            ch  = bigQ.get();
            if (ch != ((char)0) )System.out.print(ch);
        }

        System.out.print("\n");


        System.out.println("Using smallQ to display errors");
        for (i = 0; i < 5; i++) {
            System.out.println("attempting to store "+  (char)('Z'-i));
            smallQ.put((char)('Z' - i));
            System.out.println();
        }
        System.out.println();


        //more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for (i = 0;  i<5 ; i++) {
            ch = smallQ.get();
            if(ch != (char)  0) System.out.print(ch);
        }
    }
}