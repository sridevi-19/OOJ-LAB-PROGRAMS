class Gen<T> {
     T ob;
     Gen(T o)
     {
       ob=o;
     } 
      T getob()
     {
        return ob;
      }
      void showType()
     {
         System.out.println("value of ob is"+" "+ob.getClass().getName());
       }
  }

   class gensamp{
          public static void main(String args[])
          {
                Gen<Integer> iob;
                Gen<String> ios; 
                 iob=new Gen<Integer>(100);//AutoBoxing
                  int v = iob.getob();//AutoUnBoxing
                    System.out.println("the value of v is"+" "+v);
                       iob.showType();
                    ios=new Gen<String>("BMSCE");
                      String v1 = ios.getob();
                      System.out.println("the value of v1 is"+" "+v1);
                        ios.showType();
            }
        }