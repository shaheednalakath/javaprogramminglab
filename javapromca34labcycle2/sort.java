class sortstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        char[] charArray=str.toCharArray();
        int n=str.length();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(charArray[j]>charArray[j+1])
                {
                    char temp=charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                }
            }
        }
        System.out.println(charArray);

        }

    }
