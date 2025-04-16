package STS;

public class lexicographically {
    static int MAX_CHAR = 26;
 //function to calculate frequency of each character in string
 static void countfreq(String str,int freq[],int len)
 {
    for(int i =0;i<len;i++)
    {
        freq[str.charAt(i)-'a']++;
    }
 }
 //function to check whether it will make a palindrome or not
 static boolean isPalindromeLex(int freq[],int len)
 {
    int odd_count = 0;
    for(int i =0; i<MAX_CHAR; i++)
    {
        if(freq[i]%2!=0)
        {
            odd_count++;
        }
    }
    //even length
    if(len%2==0)
    {
        if(odd_count>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    //odd length
    if(odd_count!=1)
    {
        return false;
    }
    return true;
 }
 //function to find oddchar and remove its freq
 static String findOddString(int freq[])
 {
    String odd_str="";
    for(int i=0;i<MAX_CHAR;i++)
    {
        if(freq[i]%2!=0)
        {
            freq[i]--;
            odd_str+=(char)(i+'a');
            return odd_str;
        }
    }
    return odd_str;
 }
 //main lexicographical palindrome formation   
 static String LexPalindrome(String s)
 {
    int len = s.length();
    int freq[]=new int[MAX_CHAR];
    countfreq(s, freq, len);

    if(!isPalindromeLex(freq, len))
    {
        return "No Palindrome";
    }

    String odd=findOddString(freq);

    String front="", rear="";
    for(int i=0;i<MAX_CHAR;i++)
    {
        String temp="";
        if(freq[i]!=0)
        {
            char ch = (char)(i+'a');
            for(int j = 1;j<=freq[i]/2;j++)
            {
                temp=temp+ch;
            }
            front=front+temp;
            rear=temp+rear;
        }
        
    }

    return (front+odd+rear);
}
public static void main(String[] args) {
    String s = "malayalam";
    System.out.println("Lexicographical Palindrome: " + LexPalindrome(s));
}
}
