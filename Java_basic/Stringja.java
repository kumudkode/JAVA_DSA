// // import java.util.Scanner;
// // import java.util.jar.Attributes.Name;
 public class Stringja{
   public static void main(String[] args) {
//         //lets learn string
       
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter Your name");

//         // String a = sc.nextLine();

//         // System.out.println("Name: " + a);
//         // System.out.println("Name: " + sc.next());
//         //sc.next() give only that string that are present before any space like kaska in dhaka so only kaska will print but in
//         //sc.nextLine() whole kaska in dhaka will print but it will not take any input after new line 

//         // methods
//         // 1. Length
//         String name = "Ishika";
//         int len = name.length();
//         System.out.println(len);

//         //2. charAt
//         System.out.println(name.charAt(3));

//         //3. concat
//         System.out.println("raj ".concat(name));
        
//         //4. Substring
//         System.out.println(" okay buddy".substring(6,9));
//         System.out.println(" okay johny".substring(6));

//         //5. indexOf
//         System.out.println(" we are looking ".indexOf("o"));

//         System.out.println(" we are looking ".indexOf("o",14));
//         //-1 is appear when any index will not exist.
        
        //6. String equal
        String a="aol";
        String b="b";
        String c="abc";
        String d="ola";
// a>b-> positive
// a<b-> negative  
// a=b-> 0           
// lexicographically means ASCii dictionary ka order src = "ishika ne bola"                                                                             
        // tum gyi
        System.out.println(b.compareTo(a)); // b bada h a se so b=98,a=97 => b-a=98-97=1
        System.out.println(a.compareTo(b)); // => a-b = 97-98 = -1
         System.out.println(a.compareTo(a)); // => 97-97 = 0
        System.out.println(a.compareTo(c)); // => 97 - 111 = -14 to yaha first character heee lega? KYA?
        System.out.println(a.compareTo(d));
        
        // yaha pe jab jab length string ki equal hoti h to lexicographically compare karta h otherwise
        // length ke basis pe karta h like aol = aolr => 3-4=-1 but aol = abc => 111-98=13 

        System.out.println();
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println("");
        System.out.println(a.equalsIgnoreCase(b));

//         //7. Contains:
        String str = " hello burother how do u do?";
        System.out.println(str.contains("burother"));

          //8. ToUppercase and ToLowercase 
           String stri = "feeling fresshhhhhhh ";
           System.out.println(stri.toUpperCase());
            System.out.println(stri.toLowerCase()); 
            // System.out.println(stri.toUpperCase("feeling")); // error
          
          // 9. Trim, Join and replace
          String ab="abc";
           String bc="a";
            String ca="b";
            String join=String.join("",ab,"",bc,"",ca);
            String join1=String.join("-",ab,"",bc,"",ca);
            String join2=String.join("/",ab,"",bc,"",ca);
            String join3=String.join("::",ab,"",bc,"",ca);
            String join4=String.join(ab,bc,ca);
            System.out.println(join+"\n"+join1+"\n"+join2+"\n"+join3+"\n"+join4);


  }
 }