package java_String;

public class CountVowelsAndConsonants {
    public static void HowManyVowelsAndConsonantsInThisString(String str){
        str=str.toLowerCase();
        int countVowels=0;
        int countConsonants=0;
        for(int i=0;i<=(str.length()-1);i++){
         if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
         countVowels++;
         }else {
             countConsonants++;
         }

         }

        System.out.println("Number of vowels:" + countVowels);
        System.out.println("Number of consonants : "+ countConsonants);
        }

    public static void main(String[] args) {
        HowManyVowelsAndConsonantsInThisString("Count the number of vowels and consonants");
    }

    }

