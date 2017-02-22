
public class One {
        public static void main(String[] args) {
        char[] word = new char[8]; // initializing an array of chars, setting it to 8, as in we can't have more than that.
            word[0] = 'P'; // we set the Zeroth index of the char array to the char 'P', now our word[0] contains 'P'
            word[5] = 'I'; // we set the Fifth index of the char array to the char 'I', now our word[5] contains 'I'
            word[7] = 'E'; //we set the Seventh index of the char array to the char 'E', now our word[7] contains 'E'
            word[2] = 65;  //Based on the ASCII table, the number 65 yields to the char 'A', we now set the 2nd index of the char array to the char 'A', now our word[2] contains 'A'
            word[3] = 65+2; // 65 + 2 = 67, Based on the ASCII table, the number 67 yields to the char 'C', we now set the 3rd index of the char array to the char 'C', now our word[3] contains 'C'
            word[6] = word[3]; //our sixth index of the char array (word[6]) now contains whatever our 3rd index of the char array has (word[3]), which is 'C'. therefor, the word[6] now has 'C'
            word[1] =(char)(word[0] + 2); //our first index of the char array has a char of whatever the zeroth index of the char array contained and we add two to that. (Our zeroth index contained 'P', we add two to 'P', we get 'R')  (Remember we're not adding to the index here, we're adding to whatever that index contained)
            word[4] = (char)(word[1] + 2);// same thing here. at index one we have 'R' and 'R' + 2 is T so we now have T store in index 4
            // word[0] = 'P' word[1] = 'R' word[2] = 'A' word[3] = 'C' word[4] = 'T' word[5] = 'I' word[6] = 'C' word[7] ='E' 
            for(int i = 0; i<word.length; i++){
            System.out.print(word[i]);  // we now loop over the array to print out what we have at every index, our for loop ends when the char word array ends. (loops over the whole array of chars)
            //So for our first iteration we will print out word[0]
            //2nd iteration we will print out word[1]
            //3rd we will print out word[2] etc..
        }
        System.out.println("");
        }// end main
}