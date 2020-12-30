public class StringInitials { //Class to find initials of full name
    public static void main(String[] args) {
        String name = "Saatvik Arora"; //String for which we need to find initials
        // Traverse the string and
        // print the first character and characters after spaces i.e. the initials
        for (int loopOnPower = 0; loopOnPower < name.length(); loopOnPower++) {
            if (name.charAt(loopOnPower) == ' ') {
                System.out.print("Initials of the name are: "+name.charAt(0) +" " +name.charAt(loopOnPower + 1));
            }
        }
    }
}









![Initials](https://user-images.githubusercontent.com/74056455/103381255-46d7b100-4b11-11eb-8d31-79dc41ff6f3b.PNG)
